import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.*;

public class AnalysisJavaListener extends JavaBaseListener {
    JavaParser parser;
    int complexidadeCiclomatica = 1;
    int aninhamentoMetodo = 0;
    int aninhamentoAtual = 0;
    int fanOut = 0;
    public AnalysisJavaListener(JavaParser parser) {this.parser = parser;}
    /** Listen to matches of classDeclaration */
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx){
        System.out.println("Classe "+ctx.Identifier());
    }
    
    /** Listen to matches of methodDeclaration */
    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
        System.out.println(" Metodo "+ ctx.Identifier());
        complexidadeCiclomatica = 1;
        aninhamentoMetodo = 0;
        aninhamentoAtual = 0;
        fanOut = 0;
    }

    @Override 
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("\t- Complexidade Ciclomatica: "+ complexidadeCiclomatica);
        System.out.println("\t- Nivel Aninhamento: "+ aninhamentoMetodo);
        System.out.println("\t- Fan Out: "+ fanOut);
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        if(ctx.getStart().getType() == parser.IF ||
            ctx.getStart().getType() == parser.FOR ||
            ctx.getStart().getType() == parser.DO || 
            ctx.getStart().getType() == parser.WHILE
            ){
            complexidadeCiclomatica++;
        }
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        //+1 para cada clausula catch
        complexidadeCiclomatica++;
    }

    @Override
    public void enterExpression(JavaParser.ExpressionContext ctx) {
        for (TerminalNode terminal : ctx.getTokens(parser.QUESTION)) {
            // +1 para cada if ternário
            complexidadeCiclomatica++;
        }

        for (TerminalNode terminal : ctx.getTokens(parser.LPAREN)) {
            /*Tentativa de obter o nome dos metodos. Quando o metodo chamado é somente o nome, exemplo: facaIsso(), funciona! Porém quando é classeX.facaY() não funciona.
            JavaParser.ExpressionContext exp = ctx.expression(0);
            TokenStream tokens = parser.getTokenStream();
            String teste = "nada";
            if ( exp.primary()!=null ) {
                teste = tokens.getText(exp.primary());
            }
            System.out.println(teste);
            */
            fanOut++;
        }
    } 
    
    @Override
    public void enterSwitchLabel(JavaParser.SwitchLabelContext ctx) {
        if(ctx.getStart().getType() == parser.CASE){
            complexidadeCiclomatica++;
        }
    }

    @Override 
    public void enterBlock(JavaParser.BlockContext ctx) {
        aninhamentoAtual ++;
        if (aninhamentoMetodo < aninhamentoAtual){
            aninhamentoMetodo = aninhamentoAtual;
        }
    }

    @Override
    public void exitBlock(JavaParser.BlockContext ctx) {
        aninhamentoAtual--;
    }
}
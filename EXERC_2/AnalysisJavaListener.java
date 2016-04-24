import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

public class AnalysisJavaListener extends JavaBaseListener {
    JavaParser parser;
    int complexidadeCiclomatica = 1;
    String teste="N";
    public AnalysisJavaListener(JavaParser parser) {this.parser = parser;}
    /** Listen to matches of classDeclaration */
    @Override
    public void enterClassDeclaration(JavaParser.ClassDeclarationContext ctx){
        //System.out.println("interface I"+ctx.Identifier()+" {");
    }
    @Override
    public void exitClassDeclaration(JavaParser.ClassDeclarationContext ctx) {
        //System.out.println("}");
    }

    /** Listen to matches of methodDeclaration */
    @Override
    public void enterMethodDeclaration(JavaParser.MethodDeclarationContext ctx){
        // need parser to get tokens
        /*TokenStream tokens = parser.getTokenStream();
        String type = "void";
        if ( ctx.type()!=null ) {
            type = tokens.getText(ctx.type());
        }
        String args = tokens.getText(ctx.formalParameters());
        System.out.println("\t"+type+" "+ctx.Identifier()+args+";");*/
        System.out.println("Metodo "+ ctx.Identifier());
        complexidadeCiclomatica = 1;
    }

    @Override 
    public void exitMethodDeclaration(JavaParser.MethodDeclarationContext ctx) {
        System.out.println("Complexidade Ciclomatica: "+ complexidadeCiclomatica);
        System.out.println("Tem catch "+ teste);
    }

    @Override
    public void enterStatement(JavaParser.StatementContext ctx) {
        //System.out.println("Statement --> "+ctx.getStart().getType());
        ///System.out.println("Statement --> "+ctx.getText());
        if(ctx.getStart().getType() == parser.IF ||
            ctx.getStart().getType() == parser.SWITCH ||
            ctx.getStart().getType() == parser.FOR ||
            ctx.getStart().getType() == parser.DO || 
            ctx.getStart().getType() == parser.WHILE
            ){
            //System.out.println("Encontrei um if");
            complexidadeCiclomatica++;
        }

        TokenStream tokens = parser.getTokenStream();
        //String teste = "N";
        /*if(!ctx.catchClause().isEmpty()) {
            teste = "S" + ctx.catchClause().size();
            complexidadeCiclomatica = complexidadeCiclomatica + 10;
        }*/
    }

    @Override
    public void enterCatchClause(JavaParser.CatchClauseContext ctx) {
        complexidadeCiclomatica++;
    }

}
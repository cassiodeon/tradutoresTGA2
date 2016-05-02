import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;

/**
Autores: Cássio Deon e Roger Calderini
**/

public class CalcDistanceSonda {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);

        exercicio1_sondaLexer lexer = new exercicio1_sondaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        exercicio1_sondaParser parser = new exercicio1_sondaParser(tokens);
        ParseTree tree = parser.instrucao(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        CalcDistanceSondaListener calcDistance = new CalcDistanceSondaListener(parser);
        walker.walk(calcDistance, tree); // initiate walk of tree with listener
    }
}
// Generated from exercicio1_sonda.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link exercicio1_sondaParser}.
 */
public interface exercicio1_sondaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link exercicio1_sondaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void enterInstrucao(exercicio1_sondaParser.InstrucaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio1_sondaParser#instrucao}.
	 * @param ctx the parse tree
	 */
	void exitInstrucao(exercicio1_sondaParser.InstrucaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio1_sondaParser#comando}.
	 * @param ctx the parse tree
	 */
	void enterComando(exercicio1_sondaParser.ComandoContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio1_sondaParser#comando}.
	 * @param ctx the parse tree
	 */
	void exitComando(exercicio1_sondaParser.ComandoContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio1_sondaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void enterCondicao(exercicio1_sondaParser.CondicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio1_sondaParser#condicao}.
	 * @param ctx the parse tree
	 */
	void exitCondicao(exercicio1_sondaParser.CondicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio1_sondaParser#basico}.
	 * @param ctx the parse tree
	 */
	void enterBasico(exercicio1_sondaParser.BasicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio1_sondaParser#basico}.
	 * @param ctx the parse tree
	 */
	void exitBasico(exercicio1_sondaParser.BasicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link exercicio1_sondaParser#distancia}.
	 * @param ctx the parse tree
	 */
	void enterDistancia(exercicio1_sondaParser.DistanciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link exercicio1_sondaParser#distancia}.
	 * @param ctx the parse tree
	 */
	void exitDistancia(exercicio1_sondaParser.DistanciaContext ctx);
}
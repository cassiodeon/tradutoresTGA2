import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

/**
Autores: Cássio Deon e Roger Calderini
**/

public class CalcDistanceSondaListener extends exercicio1_sondaBaseListener {
    exercicio1_sondaParser parser;
    Double distanciaTotalSonda;
    public CalcDistanceSondaListener(exercicio1_sondaParser parser) {
        this.parser = parser;
        distanciaTotalSonda = 0.0;
    }

    @Override
    public void enterDistancia(exercicio1_sondaParser.DistanciaContext ctx) {
        distanciaTotalSonda += Double.parseDouble(ctx.Numero().toString());
    }

    @Override
    public void exitInstrucao(exercicio1_sondaParser.InstrucaoContext ctx) {
        System.out.println("Distancia total percorrida: "+ distanciaTotalSonda.toString());
    }
}
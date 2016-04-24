import java.util.List;
import java.util.Map;
public class Demo {
	void f(int x, String y) { 
		try{
			if(x == 10){
				x = 20;
				if(y=="0"){
					y="1";
				}
			}

			for (int i = 0; i < x; i++) {
				x = (x < 3?0:1);
				//x = (x < 3?0:1);
			}

			int diaDaSemana = 1;
			switch (diaDaSemana) {
				case 1:
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda-feira");
					break;
				case 3:
					System.out.println("Terça-feira");
					break;
				case 4:
					System.out.println("Quarta-feira");
					break;
				case 5:
					System.out.println("Quinta-feira");
					break;
				case 6:
					System.out.println("Sexta-feira");
					break;
				default:
					System.out.println("Este não é um dia válido!");
			}

		}catch (NullPointerException nexc) {

		}catch(Exception e) { }
	}

	int[ ] g() { 
		return null; 
	}
	
	List<Map<String, Integer>>[] h() { 
		return null; 
	}

	void testeAninhamento2(int a, int b){

		if (a > 10) {
			h();
		}
		if (b < 5) {
			g();
		}
		while (a<b){
			f(a,"b");
		}
	}

	void testeAninhamento4(int a, int b){
		if (a > 10 ){
			h();
			if (b < 5){
				g();
				while (a<b){
					f(a,"b");
				}
			}
		}
	}
}
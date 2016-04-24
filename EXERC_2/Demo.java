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
}
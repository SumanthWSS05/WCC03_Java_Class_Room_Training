package arrays;

public class P2 {

	public static void main(String[] args) {
		
		String name = "Kalpana";
		String upper = "";
		
		char [ ] ch = name.toCharArray();
	
		for(char c : ch) {
			if(c>='A' & c<='Z') {
				upper+= c;
				
			}else {
				char up = (char)(c-32);   //a=97 => A=65
				upper+=up;				  //b=98 => B=66
			}
		}
		System.out.println(upper);
	}
}

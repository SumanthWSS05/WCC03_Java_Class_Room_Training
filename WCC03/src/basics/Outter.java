package basics;

class Outter {

	class Inner {		
		int a = 23;
		int b = 45;
		
		void dance() {
			System.out.println("From dance method");
		}
		
		void play() {
			System.out.println("from play method");
		}
	}
}

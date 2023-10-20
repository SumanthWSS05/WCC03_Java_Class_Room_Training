package childParent;

public abstract class Bye {

	public static Bye direct() {
		return new Hi();
	}
	
	public static Bye expression() {
		return new Hi();
	}
}

class Hi extends Bye {
	
}

class Run{
	public static void main(String[] args) {
		Bye ref = Bye.direct();
		Bye refff = ref.direct();
		ref.expression();
	}
}
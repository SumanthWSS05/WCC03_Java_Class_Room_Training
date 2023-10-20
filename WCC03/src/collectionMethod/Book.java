package collectionMethod;

public class Book implements Comparable {

	String name ;
	double cost ;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public Book(String name, double cost) {
		super();
		this.name = name;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", cost=" + cost + "]";
	}

	public int compareTo(Object o) {
		Book b = (Book)o;
		if(this.cost==b.cost)
			return 0;
		else if(this.cost > b.cost)
			return 1;
		else 
			return -1;
	}
}

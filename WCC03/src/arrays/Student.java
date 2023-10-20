package arrays;

public class Student implements Comparable { 

	int sId;
	String sName;
	
	public Student(int sId, String sName) {
		super();
		this.sId = sId;
		this.sName = sName;
	}

	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + "]";
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.sId==s.sId)
			return 0;
		else if(this.sId>s.sId)  
			return 1;
		else
			return -1;
	}
	
}

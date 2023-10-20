package collectionMethod;

public class Student implements Comparable{

	int sId;
	String sName;
	String sClass;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String sName, String sClass) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sClass = sClass;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sClass=" + sClass + "]";
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.sId==s.sId)
			return 0;
		else if(this.sId> s.sId)
			return 1;
		else
			return -1;
	}
	
}

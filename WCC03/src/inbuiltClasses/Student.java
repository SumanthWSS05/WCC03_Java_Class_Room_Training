package inbuiltClasses;

public class Student {

	int id;
	String name;
	String fatherName;
	String motherName;
	String schoolName;
	
	public Student(int id, String name, String fatherName, String motherName, String schoolName) {
		super();
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.schoolName = schoolName;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", schoolName=" + schoolName + "]";
	}
}

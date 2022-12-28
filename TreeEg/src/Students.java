
public class Students implements Comparable<Students> {
	int rollno;
	String name;
	int age;
	String gender;
	
	
	public Students(int rollno, String name, int age, String gender) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}

	public int compareTo(Students o) {
		
		return name.compareTo(o.name);
	}
	
	
	
}

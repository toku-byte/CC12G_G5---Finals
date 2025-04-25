package cc12finals_g5_libmansys;

public class User {
	private String name;
	private int age;
	private String course;
	private int yearlevel;
	private long contact;
	
	User() {
		name = "null";
		age = 0;
		course = "null";
		yearlevel = 0;
		contact = 0;
	}

	User(String newName, int newAge, String newCourse, int newYearlevel, long newContact) {
		this.name = newName;
		this.age = newAge;
		this.course = newCourse;
		this.yearlevel = newYearlevel;
		this.contact = newContact;
	}

	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getCourse() {
		return course;
	}
	
	public int getYearlevel() {
		return yearlevel;
	}
	
	public long getContact() {
		return contact;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public void setAge(int a) {
		if (a > 0) {
			age = a;
		}
		else {
			System.out.println("Invalid age");
		}
	}
	
	public void setCourse(String c) {
		course = c;
	}
	
	public void setYearlevel(int y) {
		yearlevel = y;
	}
	
	public void setContact(long c) {
		if (c > 0) {
			contact = c;
		}
		else {
			System.out.println("Invalid contact number");
		}
	}
}

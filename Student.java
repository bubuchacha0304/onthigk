package hocsinh;

public class Student {
	private String id;
	private String name;
	private int age;
	private double gpa;
	private String email;
	
	
	
	public Student(String id, String name, int age,double gpa,String email) {
		setId(id);
		setName(name);
		setAge(age);
		setGpa(gpa);
		setEmail(email);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if( id == null || id.trim().isEmpty() || id.length() != 8) {
			throw new IllegalArgumentException("ID phai du 8 ky tu va k duoc rong");
		}
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name == null || name.trim().isEmpty()) {
			throw new IllegalArgumentException("Name khong duoc trong!");
		}
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <= 16) {
			throw new IllegalArgumentException("Phai du 16 tuoi!");
		}
		this.age=age;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		if( gpa < 0.0 || gpa > 4.0) {
			throw new IllegalArgumentException("GPA [0-4] !");
		}
		this.gpa=gpa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email == null || !email.matches("^[^\\s@]+@[^\\s@]+$")) {
			throw new IllegalArgumentException("Email k hop le!");
		}
		this.email=email;
	}

	@Override
	public String toString() {
		return String.format("ID: %s| Ten: %s | Tuoi: %d| GPA: %.2f| Email: %s",
				id,name,age,gpa,email);
	}
	
	
	
}

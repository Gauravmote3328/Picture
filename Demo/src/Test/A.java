package Test;

public class A {

	public static void main(String[] args) {
		System.out.println("My Git Project");
		Student student = new Student();
		student.setId(1);
		student.setName("Gaurav");
		student.setAddress("Pune");

		System.out.println("Student Data :" + student);
	}

}

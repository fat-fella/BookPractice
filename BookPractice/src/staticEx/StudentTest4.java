package staticEx;

public class StudentTest4 {

	public static void main(String[] args) {
		Student2 studentLee = new Student2();
		studentLee.setStudentName("이상훈");
		System.out.println(Student2.getSerialNum());
		System.out.println(studentLee.studentID);
	}

}

package staticEx;

public class StudentTest1 {

	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.setStudentName("이상훈");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentName("손흥민");
		System.out.println(studentLee.serialNum);
		System.out.println(studentSon.serialNum);
		
	}

}

package arraylistPractice;

public class Student {
	private String studentId;
	private String studentName;
	
	public Student() {}
	public Student(String studentId, String studenName) {
		this.studentId=studentId;
		this.studentName=studenName;
	}
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void showStudentInfo() {
		System.out.println(studentId + "," + studentName);
	}
	
	
	
	
}

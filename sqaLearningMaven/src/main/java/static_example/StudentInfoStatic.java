package static_example;

public class StudentInfoStatic {
	static int  studentId;
	private String studentName;
	private int studentZip;
	
	
	public StudentInfoStatic(String studentName, int studentZip ){
		this.studentName = studentName;
		this.studentZip = studentZip;
		studentId++;
	}
	
//	public StudentInfoStatic(int studentId,String studentName, int studentZip ){
//		this.studentName = studentName;
//		this.studentZip = studentZip;
//		this.studentZip++;
//	}

	public static int getStudentId() {
		return studentId;
	}

	public static void setStudentId(int studentId) {
		StudentInfoStatic.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentZip() {
		return studentZip;
	}

	public void setStudentZip(int studentZip) {
		this.studentZip = studentZip;
	}
	
}

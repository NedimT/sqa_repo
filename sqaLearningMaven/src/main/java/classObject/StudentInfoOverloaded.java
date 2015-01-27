package classObject;

public class StudentInfoOverloaded {
	private int studentId;
	private String studentName;
	private int studentZip;
	
	public StudentInfoOverloaded() {
		this(15,"Lola", 94333);
			
	}
	
	public StudentInfoOverloaded(int sId, String sName){
		studentId = sId;
		studentName = sName;
	}
	
	public StudentInfoOverloaded(int sId, String sName, int sZip){
		studentId = sId;
		studentName = sName;
		studentZip = sZip;
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

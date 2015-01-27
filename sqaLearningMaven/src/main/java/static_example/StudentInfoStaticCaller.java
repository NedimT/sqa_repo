package static_example;

public class StudentInfoStaticCaller {
	public static void main(String args[]) {
			StudentInfoStatic obj1 = new StudentInfoStatic("jack",00000);
			System.out.println(" obj 1 id is "+StudentInfoStatic.studentId );
			System.out.println(" obj 1 Name is "+obj1.getStudentName()+" zip is "+obj1.getStudentZip() );

			StudentInfoStatic obj2 = new StudentInfoStatic("older",11111);
			System.out.println(" obj 2 id is "+StudentInfoStatic.studentId );
			System.out.println(" obj 2 Name is "+obj2.getStudentName()+" zip is "+obj2.getStudentZip() );

			StudentInfoStatic obj3 = new StudentInfoStatic("dodo",2222);
			System.out.println(" obj 3 id is "+StudentInfoStatic.studentId );
			System.out.println(" obj 3 Name is "+obj3.getStudentName()+" zip is "+obj3.getStudentZip() );

			StudentInfoStatic obj4 = new StudentInfoStatic("sam",33333);
			System.out.println(" obj 4 id is "+StudentInfoStatic.studentId );
			System.out.println(" obj 4 Name is "+obj4.getStudentName()+" zip is "+obj4.getStudentZip() );

			StudentInfoStatic obj5 = new StudentInfoStatic("miles",4444);
			System.out.println(" obj 5 id is "+StudentInfoStatic.studentId );
			System.out.println(" obj 5 Name is "+obj4.getStudentName()+" zip is "+obj5.getStudentZip() );
	
	}
		
}

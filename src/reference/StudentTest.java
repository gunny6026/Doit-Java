package reference;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student student = new Student();
	
		Subject math = new Subject();
		math.setScorePoint(90);
		math.setSubjectName("수학");
		student.setStudentId(1);
		student.setStudentName("박건희");


	}

}

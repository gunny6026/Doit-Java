package classpart;

public class Student {
	
	int studentId;
	String studentName;
	int grade;
	String address;

	public Student(String aa) {
		this.studentName = aa;
	}
	
	public String aaa() {
		
		return studentName;
	}
	
	public int bbb() {
		
		return studentId;
	}

	@Override
	public String toString() {
		return "Student : studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade + ", address="
			+ address + "";
	}
	
	
	
	

}

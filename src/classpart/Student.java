package classpart;

public class Student {
	
	int id;
	String name;
	String address;
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(String aa) {
		this.name = aa;
	}

	public Student() {
	}

	@Override
	public String toString() {
		return "학생정보:  id=" + id + ", name=" + name + " , address ="+address;
	}
	
//	public String aaa() {
//		
//		return name;
//	}
//	
//	public int bbb() {
//		
//		return id;
//	}

//	@Override
//	public String toString() {
//		return "Student : studentId=" + studentId + ", studentName=" + studentName + ", grade=" + grade + ", address="
//			+ address + "";
//	}
	
	
	
	

}

package thisExam;

class Person {
	
	String name;
	int age;
	
	public Person() {
		//this("박건오",23);
		this.name = "박건오";
		this.age = 23;
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	
}

public class CallAnotherConst {
	
	
	public static void main(String[] args) {
	
		Person p2 = new Person();
		System.out.println(p2.name);
	}

}

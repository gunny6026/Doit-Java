package cooperation;

public class TakeTrains {
	
	public static void main(String[] args) {
		Bus b1 = new Bus();
		b1.busNumber = 113;
		
		Bus b2 = new Bus();
		b2.busNumber =338;
		
		Student s1 = new Student("박건희",20000); // 박건희 돈 20000원
				s1.takeBus(b1); //113번 버스를 탔다.
			
		Student s2 = new Student("박건오",30000);
		s2.takeBus(b2);
		
		s2.takeBus(b1);
			
		// 버스를 먼저 생성하지 않으면 오류가 난다.. 왜??
		// 잘 모르겠지만 인스턴스가 생성되면 뭐 힙인가 스텍인지 쌓여서??
		
			
	}

}

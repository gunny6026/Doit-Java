package cooperation;

public class Student {
	
	public String studentName; // 학생 이름
	public int grade;  //학년
	public int money;  //학생이 가지고 있는 돈
	
	
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {
		System.out.println(bus.busNumber+"번 버스에 탑승 했습니다. 요금은 1000원입니다.");
		System.out.println(studentName+"님의 현재 잔액은" +money +"입니다");
		bus.take(1000);
		this.money -= 1000;
		System.out.println("요금을 지불 했습니다. 잔액은"+money+"원 남았습니다.");
		System.out.println(bus.busNumber+"번 버스의 수입은"+bus.income+"원 이고 승객은 "+bus.PassengerCount+"명 입니다.");
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -=1500;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은 "+ money+"원입니다.");
	}

	@Override
	public String toString() {
		return "Student 이름=" + studentName + ", 학년 =" + grade + ", 돈 =" + money + "";
	}
	
	
	

}

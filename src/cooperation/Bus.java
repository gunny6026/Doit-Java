package cooperation;

public class Bus {
	
	int busNumber;
	int income;
	int PassengerCount;
	
	
	
	
	
	public void take(int income) {
		this.income += income;
		PassengerCount ++;
		
	}
	
	public void showInfo() {
		System.out.println("버스" +busNumber+"의 수입은 " + income+"원이고 승객 수는" +PassengerCount+"명 입니다.");
		
	}

	@Override
	public String toString() {
		return "Bus [busNumber=" + busNumber + ", income=" + income + ", PassengerCount=" + PassengerCount + "]";
	}
	
	

}

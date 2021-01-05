package cooperation;

public class Subway {
	
	public int SubwayNumber;
	public int income;
	public int PassengerCount;
	
	
	public void take(int money) {
		
		this.income += money;
		PassengerCount++;
	}
	
	public void showInfo() {
		System.out.println("지하철 "+SubwayNumber+"번의 수입은" +income+"원이고 승객 수는 "+PassengerCount+"명입니다.");
		
		
	}

	@Override
	public String toString() {
		return "Subway SubwayNumber=" + SubwayNumber + ", income=" + income + ", PassengerCount=" + PassengerCount
				+ "]";
	}

	
}

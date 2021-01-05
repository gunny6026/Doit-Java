# 자신의 메모리를 가리키는 this

this는 생성된 인스턴스 스스로를 가리키는 예약어이다.

```
package thisExam;

public class Birthday {
	
	int day;
	int month;
	int year;
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
		//this는 생성된 인스턴스를 스스로 가리키는 예약어이다.
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void printThis() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		Birthday b1  = new Birthday();
		b1.setDay(200);
		System.out.println(b1);
		b1.printThis();
		
		Birthday b2 = new Birthday();
		System.out.println(b2);
		b2.printThis();
	}
	

}

```

참조변수인 b1 의 출력 값과  printThis()메서드를 호출하여 출력한 this 값과 같다.


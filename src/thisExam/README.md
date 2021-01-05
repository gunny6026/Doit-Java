# this 예약어

-----------------------------------------------------------------------------------

## 자신의 메모리를 가리키는 this

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


## 생성자에서 다른 생성자를 호출하는 this

```
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

```

![image](https://user-images.githubusercontent.com/66653324/103612219-4dc64f80-4f67-11eb-8ca3-643160c5da6e.png)

this를 사용해 클래스의 생성자에서 다른 생성자를 호출 할 수 있다.


## 자신의 주소를 반환하는 this

```
package thisExam;

class Person1{
	
	String name;
    int age;
	
    public Person1() {
    	this("이름없음",1);
    }
    
    public Person1(String name, int age) {
		this.name = name;
		this.age = age;
	}
    
    Person1 returnItSelf() {
    	return this;
    }
	
	
}

	public class CallAnotherCont {
		public static void main(String[] args) {
			Person1 noName = new Person1();
			System.out.println(noName.name);
			System.out.println(noName.age);
			System.out.println(noName);
			
			Person1 p =	noName.returnItSelf();
			System.out.println(p);
			System.out.println(p.age);
			System.out.println(noName);
		}
	}


```
![image](https://user-images.githubusercontent.com/66653324/103612355-9978f900-4f67-11eb-8e5f-14536b568ef8.png)

this를 사용하여 생성된 클래스 자신의 주소 값을 반환할 수 있다.


//다형성에 대한 예제


// super(상위) class 
class Employee {
	// 인스턴스 변수
	String no;
	String name;
	String initDay;

	// 생성자 메소드
	Employee() {

	}

	Employee(String no, String name, String initDay) {
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}

	//급여을 계산하다.
	public int payCheck() {
		return 0;
	}
	
	//사원의 기본정보를 콘솔에 출력하다.
	public void printEmployee() {
		System.out.printf("사번 : %s, 이름 : %s, 입사일자 : %s", no, name, initDay);
	}	

}

//Sub class (정규직 사원)

class Regular extends Employee {
	// 인스턴스 변수
	int pay;

	// 디폴트 생성자 메소드
	Regular() {
		// 상위 클래스의 디폴트 생성자 메소드 호출
		super();
	}

	// 매개변수 생성자 메소드
	Regular(String no, String name, String initDay, int pay) {
		// 상위 클래스의 매개변수 생성자 메소드 호출
		super(no, name, initDay);
		this.pay = pay;
	}

	// Method overriding(메소드 재정의)
	public int payCheck() {
		return pay;
	}
	
	//사원의 기본정보를 콘솔에 출력하다.
	//Method overriding
	public void printEmployee() {
		//System.out.printf("사번 : %s, 이름 : %s, 입사일자 : %s, 급여 : %,d원", no, name, initDay, pay);
		super.printEmployee();
		System.out.printf(", 급여 : %,d원", pay);
	}	

} // end of Regular class


//sub class (일용직 사원 클래스)
class Daily extends Employee {
	// 인스턴스 변수
	private int workday;
	private int dailyPay;

	// 디폴트 생성자 메소드
	Daily() {
		super();
	}

	// 매개변수 생성자 메소드
	Daily(String no, String name, String initDay, int workday, int dailyPay) {
		super(no, name, initDay);
		this.workday = workday;
		this.dailyPay = dailyPay;
	}
	
	//Method overriding
	public int payCheck() {
		return workday * dailyPay;
	}

	@Override
	public void printEmployee() {
		super.printEmployee();
		System.out.printf(", 근무일수 : %d, 일당급여 : %,d원", workday, dailyPay);
	}
	
}//end of Daily class


// sub class : 영업직 사원
class Sales extends Regular {
	//인스턴스 변수
	private int sales;
	private double commission;
	
	//디폴트 생성자 메소드
	Sales() {
		super();
	}
	
	//매개변수 생성자 메소드
	Sales(String no, String name, String initDay, int pay, int sales) {
		super(no, name, initDay, pay);
		this.sales = sales;
		setCommission();
	}
	
	//커미션을 설정하다.
	public void setCommission() {
		if (sales >= 10000000) {
			this.commission = 0.1;
		} else if (sales >= 5000000) {
			this.commission = 0.05;
		} else if (sales >= 2000000) {
			this.commission = 0.02;
		} else {
			this.commission = 0;
		}
	}	
}

public class Poly1 {
	
	  //정규직 사원의 기본 정보를 조회하여 출력한다.
	//public static void printRegular(Regular d) {
	      //  System.out.printf("급여  :  %,d원", d . payCheck());
			//d.printEmployee();
			//System.out.println();
		
		public static void printEmployee(Employee  emp) {
			System.out.printf("급여 : %,d원%n", emp.payCheck());
			emp.printEmployee();
			System.out.println();
			}
		
		
	public static void main(String[] args) {
		
		
		
		//업캐스팅
		Regular  emp = new Regular("R001", "일길동", "2022-01-01", 3000000);
		printEmployee(emp);
		
		Daily emp1 = new Daily("D001", "이길동", "2022-02-01",  20, 100000);
		 printEmployee(emp1);
		
		 
		 Sales emp2 = new Sales ("S001", "육길동", "2022-03-01",  400000, 2000000);
		 printEmployee(emp2);
		
	}

}

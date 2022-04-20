//�������� ���� ����


// super(����) class 
class Employee {
	// �ν��Ͻ� ����
	String no;
	String name;
	String initDay;

	// ������ �޼ҵ�
	Employee() {

	}

	Employee(String no, String name, String initDay) {
		this.no = no;
		this.name = name;
		this.initDay = initDay;
	}

	//�޿��� ����ϴ�.
	public int payCheck() {
		return 0;
	}
	
	//����� �⺻������ �ֿܼ� ����ϴ�.
	public void printEmployee() {
		System.out.printf("��� : %s, �̸� : %s, �Ի����� : %s", no, name, initDay);
	}	

}

//Sub class (������ ���)

class Regular extends Employee {
	// �ν��Ͻ� ����
	int pay;

	// ����Ʈ ������ �޼ҵ�
	Regular() {
		// ���� Ŭ������ ����Ʈ ������ �޼ҵ� ȣ��
		super();
	}

	// �Ű����� ������ �޼ҵ�
	Regular(String no, String name, String initDay, int pay) {
		// ���� Ŭ������ �Ű����� ������ �޼ҵ� ȣ��
		super(no, name, initDay);
		this.pay = pay;
	}

	// Method overriding(�޼ҵ� ������)
	public int payCheck() {
		return pay;
	}
	
	//����� �⺻������ �ֿܼ� ����ϴ�.
	//Method overriding
	public void printEmployee() {
		//System.out.printf("��� : %s, �̸� : %s, �Ի����� : %s, �޿� : %,d��", no, name, initDay, pay);
		super.printEmployee();
		System.out.printf(", �޿� : %,d��", pay);
	}	

} // end of Regular class


//sub class (�Ͽ��� ��� Ŭ����)
class Daily extends Employee {
	// �ν��Ͻ� ����
	private int workday;
	private int dailyPay;

	// ����Ʈ ������ �޼ҵ�
	Daily() {
		super();
	}

	// �Ű����� ������ �޼ҵ�
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
		System.out.printf(", �ٹ��ϼ� : %d, �ϴ�޿� : %,d��", workday, dailyPay);
	}
	
}//end of Daily class


// sub class : ������ ���
class Sales extends Regular {
	//�ν��Ͻ� ����
	private int sales;
	private double commission;
	
	//����Ʈ ������ �޼ҵ�
	Sales() {
		super();
	}
	
	//�Ű����� ������ �޼ҵ�
	Sales(String no, String name, String initDay, int pay, int sales) {
		super(no, name, initDay, pay);
		this.sales = sales;
		setCommission();
	}
	
	//Ŀ�̼��� �����ϴ�.
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
	
	  //������ ����� �⺻ ������ ��ȸ�Ͽ� ����Ѵ�.
	//public static void printRegular(Regular d) {
	      //  System.out.printf("�޿�  :  %,d��", d . payCheck());
			//d.printEmployee();
			//System.out.println();
		
		public static void printEmployee(Employee  emp) {
			System.out.printf("�޿� : %,d��%n", emp.payCheck());
			emp.printEmployee();
			System.out.println();
			}
		
		
	public static void main(String[] args) {
		
		
		
		//��ĳ����
		Regular  emp = new Regular("R001", "�ϱ浿", "2022-01-01", 3000000);
		printEmployee(emp);
		
		Daily emp1 = new Daily("D001", "�̱浿", "2022-02-01",  20, 100000);
		 printEmployee(emp1);
		
		 
		 Sales emp2 = new Sales ("S001", "���浿", "2022-03-01",  400000, 2000000);
		 printEmployee(emp2);
		
	}

}

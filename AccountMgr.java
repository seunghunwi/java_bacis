import java.util.Scanner;

public class AccountMgr {
	//Ŭ���� ����
	static Account[] accounts = new Account[100];
	static int index = 0;
	
	
	//�ܾ���ȸ�ϴ�.
	public static void 	retrieveBalance() {
		 Scanner scan = new Scanner(System.in);
			
			
		  System.out.println("���¹�ȣ:  ");
		  String accountNumber = scan.nextLine();
		  
		  Account account = fingAccountBYaccountNumber(accountNumber);
		  if (account ==  null){
		  System.out.println("���¹�ȣ�� ��Ȯ�� �Է����ּ���.");
			return;
		  }
	
		System.out.printf("�ܾ� : %,d��%n", account.getBalance());
    
		  
	}
	
	
	
	//����ϴ�
	public static void debit() {
           Scanner scan = new Scanner(System.in);
		
		
		  System.out.println("���¹�ȣ:  ");
		  String accountNumber = scan.nextLine();
		  Account account =  fingAccountBYaccountNumber(accountNumber);
			if (account == null) {
				System.out.println("���¹�ȣ�� ��Ȯ�� �Է����ּ���.");
				return;
			}
			
			System.out.println("�ݾ� : ");
			int amount = Integer.parseInt(scan.nextLine());
			account.withdraw(amount);
			
			System.out.println("����� �Ϸ�Ǿ����ϴ�.");

		}
		  
		
		
	
	
	//���¹�ȣ�� �ش��ϴ� �� ���¸� ��ȸ�ϴ�.
	
	public static Account  fingAccountBYaccountNumber(String ac) {
		for (int i = 0; i < index; i++) {
			if(accounts[i].getAccountNumber().equals (ac)	){
			                 
		           }
			}
		return null;
	}
	
	
	/*
	public static Account  fingAccountBYaccountNumber(String ac) {
		for (int i = 0; i < index; i++) {
			if(accounts[i].getAccountNumber().equals (ac)	){
			                         return i;
		           }
			}
		return -1;
	}
	*/
	//�Ա��ϴ�
	public static void creadit() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("���¹�ȣ:  ");
		String accountNumber = scan.nextLine();
		
		Account account =  fingAccountBYaccountNumber(accountNumber);
		if (account == null) {
			System.out.println("���¹�ȣ�� ��Ȯ�� �Է����ּ���.");
			return;
		}
		
		System.out.println("�ݾ� : ");
		int amount = Integer.parseInt(scan.nextLine());
		account.deposit(amount);
		
		System.out.println("�Ա��� �Ϸ�Ǿ����ϴ�.");

	}
		
	//��ü ���� ������ ��ȸ�ϴ�
	public static void retrieveAccounts() {
		for (int i = 0; i < index; i++) {
			        accounts[i].printAccount();
			        
		}
		
	}
	
	
	//���°����ϴ�
	public static void createAccount() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���¹�ȣ : ");
		String accountNumber = scan.nextLine();
		
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		
		System.out.print("��й�ȣ : ");
		String pwd = scan.nextLine();
		
		System.out.print("�ݾ� : ");
		int balance = Integer.parseInt(scan.nextLine());
		
		Account account = new Account(accountNumber, name, pwd, balance);
		accounts[index++] = account;
		
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean isExit = false;
		do {
			System.out.println("==== ���� ����� ���� �ý��� ====");
			System.out.println("1. ���°���");
			System.out.println("2. �Ա�");
			System.out.println("3. ���");
			System.out.println("4. �ܾ���ȸ");
			System.out.println("5. ��ü������ȸ");
			System.out.println("6. ����");
			System.out.print("�׸��� �����ϼ���. ");
			int menu = Integer.parseInt(scan.nextLine());
			switch (menu) {
				case 1: 
					//���°��� 
					createAccount();
					break;
				case 2: 
					//�Ա�
					 creadit();
					break;
				case 3: 
					//���
					debit();
					break;
				case 4: 
					//�ܾ���ȸ 
					retrieveBalance();
					break;
				case 5: 
					//��ü������ȸ 
					retrieveAccounts();
					break;
				case 6: isExit = true; break;
			}
				      
		} while (!isExit);
	}
}


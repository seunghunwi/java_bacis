import java.util.Scanner;

public class AccountMgr {
	//클래스 변수
	static Account[] accounts = new Account[100];
	static int index = 0;
	
	
	//잔액조회하다.
	public static void 	retrieveBalance() {
		 Scanner scan = new Scanner(System.in);
			
			
		  System.out.println("계좌번호:  ");
		  String accountNumber = scan.nextLine();
		  
		  Account account = fingAccountBYaccountNumber(accountNumber);
		  if (account ==  null){
		  System.out.println("계좌번호를 정확히 입력해주세요.");
			return;
		  }
	
		System.out.printf("잔액 : %,d원%n", account.getBalance());
    
		  
	}
	
	
	
	//출금하다
	public static void debit() {
           Scanner scan = new Scanner(System.in);
		
		
		  System.out.println("계좌번호:  ");
		  String accountNumber = scan.nextLine();
		  Account account =  fingAccountBYaccountNumber(accountNumber);
			if (account == null) {
				System.out.println("계좌번호를 정확히 입력해주세요.");
				return;
			}
			
			System.out.println("금액 : ");
			int amount = Integer.parseInt(scan.nextLine());
			account.withdraw(amount);
			
			System.out.println("출금이 완료되었습니다.");

		}
		  
		
		
	
	
	//계좌번호에 해당하는 고객 계좌를 조회하다.
	
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
	//입금하다
	public static void creadit() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("계좌번호:  ");
		String accountNumber = scan.nextLine();
		
		Account account =  fingAccountBYaccountNumber(accountNumber);
		if (account == null) {
			System.out.println("계좌번호를 정확히 입력해주세요.");
			return;
		}
		
		System.out.println("금액 : ");
		int amount = Integer.parseInt(scan.nextLine());
		account.deposit(amount);
		
		System.out.println("입금이 완료되었습니다.");

	}
		
	//전체 계좌 정보를 조회하다
	public static void retrieveAccounts() {
		for (int i = 0; i < index; i++) {
			        accounts[i].printAccount();
			        
		}
		
	}
	
	
	//계좌개설하다
	public static void createAccount() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		String accountNumber = scan.nextLine();
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("비밀번호 : ");
		String pwd = scan.nextLine();
		
		System.out.print("금액 : ");
		int balance = Integer.parseInt(scan.nextLine());
		
		Account account = new Account(accountNumber, name, pwd, balance);
		accounts[index++] = account;
		
	}
	
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		boolean isExit = false;
		do {
			System.out.println("==== 은행 입출금 관리 시스템 ====");
			System.out.println("1. 계좌개설");
			System.out.println("2. 입금");
			System.out.println("3. 출금");
			System.out.println("4. 잔액조회");
			System.out.println("5. 전체계좌조회");
			System.out.println("6. 종료");
			System.out.print("항목을 선택하세요. ");
			int menu = Integer.parseInt(scan.nextLine());
			switch (menu) {
				case 1: 
					//계좌개설 
					createAccount();
					break;
				case 2: 
					//입금
					 creadit();
					break;
				case 3: 
					//출금
					debit();
					break;
				case 4: 
					//잔액조회 
					retrieveBalance();
					break;
				case 5: 
					//전체계좌조회 
					retrieveAccounts();
					break;
				case 6: isExit = true; break;
			}
				      
		} while (!isExit);
	}
}


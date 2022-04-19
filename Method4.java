
public class Method4 {
	public  static Account createAccount() {
		Account account = new Account("1111", "일길동", "0000", 1000);
		return account;
		
		
	}

	public static void main(String[] args) {
		
	
		//계좌번호를 출력하시오. ( 계좌번호, 잔고)
		//메소드호출
		 Account temp = createAccount();
		 System.out.printf("계좌번호 : %s%n", temp.getAccountNumber());
		 System.out.printf("잔고 : %,d원%n", temp.getBalance());

	}

}

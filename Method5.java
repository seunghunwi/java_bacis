
public class Method5 {

	public static void main(String[] args) {
		
		//배열 선언 및 생성
		Account[ ] accounts = new Account[5];
		
		
		
		
		// 배열요소의 값 할당
		accounts[0]=new Account("1111", "일길동","0000", 1000);
		accounts[1]=new Account("2222", "이길동","0000", 1000);
		accounts[2]=new Account("3333", "삼길동","0000", 1000);
		accounts[3]=new Account("4444", "사길동","0000", 1000);
		accounts[4]=new Account("5555", "오길동","0000", 1000);
		
		//배열요소의 값 출력 (for문) : 계좌번호, 잔고
		for( int i=0; i<accounts.length; i++) {
			System.out.printf("계좌번호 : %s, 금액 : %,d%n" , accounts[ i ] .getAccountNumber() , accounts[ i ]. getBalance());
			
			
		}
		
	//배열요소의 값 출력 (enhanced ~ for문) : 계좌번호, 잔고
		for(Account a : accounts)  {
			System.out.printf("계좌번호 : %s, 금액 : %,d%n", a.getAccountNumber(), a.getBalance());
			
		}
		
	}

}

// 계좌를 구현한 클래스

class Account {
	//field
	//인스턴스 변수
	private String accountNumber;
	private String name;
	private String pwd;
	private int balance;
	
	//디폴트 생성자 메소드
	Account() {
		
	}
	
	//매개변수 생성자 메소드
	Account(String accoutNumber, String name, String pwd, int balance) {
		this.accountNumber = accoutNumber;
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	//인스턴스 메소드
	//잔액을 조회하다.
	int getBalance() {
		return this.balance;
	}
	
    //입금하다.
	void deposit(int amount) {
		this.balance += amount;   // this.balance = this.balance + amount;
	}
	
	//출금하다.
	void withdraw(int amount) {
		this.balance -= amount;   // this.balance = this.balance - amount;
	}
	
	//계좌이체하다.
	/*
	void transferAccount(Account account, int amount) {
		
	}
	*/
	
	//비밀번호를 변경하다.(setPwd)
	void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//비밀번호를 조회하다. (getPwd)
	String getPwd() {
		return this.pwd;
	}
	
	//계좌번호를 조회하다.
	public String getAccountNumber() {
		return accountNumber;
	}
	
}








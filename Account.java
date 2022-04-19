// ���¸� ������ Ŭ����

class Account {
	//field
	//�ν��Ͻ� ����
	private String accountNumber;
	private String name;
	private String pwd;
	private int balance;
	
	//����Ʈ ������ �޼ҵ�
	Account() {
		
	}
	
	//�Ű����� ������ �޼ҵ�
	Account(String accoutNumber, String name, String pwd, int balance) {
		this.accountNumber = accoutNumber;
		this.name = name;
		this.pwd = pwd;
		this.balance = balance;
	}
	
	//�ν��Ͻ� �޼ҵ�
	//�ܾ��� ��ȸ�ϴ�.
	int getBalance() {
		return this.balance;
	}
	
    //�Ա��ϴ�.
	void deposit(int amount) {
		this.balance += amount;   // this.balance = this.balance + amount;
	}
	
	//����ϴ�.
	void withdraw(int amount) {
		this.balance -= amount;   // this.balance = this.balance - amount;
	}
	
	//������ü�ϴ�.
	/*
	void transferAccount(Account account, int amount) {
		
	}
	*/
	
	//��й�ȣ�� �����ϴ�.(setPwd)
	void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	//��й�ȣ�� ��ȸ�ϴ�. (getPwd)
	String getPwd() {
		return this.pwd;
	}
	
	//���¹�ȣ�� ��ȸ�ϴ�.
	public String getAccountNumber() {
		return accountNumber;
	}
	
}









public class Method5 {

	public static void main(String[] args) {
		
		//�迭 ���� �� ����
		Account[ ] accounts = new Account[5];
		
		
		
		
		// �迭����� �� �Ҵ�
		accounts[0]=new Account("1111", "�ϱ浿","0000", 1000);
		accounts[1]=new Account("2222", "�̱浿","0000", 1000);
		accounts[2]=new Account("3333", "��浿","0000", 1000);
		accounts[3]=new Account("4444", "��浿","0000", 1000);
		accounts[4]=new Account("5555", "���浿","0000", 1000);
		
		//�迭����� �� ��� (for��) : ���¹�ȣ, �ܰ�
		for( int i=0; i<accounts.length; i++) {
			System.out.printf("���¹�ȣ : %s, �ݾ� : %,d%n" , accounts[ i ] .getAccountNumber() , accounts[ i ]. getBalance());
			
			
		}
		
	//�迭����� �� ��� (enhanced ~ for��) : ���¹�ȣ, �ܰ�
		for(Account a : accounts)  {
			System.out.printf("���¹�ȣ : %s, �ݾ� : %,d%n", a.getAccountNumber(), a.getBalance());
			
		}
		
	}

}

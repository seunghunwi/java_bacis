
public class Method4 {
	public  static Account createAccount() {
		Account account = new Account("1111", "�ϱ浿", "0000", 1000);
		return account;
		
		
	}

	public static void main(String[] args) {
		
	
		//���¹�ȣ�� ����Ͻÿ�. ( ���¹�ȣ, �ܰ�)
		//�޼ҵ�ȣ��
		 Account temp = createAccount();
		 System.out.printf("���¹�ȣ : %s%n", temp.getAccountNumber());
		 System.out.printf("�ܰ� : %,d��%n", temp.getBalance());

	}

}

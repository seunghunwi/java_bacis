
public class Method2 {

	public static void printAccount( Account temp ) {
		//���� ��������(���¹�ȣ, �ܰ�)�� �ֿܼ� ����Ѵ�.
		System.out.printf("���¹�ȣ  :  %s%n", temp.getAccountNumber());
		System.out.printf("wksrh : %,d��%n", temp.getBalance());
		}
	
	
	
	
	public static void main(String[  ] args)  {
		          Account obj1 = new Account("1111", "�ϱ浿", "0000", 1000);
		          //�޼ҵ� ȣ��
		          printAccount(obj1);
		          Account obj2 = new Account("2222", "�̱浿", "7777", 2000);
		          //�޼ҵ� ȣ��
		          
		          printAccount(obj1);
		          printAccount(obj2);
	}
}
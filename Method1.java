
public class Method1 {

	public static void main(String[] args) {
		// ���� �ν��Ͻ� ����
		Account  src  =  new Account("1111",  "ȫ�浿",  "1234", 1000 );
		
		Account temp  = src;
		
		System.out.	printf("src    :      %s,  temp     :      %s%n",   src ,   temp);
		
		temp.setPwd("0000");
		
		System.out.printf("����� ��й�ȣ :  %s%n", temp.getPwd());
		System.out.printf("����� ��й�ȣ :  %s%n", temp.getPwd());
		
		

	}

}

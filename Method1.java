
public class Method1 {

	public static void main(String[] args) {
		// 계좌 인스턴스 생성
		Account  src  =  new Account("1111",  "홍길동",  "1234", 1000 );
		
		Account temp  = src;
		
		System.out.	printf("src    :      %s,  temp     :      %s%n",   src ,   temp);
		
		temp.setPwd("0000");
		
		System.out.printf("변경된 비밀번호 :  %s%n", temp.getPwd());
		System.out.printf("변경된 비밀번호 :  %s%n", temp.getPwd());
		
		

	}

}

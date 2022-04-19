
public class Method2 {

	public static void printAccount( Account temp ) {
		//고객의 계좌정보(계좌번호, 잔고)를 콘솔에 출력한다.
		System.out.printf("계좌번호  :  %s%n", temp.getAccountNumber());
		System.out.printf("wksrh : %,d원%n", temp.getBalance());
		}
	
	
	
	
	public static void main(String[  ] args)  {
		          Account obj1 = new Account("1111", "일길동", "0000", 1000);
		          //메소드 호출
		          printAccount(obj1);
		          Account obj2 = new Account("2222", "이길동", "7777", 2000);
		          //메소드 호출
		          
		          printAccount(obj1);
		          printAccount(obj2);
	}
}
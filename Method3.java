
public class Method3 {
	
	//메소드 정의
	public static void printArray(int[]temp) {
		//배열 요소의 내용을 콘솔에 출력한다. ( for ~ each구문)
		for (int  temp1 : temp )			{
			System.out.printf ("%d\t", temp1);
		}
	}

	public static void main(String[] args) {
		
		  int[]  arr = {1, 5, 2, 6, 7};
		
		//메소드 호출
		  printArray(arr);
		 

	}

}


public class Method3 {
	
	//�޼ҵ� ����
	public static void printArray(int[]temp) {
		//�迭 ����� ������ �ֿܼ� ����Ѵ�. ( for ~ each����)
		for (int  temp1 : temp )			{
			System.out.printf ("%d\t", temp1);
		}
	}

	public static void main(String[] args) {
		
		  int[]  arr = {1, 5, 2, 6, 7};
		
		//�޼ҵ� ȣ��
		  printArray(arr);
		 

	}

}

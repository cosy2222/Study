package chap03;

public class OperatorEx05 {

	public static void main(String[] args) {
		
		// ���� ������ :     (����) ? ��  : ����
		int value1 = (3>5) ? 6 : 9;    // ������ �����̹Ƿ� value1�� 9�� �����
		System.out.println(value1);
		
		int value2 = (5>3) ? 10 : 20 ;  // ������ ���̹Ƿ� value2�� 10�� �����
		System.out.println(value2);
		
		int value3 = 5;
		System.out.println( (value3 % 2 == 0) ? "¦��" : "Ȧ��");
		System.out.println("=========================");
		
		//if ������ ó�� 
		if (value3 % 2 == 0) {
			System.out.println("¦��");   // ������ ���ϋ� ����Ǵ� ����
		}
		else {
			System.out.println("Ȧ��");   // ������ �����ϋ� ����Ǵ� ����
		}

	}

}

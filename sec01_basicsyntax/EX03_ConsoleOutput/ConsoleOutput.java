package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {

	public static void main(String[] args) {
		
		System.out.println("�ȳ��ϼ���");
		System.out.println("�ȳ�+�ϼ���");
		System.out.println(2 + 4);
		System.out.println(4.6);
		System.out.println("����" + 1);
		System.out.println("����" +1 +2);
		System.out.println(1 + 2 + "����");
		System.out.println();
		
		int a = 5;
		String b = "�ϼ���";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("�ȳ�"+b);
		System.out.println(a+"�ȳ�"+b);
		System.out.println();
		
		System.out.print("�ݰ�");
		System.out.print("���ϴ�");
		System.out.print("7");
		System.out.print("\n");
		System.out.print("\n");
		
		System.out.printf("%d\n" , 10);
		System.out.printf("%o\n", 10);
		System.out.printf("%x\n", 10);
		System.out.printf("%s\n" , "���ڿ� ���");
		System.out.printf("%f\n", 3.2582);
		System.out.printf("%4.2f\n" , 3.2582);
		System.out.printf("%d�� %4.2f" , 10 , 3.2582);
		

	}

}

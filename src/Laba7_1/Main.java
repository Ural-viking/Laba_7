package Laba7_1;

/*   �������� ���������, � ������� ���� ���������� � ��������� ��������� �����,
������������� � ��������� ���������� � ��� ������������� ����� toString (). 
�� ������ ����������� ����� ������������ ��������� ��������. 
� ���� ���������� ��� ���� ��������� ��������� ����. 
����� �������� ������ ����� ������ ������������ � ����� � ����� ���������� �����������, 
� ��� � ��� ������ ���� ������������� ����� toString ().
� ����� ������� ����� toString () ���������������� ���, ��� �� ���������� ������ �
��������� ������ � �������� ���������� ���� ��� ��������� �����. */

public class Main {
	public static void main(String[] args) {
			superClassTest superClassObject = new superClassTest("������� � ����������� �����������");
			String className = superClassObject.toString();
			System.out.println(className);
			subClassTest subClassObject1 = new subClassTest("������� � ����������� ���������");
			String subClassName = subClassObject1.toString();
			System.out.println(subClassName);
			subClassTest subClassObject2 = new subClassTest("������� � ����������� ���������", "��� ��� ���������");
			String subClassName2 = subClassObject2.toString();
			System.out.println(subClassName2);
	}
}

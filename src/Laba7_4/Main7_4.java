package Laba7_4;

/*  �������� ���������, � ������� ������������ ������� ������������ �� ���� �������. 
 *  � ������ ������ ���� �������� ���������� ����. 
 *  �� ������ ������ ���������� �������� ��������� ����.
 *  � ������� ������ ���������� �������� ������������� ����.
 *  � ������ �� ������� ������ ���� �����������, ����������� ��������� ������ �� ������
�������� �����, ���������� ����������� ������������, � ����� ����������� �������� �����. */

public class Main7_4 {

	public static void main(String[] args) {
// �������� ������� �����������
		superClass7_4 objA = new superClass7_4('A');
		// ������� ����� �����������
		superClass7_4 objA_copy = objA;
		// ��������� �������� �����
		objA.whatIsInside();
		objA_copy.whatIsInside();
		
// �������� ������� ��������� 1
		subOne7_4 objB = new subOne7_4('A', "TEXT");
		// ������� ����� ��������� 1
		subOne7_4 objB_copy = objB;
		// ��������� �������� �����
		objB.whatIsInside();
		objB_copy.whatIsInside();
		// ������� ���������� ���� ���������
		objA = objB;
		// �������� �������� �����
		objA.whatIsInside();
		
// �������� ������� ��������� 2
		subTwo7_4 objC = new subTwo7_4('A', "TEXT", 15);
		// ������� ����� ��������� 2
		subTwo7_4 objC_copy = objC;
		// ��������� �������� �����
		objC.whatIsInside();
		objC_copy.whatIsInside();
		
		objA = objC;
		objB = objC;
		// �������� �������� �����
		objA.whatIsInside();
		objB.whatIsInside();
	}
}
package Laba7_4;

public class superClass7_4 {
	// � ������ ������ ���� �������� ���������� ����.
	public char charPole;
	
	
	public void whatIsInside() {
		System.out.println("superClass. �������� �����: " + charPole);
	}
	// � ������ �� ������� ������ ���� �����������, ����������� ��������� ������ �� ������ �������� �����, ���������� ����������� ������������
	superClass7_4(char a){
		charPole = a;
	}
	// � ����� ����������� �������� �����.
	superClass7_4(superClass7_4 obj){
		charPole = obj.charPole;
	}
}

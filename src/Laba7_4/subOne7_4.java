package Laba7_4;

public class subOne7_4 extends superClass7_4 {
	// �� ������ ������ ���������� �������� ��������� ����.
	public String stringPole;
	
	@Override
	public void whatIsInside() {
		System.out.println("subClass1. �������� �����: " + charPole + " " + stringPole);
	}
	// � ������ �� ������� ������ ���� �����������, ����������� ��������� ������ �� ������ �������� �����, ���������� ����������� ������������
	subOne7_4(char a, String stringA){
		super(a);
		this.stringPole = stringA;
	}
	// � ����� ����������� �������� �����.
	subOne7_4(subOne7_4 obj){
		this(obj.charPole, obj.stringPole);
	}
}
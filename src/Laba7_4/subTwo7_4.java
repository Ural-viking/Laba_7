package Laba7_4;

public class subTwo7_4 extends subOne7_4 {
	// � ������� ������ ���������� �������� ������������� ����.
	public int intPole;
	
	@Override
	public void whatIsInside() {
		System.out.println("subClass2. �������� �����: " + charPole + " " + stringPole + " " + intPole);
	}
	// � ������ �� ������� ������ ���� �����������, ����������� ��������� ������ �� ������ �������� �����, ���������� ����������� ������������
	subTwo7_4(char a, String stringA, int intA){
	super(a, stringA);
	this.intPole = intA;
	}
	// � ����� ����������� �������� �����.
	subTwo7_4(subTwo7_4 obj){
		this(obj.charPole,obj.stringPole,obj.intPole);
	}
}
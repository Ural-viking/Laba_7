package Laba7_5;

public class subOne7_5 extends superClass7_5 {
	// � ����� �� ������� ���������� ���������� ������������� ����
	private int intPole;
	// ��� ���� ����������� � ����� �����������
	subOne7_5( String text, int number){
		super(text);
		this.intPole = number;
	}
	// � ������������� ����� ��� ����������� �������� ����� ������� � �������� ������
	@Override
	public String toString() {
		String classNameAndFields2;
		classNameAndFields2 = "��� " +  this.getClass().getSimpleName() + "\n" + 
		"�������� ���������� ���� " + this.getStrPole() + "\n" + 
		"�������� �������������� ���� " + this.intPole;
		return classNameAndFields2;
	}
}
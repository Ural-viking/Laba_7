package Laba7_5;

public class subTwo7_5 extends superClass7_5 {
	// �� ������ ��������� ���������� ���������� ���������� ����
	private char charPole;
	// ����������� � ����� �����������
	subTwo7_5( String text, char symbol){
		super(text);
		this.charPole = symbol;
	}
	// � ������������� �����, ������������ � ������� �������� ������ � �������� �����
	@Override
	public String toString() {
		String classNameAndFields3;
		classNameAndFields3 = "��� " +  this.getClass().getSimpleName() + "\n" + 
		"�������� ���������� ���� " + this.getStrPole() + "\n" + 
		"�������� ����������� ���� " + this.charPole;
		return classNameAndFields3;
	}
}
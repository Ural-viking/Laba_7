package Laba7_3;

public class subOne7_3 extends superClass7_3 {
	// �� ������ ������ ���������� �������� ���������� ����
	public char charPole;
	// ����� � ����� ����������� ��� ������������ �������� ����� (���������� ������ �� �����������)
	public void Metod7_3(int num, char sym) {
		this.intPole = num;
		this.charPole = sym;
	}
	// � ����������� � ����� �����������
	subOne7_3(int number, char symbol){
		super(number);
		this.charPole = symbol;
	}
	// ��� ������� ������ ���������� ����� toString () ���, ����� �� ��������� ������ � ��������� ������ � ���������� ���� ����� �������
	@Override
	public String toString () {
		String subOneClassNameAndFields;
		subOneClassNameAndFields = "��� " +  this.getClass().getSimpleName() + "\n" 
		+ "�������� �������������� ���� " + this.intPole + "\n" 
		+ "�������� ����������� ���� " + this.charPole ;
		return subOneClassNameAndFields;
	}
}
package Laba7_3;

public class subTwo7_3 extends subOne7_3 {
	// � ������� ������ ���������� �������� ��������� ����
	public String strPole;
	// ����� � ����� ����������� ��� ������������ �������� ����� (���������� ������ �� �����������)
	public void Metod7_3 (int num, char sym, String str) {
		this.intPole = num;
		this.charPole = sym;
		this.strPole = str;
	}
	// � ����������� � ����� �����������
	subTwo7_3 (int number, char symbol, String text){
		super(number, symbol);
		this.strPole = text;
	}
	// ��� ������� ������ ���������� ����� toString () ���, ����� �� ��������� ������ � ��������� ������ � ���������� ���� ����� �������
	@Override
	public String toString () {
		String subTwoClassNameAndFields;
		subTwoClassNameAndFields = "��� " +  this.getClass().getSimpleName() + "\n" 
		+ "�������� �������������� ���� " + this.intPole + "\n" 
		+ "�������� ����������� ���� " + this.charPole + "\n" 
		+ "�������� ���������� ���� " + this.strPole;
		return subTwoClassNameAndFields;
	}
}
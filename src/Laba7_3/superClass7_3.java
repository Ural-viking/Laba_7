package Laba7_3;

public class superClass7_3 {
	// � ������ ����������� ���� �������� ������������� ����
	public int intPole;
	// ����� � ����� ���������� ��� ������������ �������� ����
	public void Metod7_3 (int num) {
		this.intPole = num;
	}
	// � ����������� � ����� ����������
	superClass7_3 ( int number){
		this.intPole = number;
	}
	// ��� ������� ������ ���������� ����� toString () ���, ����� �� ��������� ������ � ��������� ������ � ���������� ���� ����� �������
	@Override
	public String toString () {
		String classNameAndFields;
		classNameAndFields = "��� " +  this.getClass().getSimpleName() + "\n" + "�������� �������������� ���� " + this.intPole ;
		return classNameAndFields;
	}
}
package Laba7_5;

public class superClass7_5 {
	// ���� ���������� � ���������� ��������� �����
	private String strPole;
	// ����������� � ��������� ����������
	superClass7_5 (String text){
		this.strPole = text;
	}
	// � �����, ��� ������ �������� � ���������� ���� ������������ �������� ������ � �������� ����
	@Override
	public String toString() {
		String classNameAndFields1;
		classNameAndFields1 = "��� " +  this.getClass().getSimpleName() + "\n" + "�������� ���������� ���� " + this.getStrPole() ;
		return classNameAndFields1;
	}
	public String getStrPole() {
		return strPole;
	}
	public void setStrPole(String strPole) {
		this.strPole = strPole;
	}
}
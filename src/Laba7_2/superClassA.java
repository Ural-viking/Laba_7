package Laba7_2;

public class superClassA {
	// ���� ���������� � ��������� ��������� �����.
	private String poleStr;
	// � ������� ������ ������ ���� ����� ��� ������������ �������� ����:
	// ��� ����������
	superClassA(){
	}
	// � � ����� ��������� ����������.
	superClassA(String str1) {
		this.poleStr = str1;
	}
	// ��������� ������ ��� ������ �������� ����������� ���������� ����� ��������� ������.
	
	public String Metod() {
		Integer simbols = poleStr.length();   // ������� ����� ������
		String strAndLength;
		strAndLength = "superclass" + "\n" + "������: " + this.getPole1() + "\n" + " ���������� �������� � ������: " + simbols ;
		return strAndLength;
	}
	public String getPole1 () {
		return poleStr;
	}
	public void setPole1 (String poleStr) {
		this.poleStr = poleStr;
	}
}
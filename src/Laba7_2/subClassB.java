package Laba7_2;
// �� ������ ����������� ��������� ��������.
public class subClassB extends superClassA {
	// � ��������� ���������� �������������� �������� ������������� ����.
	public Integer poleNum;
	// � ������ ������ ���� ����� ������ ������ ��� ������������ �������� ����� (������������ ��������������� � ���������� ������ �� �����������):
	// ��� ����������
	subClassB(){
	}
	// � ��������� ����������
	subClassB( String str1){
		super(str1);
	}
	// � ������������� ����������
	subClassB( Integer num){
		this.poleNum = num;
	}
	// � ��������� � ������������� ����������
	subClassB(String str1, Integer num){
		super(str1);
		this.poleNum =num;
	}
	
	@Override
	public String Metod() {
		String strLengthAndNum;
		Integer simbols2 = getPole1().length();
		strLengthAndNum = "subclass" + "\n" + "������: " + this.getPole1() + "\n" + " ���������� �������� � ������: " + simbols2 ;
		return strLengthAndNum;
	}
	

}

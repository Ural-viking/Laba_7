package Laba7_5;

public class superClass7_5 {
	// есть суперкласс с защищенным текстовым полем
	private String strPole;
	// конструктор с текстовым параметром
	superClass7_5 (String text){
		this.strPole = text;
	}
	// и метод, при вызове которого в консольном окне отображается название класса и значение поля
	@Override
	public String toString() {
		String classNameAndFields1;
		classNameAndFields1 = "Это " +  this.getClass().getSimpleName() + "\n" + "значение текстового поля " + this.getStrPole() ;
		return classNameAndFields1;
	}
	public String getStrPole() {
		return strPole;
	}
	public void setStrPole(String strPole) {
		this.strPole = strPole;
	}
}
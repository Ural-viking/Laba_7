package Laba7_5;

public class subOne7_5 extends superClass7_5 {
	// В одном из классов появляется защищенное целочисленное поле
	private int intPole;
	// там есть конструктор с двумя параметрами
	subOne7_5( String text, int number){
		super(text);
		this.intPole = number;
	}
	// и переопределен метод для отображения значений полей объекта и названия класса
	@Override
	public String toString() {
		String classNameAndFields2;
		classNameAndFields2 = "Это " +  this.getClass().getSimpleName() + "\n" + 
		"значение текстового поля " + this.getStrPole() + "\n" + 
		"значение целочисленного поля " + this.intPole;
		return classNameAndFields2;
	}
}
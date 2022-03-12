package Laba7_3;

public class subTwo7_3 extends subOne7_3 {
	// В третьем классе появляется открытое текстовое ноле
	public String strPole;
	// метод с тремя аргументами для присваивания значений полям (перегрузка метода из суперкласса)
	public void Metod7_3 (int num, char sym, String str) {
		this.intPole = num;
		this.charPole = sym;
		this.strPole = str;
	}
	// и конструктор с тремя параметрами
	subTwo7_3 (int number, char symbol, String text){
		super(number, symbol);
		this.strPole = text;
	}
	// Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта
	@Override
	public String toString () {
		String subTwoClassNameAndFields;
		subTwoClassNameAndFields = "Это " +  this.getClass().getSimpleName() + "\n" 
		+ "значение целочисленного поля " + this.intPole + "\n" 
		+ "значение символьного поля " + this.charPole + "\n" 
		+ "значение текстового поля " + this.strPole;
		return subTwoClassNameAndFields;
	}
}
package Laba7_3;

public class subOne7_3 extends superClass7_3 {
	// Во втором классе появляется открытое символьное поле
	public char charPole;
	// метод с двумя параметрами для присваивания значения полям (перегрузка метода из суперкласса)
	public void Metod7_3(int num, char sym) {
		this.intPole = num;
		this.charPole = sym;
	}
	// и конструктор с двумя параметрами
	subOne7_3(int number, char symbol){
		super(number);
		this.charPole = symbol;
	}
	// Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта
	@Override
	public String toString () {
		String subOneClassNameAndFields;
		subOneClassNameAndFields = "Это " +  this.getClass().getSimpleName() + "\n" 
		+ "значение целочисленного поля " + this.intPole + "\n" 
		+ "значение символьного поля " + this.charPole ;
		return subOneClassNameAndFields;
	}
}
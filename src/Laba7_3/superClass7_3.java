package Laba7_3;

public class superClass7_3 {
	// В первом суперклассе есть открытое целочисленное поле
	public int intPole;
	// метод с одним параметром для присваивания значения полю
	public void Metod7_3 (int num) {
		this.intPole = num;
	}
	// и конструктор с одним параметром
	superClass7_3 ( int number){
		this.intPole = number;
	}
	// Для каждого класса определите метод toString () так, чтобы он возвращал строку с названием класса и значениями всех полей объекта
	@Override
	public String toString () {
		String classNameAndFields;
		classNameAndFields = "Это " +  this.getClass().getSimpleName() + "\n" + "значение целочисленного поля " + this.intPole ;
		return classNameAndFields;
	}
}
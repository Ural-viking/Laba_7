package Laba7_5;

public class subTwo7_5 extends superClass7_5 {
	// Во втором подклассе появляется защищенное символьное поле
	private char charPole;
	// конструктор с двумя параметрами
	subTwo7_5( String text, char symbol){
		super(text);
		this.charPole = symbol;
	}
	// и переопределен метод, отображающий в консоли название класса и значения полей
	@Override
	public String toString() {
		String classNameAndFields3;
		classNameAndFields3 = "Это " +  this.getClass().getSimpleName() + "\n" + 
		"значение текстового поля " + this.getStrPole() + "\n" + 
		"значение символьного поля " + this.charPole;
		return classNameAndFields3;
	}
}
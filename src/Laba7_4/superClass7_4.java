package Laba7_4;

public class superClass7_4 {
	// В первом классе есть открытое символьное поле.
	public char charPole;
	
	
	public void whatIsInside() {
		System.out.println("superClass. Значение полей: " + charPole);
	}
	// В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей, переданных аргументами конструктору
	superClass7_4(char a){
		charPole = a;
	}
	// а также конструктор создания копии.
	superClass7_4(superClass7_4 obj){
		charPole = obj.charPole;
	}
}

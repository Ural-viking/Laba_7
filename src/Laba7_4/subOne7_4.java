package Laba7_4;

public class subOne7_4 extends superClass7_4 {
	// ¬о втором классе по€вл€етс€ открытое текстовое поле.
	public String stringPole;
	
	@Override
	public void whatIsInside() {
		System.out.println("subClass1. «начение полей: " + charPole + " " + stringPole);
	}
	// ¬ каждом из классов должен быть конструктор, позвол€ющий создавать объект на основе значений полей, переданных аргументами конструктору
	subOne7_4(char a, String stringA){
		super(a);
		this.stringPole = stringA;
	}
	// а также конструктор создани€ копии.
	subOne7_4(subOne7_4 obj){
		this(obj.charPole, obj.stringPole);
	}
}
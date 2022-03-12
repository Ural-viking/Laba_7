package Laba7_4;

public class subTwo7_4 extends subOne7_4 {
	// ¬ третьем классе по€вл€етс€ открытое целочисленное поле.
	public int intPole;
	
	@Override
	public void whatIsInside() {
		System.out.println("subClass2. «начение полей: " + charPole + " " + stringPole + " " + intPole);
	}
	// ¬ каждом из классов должен быть конструктор, позвол€ющий создавать объект на основе значений полей, переданных аргументами конструктору
	subTwo7_4(char a, String stringA, int intA){
	super(a, stringA);
	this.intPole = intA;
	}
	// а также конструктор создани€ копии.
	subTwo7_4(subTwo7_4 obj){
		this(obj.charPole,obj.stringPole,obj.intPole);
	}
}
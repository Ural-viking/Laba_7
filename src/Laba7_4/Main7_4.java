package Laba7_4;

/*  Напишите программу, в которой использована цепочка наследования из трех классов. 
 *  В первом классе есть открытое символьное поле. 
 *  Во втором классе появляется открытое текстовое поле.
 *  В третьем классе появляется открытое целочисленное поле.
 *  В каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания копии. */

public class Main7_4 {

	public static void main(String[] args) {
// создание обьекта суперкласса
		superClass7_4 objA = new superClass7_4('A');
		// создаем копию суперкласса
		superClass7_4 objA_copy = objA;
		// проверяем значения полей
		objA.whatIsInside();
		objA_copy.whatIsInside();
		
// создание обьекта подкласса 1
		subOne7_4 objB = new subOne7_4('A', "TEXT");
		// создаем копию подкласса 1
		subOne7_4 objB_copy = objB;
		// проверяем значения полей
		objB.whatIsInside();
		objB_copy.whatIsInside();
		// сделаем суперкласс вида подкласса
		objA = objB;
		// проверим значения полей
		objA.whatIsInside();
		
// создание обьекта подкласса 2
		subTwo7_4 objC = new subTwo7_4('A', "TEXT", 15);
		// создаем копию подкласса 2
		subTwo7_4 objC_copy = objC;
		// проверяем значения полей
		objC.whatIsInside();
		objC_copy.whatIsInside();
		
		objA = objC;
		objB = objC;
		// проверим значения полей
		objA.whatIsInside();
		objB.whatIsInside();
	}
}
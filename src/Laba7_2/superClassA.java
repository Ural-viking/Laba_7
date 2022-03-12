package Laba7_2;

public class superClassA {
	// Есть суперкласс с приватным текстовым полем.
	private String poleStr;
	// В базовом классе должен быть метод для присваивания значения полю:
	// без параметров
	superClassA(){
	}
	// и с одним текстовым параметром.
	superClassA(String str1) {
		this.poleStr = str1;
	}
	// Доступное только для чтения свойство результатом возвращает длину текстовой строки.
	
	public String Metod() {
		Integer simbols = poleStr.length();   // считает длину строки
		String strAndLength;
		strAndLength = "superclass" + "\n" + "строка: " + this.getPole1() + "\n" + " количество символов в строке: " + simbols ;
		return strAndLength;
	}
	public String getPole1 () {
		return poleStr;
	}
	public void setPole1 (String poleStr) {
		this.poleStr = poleStr;
	}
}
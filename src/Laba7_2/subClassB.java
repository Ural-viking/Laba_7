package Laba7_2;
// На основе суперкласса создается подкласс.
public class subClassB extends superClassA {
	// В подклассе появляется дополнительное открытое целочисленное поле.
	public Integer poleNum;
	// В классе должны быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из суперкласса):
	// без параметров
	subClassB(){
	}
	// с текстовым параметром
	subClassB( String str1){
		super(str1);
	}
	// с целочисленным параметром
	subClassB( Integer num){
		this.poleNum = num;
	}
	// с текстовым и целочисленным параметром
	subClassB(String str1, Integer num){
		super(str1);
		this.poleNum =num;
	}
	
	@Override
	public String Metod() {
		String strLengthAndNum;
		Integer simbols2 = getPole1().length();
		strLengthAndNum = "subclass" + "\n" + "строка: " + this.getPole1() + "\n" + " количество символов в строке: " + simbols2 ;
		return strLengthAndNum;
	}
	

}

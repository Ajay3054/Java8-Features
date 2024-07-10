package Opentional;



public class OptionalClass {

	public static void main(String[] args) {
		Cat myCat =findCatName("Fred");
		System.out.println(myCat.getAge());
	}
	
	private static Cat findCatName(String name) {
		Cat cat = new Cat(name , 3);
		return cat;
	}
}

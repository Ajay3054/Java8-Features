package Lambda;

public class Lambdas {
	
	static void prinThing(Printable thing) {
		thing.print("..!");
	}

	public static void main(String[] args) {
		
		Printable lambdaPrintable = (s)-> {
		return	("Meow." + s);
		};
		
		prinThing(lambdaPrintable);
		
		
		
	}
}

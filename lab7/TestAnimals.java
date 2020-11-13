package lab7;


public class TestAnimals {
	public static void main (String [] args) {
		Animal a = new Animal();
		Animal b = new Cavalo(); // Animal ref, but a Horse object
		a.eat(); // Runs the Animal version of eat()
		b.eat(); // Runs the Horse version of eat()
	}
}

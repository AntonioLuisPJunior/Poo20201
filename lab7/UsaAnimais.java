package lab7;

public class UsaAnimais {

	public void doStuff(Animal a) {
		System.out.println("In the Animal version");
	}

	public void doStuff(Cavalo c) {
		System.out.println("In the Horse version");
	}

	public static void main (String [] args) {
		UsaAnimais ua = new UsaAnimais();
		Animal objAnimal = new Animal();
		Cavalo objCavalo = new Cavalo();
		ua.doStuff(objAnimal);
		ua.doStuff(objCavalo);
		Animal refAnimalParaCavalo = new Cavalo();
		ua.doStuff(refAnimalParaCavalo);
		
	}


}
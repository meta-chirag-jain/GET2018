package GET2018.com.metacube.SCF.Assignment8;

public class Lion extends Mammal{

	String nativeFrom;
    
    Lion(int animalID, int age, String animalName, String nativeFrom)
    {
        this.id = animalID;
        this.name = animalName;
        this.age = age;
        this.numberOfLegs = 4;
        this.nativeFrom = nativeFrom;
		this.sound = "Roar";
		this.species = AnimalCategory.MAMMAL;
    }

}

package GET2018.com.metacube.SCF.Assignment8;

public class Crocodile extends Reptile {

	String crocodileType;
	
	Crocodile(int animalID, int age, String animalName, String crocodileType)
    {
        this.id = animalID;
        this.name = animalName;
        this.age = age;
        this.isDangerous = true;
        this.crocodileType = crocodileType;
		this.sound = "Grunts";
		this.species = AnimalCategory.REPTILE;
    }
}

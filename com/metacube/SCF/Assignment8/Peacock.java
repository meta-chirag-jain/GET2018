package GET2018.com.metacube.SCF.Assignment8;

public class Peacock extends Bird {
	
	int wingSpan;
    
    public Peacock(int animalID, String animalName, int age, int wingSpan)
    {
        this.id = animalID;
        this.name = animalName;
        this.age = age;
        this.canFly = true;
        this.wingSpan = wingSpan;
        this.sound = "Peehu";
        this.species = AnimalCategory.BIRD;
    }
	
}

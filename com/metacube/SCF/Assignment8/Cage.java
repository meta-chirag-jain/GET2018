package GET2018.com.metacube.SCF.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class Cage {

	AnimalType cageType;
	int maxNoOfAnimals;
	int animalsPresent;
    List<Animal> animalList;
    AnimalCategory animalSpecies;
    
    Cage(int maxNoOfAnimals, AnimalType cageType, AnimalCategory animalSpecies)
    {
        this.maxNoOfAnimals = maxNoOfAnimals;
        this.animalsPresent = 0;
        this.cageType = cageType;
        animalList = new ArrayList<Animal>(maxNoOfAnimals);
        this.animalSpecies = animalSpecies;
    }
    
    AnimalType getCageType()
    {
        return cageType;
    }
    
    List<Animal> getAnimalList()
    {
        return animalList;
    }
    
    boolean isAddAnimalPossible()
    {
        if(maxNoOfAnimals == animalsPresent)
        {
            return false;
        }
        return true;
    }
    
    void addAnimal(Animal animal)
    {
        if(isAddAnimalPossible()) {
        	this.animalList.add(animal);
        	animalsPresent++;
        }
        
    }
    
    void removeAnimal(Animal animal)
    {
        this.animalList.remove(animal);
        animalsPresent--;
    }
    
    AnimalCategory getAnimalSpecies()
    {
        return animalSpecies;
    }
}

package GET2018.com.metacube.SCF.Assignment8;

import java.util.Scanner;

public class ZooOperations {

	void addAnimal(AnimalType animalSpecies)
    {
        switch(animalSpecies)
        {
        case LION:
            addLion();
            break;
        case CROCODILE:
            addCrocodile();
            break;
        case PEACOCK:
            addPeacock();
            break;
        default:
        	break;
        }
        
    }
    
    Scanner scan = new Scanner(System.in);
    void addLion()
    {
        System.out.println("Enter animal ID: ");
        int animalID = scan.nextInt();
        System.out.println("Enter animal age: ");
        int animalAge = scan.nextInt();
        System.out.println("Enter animal name: ");
        String animalName = scan.next();
        System.out.println("Is native from: ");
        String nativeFrom = scan.next();
        
        Animal animal = new Lion(animalID, animalAge, animalName, nativeFrom);
        
        if(putAnimal(animal))
        {
            System.out.println("Animal added");
        }
        else
        {
            System.out.println("Animal not added");
        }
        
        
    }
    
    
    void addCrocodile()
    {
    	System.out.println("Enter animal ID: ");
        int animalID = scan.nextInt();
        System.out.println("Enter animal age: ");
        int animalAge = scan.nextInt();
        System.out.println("Enter animal name: ");
        String animalName = scan.next();
        System.out.println("Enter crocodile type: ");
        String crocodileType = scan.next();
        
        Animal animal = new Crocodile(animalID, animalAge, animalName, crocodileType);
        
        if(putAnimal(animal))
        {
            System.out.println("Animal added");
        }
        else
        {
            System.out.println("Animal not added");
        }
    }
    
    void addPeacock()
    {
        System.out.println("Enter animal ID: ");
        int animalID = scan.nextInt();
        System.out.println("Enter animal name: ");
        String animalName = scan.next();
        System.out.println("Enter age: ");
        int age = scan.nextInt();
        System.out.println("Enter tail feather fan size(diameter): ");
        int wingSpan = scan.nextInt();
        
        Animal animal = new Peacock(animalID, animalName, age, wingSpan);
        
        if(putAnimal(animal))
        {
            System.out.println("Animal added");
        }
        else
        {
            System.out.println("Animal not added");
        }
    }
    
    boolean putAnimal(Animal animal)
    {        
        for(Zone zone: listOfEntities.getZoneList())
        {
            if(zone.getZoneType().equals(animal.getAnimalType()));
            {
                if(zone.isZoneEmpty())
                {
                    Cage cage = makeCage(animal.getAnimalType(), animal.getAnimalSpecies());
                    cage.addAnimal(animal);
                    zone.addCage(cage);
                    listOfEntities.addAnimal(animal);
                    return true;
                }
                
                Cage currentCage = zone.getLastCageAdded();
                if(zone.isZoneFull(currentCage))
                {
                    for(Cage unfilledCage: zone.cageNotFilled())
                    {
                        currentCage = unfilledCage;
                        if(currentCage.getAnimalSpecies() == animal.getAnimalSpecies())
                        {
                            currentCage.addAnimal(animal);
                            listOfEntities.addAnimal(animal);
                            return true;
                        }
                    }
                }
                if(currentCage.isAddAnimalPossible() && 
                        currentCage.getAnimalSpecies() == animal.getAnimalSpecies())
                {
                    currentCage.addAnimal(animal);
                    listOfEntities.addAnimal(animal);
                    return true;
                }
                else
                {
                    Cage newCage = makeCage(animal.getAnimalType(), animal.getAnimalSpecies());
                    newCage.addAnimal(animal);
                    zone.addCage(newCage);
                    listOfEntities.addAnimal(animal);
                    return true;
                }
            }
        }
        
        return false;
    }
	
}

package GET2018.com.metacube.SCF.Assignment8;

import java.util.Scanner;
import GET2018.com.metacube.SCF.Assignment8.ZooOperations;;

public class DriverClass {

	public static void main(String[] args)
    {
        ZooOperations operation = new ZooOperations();
        //Zoo zoo = new Zoo();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Who are you?");
        System.out.println("1. Administrator");
        System.out.println("2.Visitor");
        int choice = scan.nextInt();
        boolean flag=true;
        while(flag)
        {
            switch(choice)
            {
            case 1:
                System.out.println("1. Add Animal");
                System.out.println("2. Remove Animal");
                System.out.println("3. Add Zone");
                int choiceAdmin = scan.nextInt();
                switch(choiceAdmin)
                {
                case 1:
                    System.out.println("Which animal do you want to add: \n"
                            + "1. Lion\n" 
                            + "4. Crocodile\n"
                            + "6. Peacock");
                    String animalTypeNumber = scan.next();
                    AnimalType animalSpecies = AnimalType.valueOf(animalTypeNumber);
                    operation.addAnimal(animalSpecies);
                    break;
                    
                case 2:
                    System.out.println("2. Enter animal ID");
                    int animalID = scan.nextInt();
                    if(ZooOperations.removeAnimal(animalID))
                    {
                        System.out.println("Animal removed");
                    }
                    else
                    {
                        System.out.println("Animal not removed");
                    }
                    break;
                    
                case 3:
                    System.out.println("Enter number of cages to be in zone: ");
                    int numberOfCages = scan.nextInt();
                    System.out.println("Enter zone type: ");
                    String zoneType = scan.next();
                    System.out.println("Does zone has park(y/n): ");
                    String parkChoice = scan.next();
                    boolean hasPark;
                    if("y".equals(parkChoice))
                    {
                        hasPark = true;
                    }
                    else
                    {
                        hasPark = false;
                    }
                    System.out.println("Does zone has canteen(y/n): ");
                    String canteenChoice = scan.next();
                    boolean hasCanteen;
                    if("y".equals(canteenChoice))
                    {
                        hasCanteen = true;
                    }
                    else
                    {
                        hasCanteen = false;
                    }
                    if(ZooOperations.addZone(numberOfCages, zoneType, hasPark, hasCanteen))
                    {
                        System.out.println("Zone added");
                    }
                    else
                    {
                        System.out.println("Zone not added");
                    }
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
                }
                break;
                
            case 2:
                System.out.println("1. Get list of all animals");
                System.out.println("2. Get animal information");
                int choiceVisitor = scan.nextInt();
                switch(choiceVisitor)
                {
                case 1:
                    //System.out.println(zoo.getAllAnimals());
                    break;
                case 2:
                    System.out.println("Enter animal ID: ");
                    int animalID = scan.nextInt();
                    //zoo.getAnimalInfo(animalID);
                    break;
                default:
                    System.out.println("Wrong choice");
                    break;
                }
                break;
                
            default:
                System.out.println("Wrong choice");
                break;
            }
        }
        
    }
	
}

package GET2018.com.metacube.SCF.Assignment8;

import java.util.ArrayList;
import java.util.List;

public class Zone {

	AnimalCategory category;
	
	private int maxNumberOfCages;
	private int numberOfCagesPresent;
	private AnimalCategory zoneType;
	private boolean hasPark;
	private boolean hasCanteen;
	
	List<Cage> cageList;
	
	Zone(int maxNumberOfCages, AnimalCategory zoneType, boolean hasPark, boolean hasCanteen)
    {
        this.maxNumberOfCages = maxNumberOfCages;        
        this.zoneType = zoneType;
        this.hasPark = hasPark;
        this.hasCanteen = hasCanteen;
        this.numberOfCagesPresent = 0;
        this.cageList = new ArrayList<Cage>(maxNumberOfCages);
    }
	
	AnimalCategory getZoneType() {
		return zoneType;
	}
	
	boolean checkPark() {
		return hasPark;
	}
	
	boolean checkCanteen() {
		return hasCanteen;
	}
	
	List<Cage> getCageList()
    {
        return cageList;
    }
    
    boolean isZoneEmpty()
    {
        if(numberOfCagesPresent == 0)
        {
            return true;
        }
        return false;
    }
    
    boolean isZoneFull(Cage cage)
    {
        if(maxNumberOfCages == numberOfCagesPresent && !cage.isAddAnimalPossible())
        {
            return true;
        }
        return false;
    }
    
    List<Cage> cageNotFilled()
    {
        List<Cage> unfilledCageList = new ArrayList<Cage>();
        for(Cage notFilledCage: cageList)
        {
            if(notFilledCage.isAddAnimalPossible())
            {
                unfilledCageList.add(notFilledCage);
            }
        }
        return unfilledCageList;
    }
    
    
    Cage getLastCageAdded()
    {
        return cageList.get(cageList.size() - 1);
    }
    
    void addCage(Cage cage)
    {
         
        this.cageList.add(cage);
        numberOfCagesPresent++;
    }
    
    void removeAnimal(Cage cage)
    {
        this.cageList.remove(cage);
        numberOfCagesPresent--;
    }

}

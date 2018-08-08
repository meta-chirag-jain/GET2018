package GET2018.com.metacube.DSA.Assignment3;

/**
 * Implementation of Bowler Class where
 * we describe about properties of bowler
 * @author Chirag Jain
 * 
 */
public class Bowler {
	int bowl;
	String name;
	
	public Bowler(int bowl, String name) throws MatchException {
		if(bowl == 0) {
			throw new MatchException("Bowler not allowed with zero bowl");
		}
		
		if(name == null) {
			throw new NullPointerException("Bowler name can'nt be null");
		}
		this.bowl = bowl;
		this.name = name;
	}
	
	public void setBowl(int bowl) {
		if(bowl >= 0) {
			this.bowl = bowl;
		}
	}
	
	public int getBowl() {
		return bowl;
	}
	
	public String getBowler() {
		return name;
	}
}

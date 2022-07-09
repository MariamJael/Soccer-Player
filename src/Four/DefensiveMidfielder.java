/**
 * PROGRAM DESCRIPTION:
 * This Program is used to create the DefensiveMidfielder Object. It has attributes,
 * constructors, getters and setters, toString() method and equals() method. 
 * It is one of the Child Class of the Midfielder, so Midfielder is its Parent Class.
 * <p>
 *  DATE: 25/07/18
 * <p>
 * NAME(S):
 * @author Mariam Jael Caceres Lopez 
 *         <p>
 * @author Tashfia Naharin Proma
 * 
 */
package Four;

import One.Date; //for date.

//A DefensiveMidfielder is a Midfielder that in addition has the following: intercepts (X: int type).

public class DefensiveMidfielder extends Midfielder {

	//Attributes
	private int intercepts ;
	
	
	/**
	 * This is the Default Constructor. It assigns all attributes to their default types.
	 */
	public DefensiveMidfielder () {
		super ();
		intercepts = 0;
	}
	
	
	/**
	 * This is a Parameterized constructor.It takes enough parameters to initialize all attributes 
	 * of the created object from this class.
	 * @param name               The name of the SoccerPlayer object.
	 * @param dob                This attribute is used for the date of birth of the SoccerPlayer object.
	 * @param clubName           The club name of the SoccerPlayer object.
	 * @param countryName        The country name of the SoccerPlayer object.
	 * @param numYellowCards     The number of yellow cards the SoccerPlayer object received.
	 * @param numRedCards        The number of red cards the SoccerPlayer object received.
	 * @param gamesPlayed        The number of games played by the SoccerPlayer object.
	 * @param attacksStopped     The number of attacks stopped by the Midfielder object.
	 * @param intercepts         The number of intercepts by the DefensiveMidfielder object.
	
	 */
	public DefensiveMidfielder (String name, Date dob, String clubName, String countryName, int numYellowCards,int numRedCards,
			   int gamesPlayed, int attacksStopped, int intercepts ) {
		 super(name, dob, clubName, countryName, numYellowCards, numRedCards, gamesPlayed, attacksStopped); 
		this.intercepts = intercepts;
	}

	/**
	 * 
	/** This is a Copy Constructor. Keeps a copy of the attributes.
	 * @param c         This parameter's type is of this class's object.
	 */
	public DefensiveMidfielder (DefensiveMidfielder c) {
				this.intercepts  = c.intercepts ;
				
	}
	
	//getter and setter
	/**
	 * This method is called getter/Accesor. It fetches value that is stored within an object.
	 * @return An integer value of the intercepts attribute.
	 */
	public int getIntercepts () {
		return intercepts ;
	}
	
	/**
	 * This method is called setter/Mutator. It is used to control changes to a variable. 
	 * Its a void method so no return type.
	 * @param intercepts     It sets the variable with a value. 
	 */
	public void setIntercepts (int intercepts ) {
		this.intercepts = intercepts ;
	}
	

	/**
	 * This is toString() Method. Displays the objects all attributes value. This method is override.
	 * @see Four.Midfielder#toString()
	 */
	public String toString () {
		return  ("\nName: "         + this.getName()
				+"\nNationality: "  + this.getCountryName()		
				+"\nAge: "+ this.dob.playerAge() +" years old "+ this.getDob() 
				+"\nCurrent team: "  + this.getClubName() 
				+"\nPosition: Defensive Midfielder" 
				+"\nGames Played: " + this.getGamesPlayed()
				+"\nAttacks Stopped: " + this.getAttacksStopped()
				+"\nIntercepts: "   + this.getIntercepts ()
				+"\nCautions:"
				+"\nYellow Cards: " + this.getNumYellowCards()
				+"\nRed Cards: "    + this.getNumRedCards()
		        
				);	
			}
		

	
		/**
	 * This is an equals() method. It checks if you objects are same. The null verifications here,
	 * will protect this program from crashing. A NullPointerException is handled to make it more
	 * protective. The comparison of the attributes are done to see if they have same attribute values
	 * therefore are same. If both the objects are from the same class they are likely to be same.
	 * This method is override.
	 * @see Four.Midfielder#equals(java.lang.Object)
	 */
	public  boolean equals(Object obj) {
		
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
		
       
		else if ( this == obj) {
            return true;
        }
        
        try { 
	        final DefensiveMidfielder other = (DefensiveMidfielder) obj;
	        
	        
	        if (this.name != null || other.name != null )
	        	 if (!this.name.equals(other.name))
	       		    return false;
	       	
	        if ( this.countryName != null || other.countryName != null )	
	       	     if (!this.countryName.equals(other.countryName))
	       		    return false;
	       
	        if(this.clubName != null || other.clubName != null)
	       	     if(!this.clubName.equals(other.clubName))
	       	        return false;
	        
	        if (this.numYellowCards != other.numYellowCards ||this.numRedCards != other.numRedCards ||
	            this.gamesPlayed != other.gamesPlayed) {
	        	return false;
	        }
	        
	        if (this.dob != other.dob) {
	        	if(this.dob.getDay( )!= other.dob.getDay() || this.dob.getMonth( ) != other.dob.getMonth() ||
	        	   this.dob.getYear( ) != other.dob.getYear())
	        	     
	        		return false;
		    } 
	        
	        //for midfielder
	        if (this.getAttacksStopped() != other.getAttacksStopped() ) {
	        	return false;
	        }
	        
	        //new
	        if (this.intercepts!= other.intercepts) {
	        	return false;
	        }
        } catch (NullPointerException e) {
            return false;
          }
			
		
        return true;
		
	}
}




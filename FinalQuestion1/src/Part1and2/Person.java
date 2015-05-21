package Part1and2;

import java.util.UUID;

public class Person {

	private String FirstName;
	private String LastName;
	private UUID Personid;

	public String getFirstName(){
		return FirstName;
	}

	public void setFirstName(String FirstName){
		this.FirstName = FirstName;
	}

	public String getLastName(){
		return LastName;
	}

	public void setLastName(String LastName){
		this.LastName = LastName;
	}
	
	public UUID getPersonId(){
		return Personid;
	}
	
	public void setPersonId(UUID Personid){
		this.Personid=Personid;
	}

}

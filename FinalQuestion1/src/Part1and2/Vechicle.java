package Part1and2;

abstract class Vehicle implements VehicleInterface {
	private String Name;
	private String Color;
	private String Weight;
	private Person Owner;
	
	

	public String getName(){
		return Name;
	}

	public void setName(String Name){
		this.Name = Name;
	}

	public String getColor(){
		return Color;
	}

	public void setColor(String Color){
		this.Color = Color;
	}
	
	public String getWeight(){
		return Weight;
	}
	
	public void setWeight(String Weight){
		this.Weight = Weight;
	}
	
	public Person getOwner(){
		return Owner;
	}

	public void setPhone(Person Owner){
		this.Owner = Owner;
	}
	
	public Person transferOwnship(Person newOwner){
		Owner=newOwner;
		return Owner;
	}
}




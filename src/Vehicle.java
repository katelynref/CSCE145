//Katelyn Refugia
public class Vehicle {
	
	private String manufac;
	private int cylinders;
	private String owner;
	
	//default constructor
	public Vehicle()
	{
		manufac = "unknown";
		cylinders = 1;
		owner = "unknown";
	}
	
	//parameterized constructor
	public Vehicle(String xManufac, int xCylinders, String owner)
	{
		this.setManufac(xManufac);
		this.setCylinders(xCylinders);
		this.setOwner(owner);
	}
	
	//accessors
	public String getManufac()
	{
		return this.manufac;
	}
	
	public int getCylinders()
	{
		return this.cylinders;
	}
	
	public String getOwner()
	{
		return this.owner;
	}
	
	//mutators
	public void setManufac(String xManufac)
	{
		this.manufac = xManufac;
	}
	
	public void setCylinders(int xCylinders)
	{
		if(xCylinders > 0)
		{
			this.cylinders = xCylinders;
		}
		else
		{
			System.out.println("Invalid value entered for cylinders!");
		}
	}
	
	public void setOwner(String xOwner)
	{
		this.owner = xOwner;
	}
	
	//other methods
	public boolean equals(Vehicle v)
	{
		if(this.manufac.equalsIgnoreCase(v.manufac)
				&& this.cylinders == v.cylinders
				&& this.owner.equalsIgnoreCase(v.owner))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return "Manufacturer: "+this.manufac
				+"\nNumber of Cylinders: "+this.cylinders
				+"\nOwner's Name: "+this.owner;
	}

}

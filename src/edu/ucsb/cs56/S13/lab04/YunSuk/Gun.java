package edu.ucsb.cs56.S13.lab04.YunSuk;
/** 
 * A gun object.
 * @author Yun Suk Chang
 * @version CS56, S13, lab04
 *
 * */
public class Gun{
	
	private String model;
	private int bulletsRemaining;
	private int maxBullets;
	/** Default Constructor creates a Hand Gun with 0 bullets and maximum of 6 bullets*/
	public Gun(){
		model="Hand Gun";
		bulletsRemaining=0;
		maxBullets=6;
	}
	/**
 	   Three-arg Constructor for Gun Class.
 	   @param name name of the Gun (e.g. 1911 Pistol, AK-47, Winchester Model 94)
	   @param bullets number of bullets remaining inside the container (e.g. 6, 23, 349)
	   @param max maximum bullets that gun can hold (e.g. 6, 30, 90)
  	*/
	public Gun(String name, int bullets, int max)
	{
		model=name;
		if(max<0)
		maxBullets=0;
		else
		maxBullets=max;
		if(bullets<0)
		bulletsRemaining=0;
		else if(bullets>maxBullets)
		bulletsRemaining=maxBullets;
		else
		bulletsRemaining=bullets;
	}
	/**
 	   Gets maximum bullets that gun can hold 
 	   @return maximum bullets that gun can hold (e.g. 6, 30, 90)
 	*/
	public int getMaxBullets(){
		return maxBullets;
	}	
	/**
 	   Gets name of the gun 
 	   @return name of the gun (e.g. 1911 Pistol, AK-47, Winchester Model 94)

 	*/
	public String getModel(){
		return model;
	}
	/**
 	   Gets number of bullets remaining inside the container 
 	   @return number of bullets remaining inside the container (e.g. 6, 23, 349)

	*/
	public int getBulletsRemaining(){
		return bulletsRemaining;
	}
	/**
 	    sets the maximum bullets that gun can hold 
	    @param max new maximum bullets that gun can hold 
 	*/
	public void setMaxBullets(int max){
		if(max<0)
		maxBullets=0;
		else
		maxBullets=max;
	}
	/**
 	    sets the name of the gun 
	    @param name new name of the gun 
	*/
	public void setModel(String name){
		model=name;
	}
	/**
 	   sets the number of bullets remaining inside the container
	   @param bullets new number of bullets remaining inside the container  
	*/
	public void setBulletsRemaining(int bullets){
		if(bullets<0)
		bulletsRemaining=0;
		else if(bullets>maxBullets)
		bulletsRemaining=maxBullets;
		else
		bulletsRemaining=bullets;
	}
	/**
 	   Converts to a string representation. (e.g. "Model: Hand Gun   BulletsRemaining: 0   MaxBullets: 6")
	   @return String representation of Gun.
	*/
	public String toString()
	{
		return "Model: "+model+"   BulletsRemaining: "+ bulletsRemaining + "   MaxBullets: "+maxBullets;
	}
	/**
 	   Checks if Guns are equal.
	   @param o another gun to compare
	   @return true if the this Gun is same as o; false otherwise 
 	*/	
	public boolean equals(Object o)
	{
		if(o==null)
			return false;
		if(!(o instanceof Gun))
			return false;
		if(bulletsRemaining!=((Gun) o).getBulletsRemaining())
			return false;
		if(maxBullets!=((Gun) o).getMaxBullets())
			return false;
		if(model.equals(((Gun) o).getModel()))
			return true;
		
		return false;
	}
	/**
 	   Shoots a bullet. Number of bullets remaining decreases by 1.
	*/
	public void shoot()
	{
		if(bulletsRemaining>0)
		bulletsRemaining--;
		
		else
		System.out.println("Out of bullet");
	}
	/**
 	   Checks if there is no bullets in the container.
	   @return true if bullets remaining is equal to 0; false otherwise
	*/
	public boolean isEmpty()
	{
		if(bulletsRemaining==0)
			return true;
		return false;
	}
	/**
 	   Reloads the bullets so that the container is full.
	   Bullets remaining equals maximum bullets that the gun can hold.
 	*/
	public void reload()
	{
		bulletsRemaining=maxBullets;
	}
	/** Sample main that uses the class.*/
	public static void main(String[] args)
	{
		Gun gun = new Gun();
		Gun ak47= new Gun("AK-47",30,30);
		for(int i=0;i<3;i++){
		while(!gun.isEmpty()){
		System.out.println(gun);
		
		gun.shoot();
		}
		System.out.println(gun);
	
		while(!ak47.isEmpty()){
		System.out.println(ak47);
		
		ak47.shoot();
		}
		System.out.println(ak47);
	
		ak47.reload();
		gun.reload();
		System.out.println(gun);
	
		System.out.println(ak47);
		}
	}
}

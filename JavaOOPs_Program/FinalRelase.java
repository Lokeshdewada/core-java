package oopsConcept;

abstract class FirstRelease {
	//abstract method in java 
	
	public void classRoom() {
		
		System.out.println("Class Training is Started...");
	}
	public abstract void  online();
	public abstract void  corporate();
}

abstract class SecondRelease extends FirstRelease {
	
	 public void online() {
		 System.out.println("Online Training is Started...");	 
	 }
	 
}

public  class FinalRelase extends SecondRelease {

	public void corporate() {
		
		 System.out.println("Corporate Training is Started ...");
	 }
	
   public static void main (String[] args) {
	   
	   FinalRelase f = new FinalRelase();
	   
	   f.classRoom();
	   f.online();
	   f.corporate();
	   
   }
}

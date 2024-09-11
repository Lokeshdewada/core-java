package oopsConcept;

abstract class Colour {
	public abstract void red();

	public abstract void green();

	public void black() {
		System.out.println("black car");
	}
}

class Entertainement {
	String musicsystem;
	int call;

	public void setMusicsystem(String name) {
		System.out.println("Playing hindi song");
	}

	public String getMusicsystem() {
		return musicsystem;
	}

	public void setCall(int num) {
		System.out.println("Ready to call");
	}

	public int getCall() {
		return call;
	}
}

class newcolour extends Colour {
	public void red() {
		System.out.println("red colour");
	}

	public void green() {
		System.out.println("green colour");
	}

}

class Features {
	public void cruzecontrol() {
		System.out.println("This model has  cruze control features");
	}

	public void powerstearing() {
		System.out.println("This model has power stearning");
	}
}

class specialfeatures {
	public void abs() {
		System.out.println("This model has abs");
	}

}

class models extends Features {
	public void tatasafari() {
		System.out.println("The tata safri has been launched");
	}
}

class specialmodels extends Features {
	public void goldsafari() {
		System.out.println("gold safari is available");
	}
}

class Details {
	public void nano(String name) {
		System.out.println("The model is nano");

	}

	public void nano(int price) {
		System.out.println("The model price  is 100000");

	}
}

public class CarsOfTata extends specialmodels {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		models ts = new models();
		ts.tatasafari();
		ts.cruzecontrol();
		ts.powerstearing();

		specialmodels tgs = new specialmodels();
		tgs.goldsafari();
		tgs.cruzecontrol();
		tgs.powerstearing();

		CarsOfTata c = new CarsOfTata();
		c.cruzecontrol();

		newcolour c1 = new newcolour();
		c1.red();
		c1.black();
		c1.red();

		// Encatulation

		Entertainement ent = new Entertainement();
		ent.setCall(123);
		ent.setMusicsystem("song");

	}
}

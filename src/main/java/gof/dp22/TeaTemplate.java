package gof.dp22;

public abstract class TeaTemplate {

	// Template method cannot be overridden by subclasses
	public final void prepare() {
		boilWater();
		addMilk();
		addSugar();
		addTeaLeaves();
	}

	public void boilWater() {
		System.out.println("Default Water Boiled");
	}

	public abstract void addMilk();

	public void addSugar() {
		System.out.println("Default Sugar Added");
	}

	public abstract void addTeaLeaves();
}
package solid.liskovsubstitution.solution;

public class Crow implements FlyingBird {

	@Override
	public void fly() {
		System.out.println("Crow flies");
	}

	@Override
	public void eat() {
		System.out.println("Crow eats");
	}

}

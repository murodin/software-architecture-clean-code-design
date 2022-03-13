package solid.interfacesegregation.solution;

public class Boat implements Sailable {

	@Override
	public void sail() {
		System.out.println("Boat sails");
	}

}

package basic.ch22;

public class Rabbit implements RacePaticipant{
	
	private final int speed = 10;

	@Override
	public String getName() {
		return "엉금엉금 토끼";
	}

	@Override
	public int getSpeed() {
		return speed;
	}

}

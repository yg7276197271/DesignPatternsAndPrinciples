package bridge_design_pattern;

public class Fish extends LivingThings{

	public Fish(BreatheImplementor breatheImplementor) {
		super(breatheImplementor);
	}

	@Override
	public void breatheProcess() {
		breatheImplementor.breathe();
	}

	

}

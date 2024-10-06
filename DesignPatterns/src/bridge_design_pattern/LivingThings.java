package bridge_design_pattern;

public abstract class LivingThings {
	BreatheImplementor  breatheImplementor;
	
	public LivingThings(BreatheImplementor breatheImplementor) {
		this.breatheImplementor = breatheImplementor;
	}

	abstract public void breatheProcess();
}

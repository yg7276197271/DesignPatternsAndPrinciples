package bridge_design_pattern;

public class Main {
public static void main(String[] args) {
	LivingThings fishObject = new Fish(new WaterBreatheImplementor());
	fishObject.breatheProcess();
}
}

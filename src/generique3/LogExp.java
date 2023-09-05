package generique3;

public class LogExp implements BijectiveFunction<Double> {
	@Override
	public Double apply(Double t) {
		return Math.log(t);
	}

	
	@Override
	public Double undo(Double t) {
		//Fonction exponentielle
		return Math.exp(t);
	}
}

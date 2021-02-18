
public class NegativeAgeException extends Exception {
	public NegativeAgeException() {
		super("Negative Age Exception");
	}
	
	public NegativeAgeException(String message) {
		super(message);
	}
}


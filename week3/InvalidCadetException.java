
public class InvalidCadetException extends Exception {
	public InvalidCadetException() {
		super("Cadet is Invalid and does not fit the requirements.");
	}
	public InvalidCadetException(String message) {
		super(message);
	}
}

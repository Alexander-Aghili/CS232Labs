
public class MilitaryCadet {
	
	int age, weight;
	
	public MilitaryCadet(int age, int weight) throws InvalidCadetException {
		if (age > 40 || weight < 40)
			throw new InvalidCadetException();
		this.age = age;
		this.weight = weight;
	}
}

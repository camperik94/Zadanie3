
public class Bmi {
	private int wzrost;
	private int waga;

	void setWzrost(int wzrost) {
		this.wzrost = wzrost;
	}

	int getWzrost() {
		return wzrost;
	}

	void setWaga(int waga) {
		this.waga = waga;
	}

	int getWaga() {
		return waga;
	}
	
	Bmi(int waga, int wzrost){
		this.waga = waga;
		this.wzrost = wzrost;
	}
	
	void zmierzBmi(){
		
		double bmi = waga / (wzrost * wzrost);
		System.out.println(bmi);
		
	}
}

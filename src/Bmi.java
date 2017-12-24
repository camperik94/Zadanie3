
public class Bmi {
	private double wzrost;
	private int waga;

	public void setWzrost(double wzrost) {
		this.wzrost = wzrost;
	}

	public double getWzrost() {
		return wzrost;
	}

	public void setWaga(int waga) {
		this.waga = waga;
	}

	public int getWaga() {
		return waga;
	}
	
	public Bmi(int waga, double wzrost){
		this.waga = waga;
		this.wzrost = wzrost;
	}
	
	public void zmierzBmi(){
		System.out.println(waga);
		System.out.println(wzrost);
		double bmia = waga / (wzrost * wzrost);
		System.out.println(bmia);
		
	}
}

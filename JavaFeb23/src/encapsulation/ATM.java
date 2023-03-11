package encapsulation;

public class ATM {

	public static void main(String[] args) {
		
		Bank obj = new Bank();
		//obj.pinNumber = 6754;
		obj.updatePin(12345678, 1234, 6754);
		obj.drawMoney(12345678, 6754, 1000);

	}

}

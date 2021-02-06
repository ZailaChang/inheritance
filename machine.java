public class machine {

	public static void main(String[] args) {
		machineInfor m1 = new machineInfor();

		m1.start();
		// m1.rest();
		m1.stop();
		m1.showinfor();

		newmachine nM1 = new newmachine();
		nM1.start();
		nM1.rest();
		nM1.stop();
		nM1.showinfor();

	}

}

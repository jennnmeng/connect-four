
public class GamboardLogic {

	public static void main(String[] args) {

		int[] ints = { 1, 2, 5, 4 };
		for (int i = 0; i < ints.length; i++) {
			if (ints[i] == 2) {
				ints[i] = 6;
				break;
			}
		}
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println(ints[i]);
		}

	}

}

import java.util.ArrayList;

public class MinOp {
    public static int minimumOperationsNeeded(Number[] arrNum) {
        int numOp = 0;
		
		// mengembalikan operasi minimum untuk mencapai array yang diinginkan
        int[] arr = new int[arrNum.length];

		for (int i=0; i<arrNum.length; i++) {
			arr[i] = arrNum[i].intValue(); // integer value of number
		}

		for (int i=0; i<arr.length; i++) {
			// System.out.println("Element " + i);
			// System.out.println(arr[0] + ", " + arr[1]);
			// System.out.println(numOp);
			// System.out.println("start");
			while (arr[i] != 0) {
				if (arr[i] % 2 != 0) {
					arr[i] --;
				}
				else {
					arr[i] /= 2;
				}
				numOp ++;
				// System.out.println(arr[0] + ", " + arr[1]);
				// System.out.println(numOp);
			}
		}

		return numOp;
    }

    public static void main(String[] args) {
		Number[] arr = new Number[2];
		
		arr[0] = 2;
		arr[1] = 2;
		
		System.out.println(MinOp.minimumOperationsNeeded(arr));
	}
}
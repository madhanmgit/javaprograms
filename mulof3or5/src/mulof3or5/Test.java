/*
 * M.Madhan Mohan
 * 26/May/2017
 */
package mulof3or5;

public class Test {
	public static void main(String[] args) {
		Multipleof3or5 test = new Multipleof3or5();
		boolean out1 = test.multipleOf3Or5Only(25);
		boolean out2 = test.multipleOf3Or5Only(26);
		boolean out3 = test.multipleOf3Or5Only(15);
		boolean out4 = test.multipleOf3Or5Only(6);
		boolean out5 = test.multipleOf3Or5Only(9);
		boolean out6 = test.multipleOf3Or5Only(29);
		boolean out7 = test.multipleOf3Or5Only(18);
		boolean out8 = test.multipleOf3Or5Only(45);
		boolean out9 = test.multipleOf3Or5Only(41);

		System.out.println(out1);
		System.out.println(out2);
		System.out.println(out3);
		System.out.println(out4);
		System.out.println(out5);
		System.out.println(out6);
		System.out.println(out7);
		System.out.println(out8);
		System.out.println(out9);

	}

}

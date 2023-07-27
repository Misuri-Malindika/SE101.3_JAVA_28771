
package com.mycompany.q4;

/**
 *
 * @author Misuri
 */
public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
        }
        System.out.println("Loop end");
    }
}
/*
Results:   	10
			20
			Loop end

*/
/*
public class Q4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.println(x);
        }
        System.out.println("Loop end");
    }
}*/
/*
Results:  	10
		20
		40
		50
			Loop end*/

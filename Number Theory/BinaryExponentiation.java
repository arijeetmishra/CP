/*
 * Method 0 - Basic approach
 * Method 1 - Iterative Method [a^b = (a^(b/2))^2 if `b` is even]
 * Method 2 - Recursive Method for the same
 * 
 */

class BinaryExponentiation {
    public static void main(String[] args) {
        long a = Long.parseLong(args[0]), b = Long.parseLong(args[1]);
        System.out.println(args[0] + " ^ " + args[1] + " = " + method1(a, b));
        System.out.println("Recursive Method");
        System.out.println(args[0] + " ^ " + args[1] + " = " + method2(a, b));
    }
    public static long method1(long a, long b) {
        System.out.println("Iterative Method [a^b = (a^(b/2))^2 if `b` is even]");
        long result = 1;
        while(b > 0 ) {
            if(b % 2 == 1) result *= a;
            a *= a;
            b /= 2;
        }
        return result;
    }
    public static long method2(long a, long b) {
        if(b == 0) return 1;
        long tmp = method2(a, b/2);
        long result = tmp * tmp;
        if(b % 2 == 1)  result *= a;
        return result;
    }
}

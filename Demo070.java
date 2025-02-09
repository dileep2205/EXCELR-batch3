public class Demo070 {
    public Demo070() {
    }
 
    public static void main(String[] var0) {
       int[] var1 = new int[]{5, 10, 15, 7, 13, 20, 25, 29, 30, 37};
       System.out.println("Prime numbers in the array:");
       int[] var2 = var1;
       int var3 = var1.length;
 
       for(int var4 = 0; var4 < var3; ++var4) {
          int var5 = var2[var4];
          if (isPrime(var5)) {
             System.out.print("" + var5 + " ");
          }
       }
 
    }
 
    public static boolean isPrime(int var0) {
       if (var0 < 2) {
          return false;
       } else {
          for(int var1 = 2; var1 * var1 <= var0; ++var1) {
             if (var0 % var1 == 0) {
                return false;
             }
          }
 
          return true;
       }
    }
 }
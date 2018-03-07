//Tyler MacIntosh, tmacinto, 12B, 1/19/18
//a class demonstrating recursion in java for pa1
//Recursion.java

public class Recursion {
        static void reverseArray1(int[] X, int n, int[] Y) {
                if (n > 0) {
                        Y[Y.length - n] = X[n-1];
                        reverseArray1(X, n-1, Y);
                }

        }
        static void reverseArray2(int[] X, int n, int[] Y) {
                if (n > 0) {
                        Y[n-1] = X[X.length - n];
                        reverseArray2(X, n-1, Y);
                }
        }
        static void reverseArray3(int[] X, int i, int j) {
                if(j > i) {
                        //make int to act as mediator
                        int temp = X[i];
                        X[i] = X[j];
                        X[j] = temp;
                        reverseArray3(X, i+1, j-1);
                }
        }
        static int maxArrayIndex(int[] X, int p, int r) {
                int q;
                if(p < r) {
                        q = (p+r)/2;
                        int left = maxArrayIndex(X, p, q);
                        int right = maxArrayIndex(X, q+1, r);
                        if(X[left]>X[right]) {
                                return left;
                        }else {
                                return right;
                        }
                } else {
                        return p;
                }
        }
        static int minArrayIndex(int[] X, int p, int r) {
                int q;
                if(p < r) {
                        q = (p+r)/2;
                        int left = minArrayIndex(X, p, q);
                        int right = minArrayIndex(X, q+1, r);
                        if(X[left]>X[right]) {
                                return right;
                        }else {
                                return left;
                        }
                }else {
                        return p;
                }
        }

        public static void main(String[] args){

                 int[] A = {-1, 2, 6, 12, 9, 2, -5, -2, 8, 5, 7};
                 int[] B = new int[A.length];
                 int[] C = new int[A.length];
                 int minIndex = minArrayIndex(A, 0, A.length-1);
                 int maxIndex = maxArrayIndex(A, 0, A.length-1);

                 for(int x: A) System.out.print(x+" ");
                 System.out.println();

                 System.out.println( "minIndex = " + minIndex );
                 System.out.println( "maxIndex = " + maxIndex );
                 reverseArray1(A, A.length, B);
                 for(int x: B) System.out.print(x+" ");
                 System.out.println();

                 reverseArray2(A, A.length, C);
                 for(int x: C) System.out.print(x+" ");
                 System.out.println();

                 reverseArray3(A, 0, A.length-1);
                 for(int x: A) System.out.print(x+" ");
                 System.out.println();

                 }
}

package pl.akademiakodu;

public class Z2 {
    //A[P] + A[Q] + (Q - P)
    //(A[P] - P) + (A[Q] +Q)
    int solution(int[] array) {
        int maxA = array[0];
        int maxB = array[0];

        for (int i = 0; i < array.length; i++) {
            if ((array[i] - i) > maxA) {
                maxA = array[i] - i;
            }
            if (array[i] + i > maxB) {
                maxB = array[i] + i;
            }
        }
        return maxA + maxB;
    }
    public static void main(String[] args) {
        Z2 z2 = new Z2();
        System.out.println(z2.solution(new int[]{1, 3, -3}));
    }
}


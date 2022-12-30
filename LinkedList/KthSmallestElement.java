public class KthSmallestElement {
    public static void main(String args[]) {
        int[] a = { 6, 3, 7, 87, 34, 12, 77, 90 };
        int k = 4;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            if (i == k - 1) {
                System.out.println(k + "smallest element is: " + a[i]); // 12
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // 3 6 7 12 34 77 87 90
        }

    }

}

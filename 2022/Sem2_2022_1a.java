public class MagicNumbers {

    public static void main(String[] args) {
       int[] x = {2, 1, 6, 3, 9};
       System.out.println("magic1 is: " + magic1(x));
       System.out.println("magic2 is: " + magic2(x));

    }

    public static int magic1(int[] a) {
        System.out.println("length = " + a.length);
        if (a.length == 0) throw new IllegalArgumentException();
        return a[a.length - 1];
    }

    public static int magic2(int[] a) {
        if (a.length < 2) throw new IllegalArgumentException();
        int m = a[0];
        for (int i = 1; i < a.length - 1; ++i) {
            if (m < a[i]) m = a[i];
            System.out.println("m = " + m);
        }
        return m;
    }
}

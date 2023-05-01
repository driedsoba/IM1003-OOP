public class Magic {
    public static void main(String[] args) {
        System.out.println("Do main()");
        int[] sizes = {3, 1, 2, 5};
        printPattern(magic(sizes));
        System.out.println("main() done");
    }

    public static int magic(int[] arr) {
        System.out.println("Do magic()");
        int magic = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > magic) magic = arr[i];
        }
        return magic;
    }

    public static void printPattern(int size) {
        for (int r = 0; r < size; ++r) {
            System.out.print(r + "|");
            for (int c = 0; c < size; ++c) {
                if (r == 0 || c == 0 || r == c) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

/* Do main()
Do magic()
0|*****
1|**
2|* *
3|*  *
4|*   *
main() done */

public class Q1c {

    public static String msg = "hello, world";

    public static void main(String[] args) {
        char[] letters = methodA(1,4);
        System.out.println("length is: " + letters.length);
        System.out.println(methodB(letters));
    }

    public static char[] methodA(int a, int b) {
        int len = b - a;
        char[] result = new char[len];
        for (int i = a, j = 0; i < b; ++i, ++j) {
            result[j] = msg.charAt(i);
            System.out.println("value is: " + result[j]);
        }
        return result;
    }

    public static String methodB(char[] array) {
        String result = "";
        int len = array.length;
        for(int i =0; i < len; i++) {
            result  += (char)(array[i] + 1);
            System.out.println("result is: " + result);
        }
        return result;
    }
}

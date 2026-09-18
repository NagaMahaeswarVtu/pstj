public class JavaGenerics {

    static <T> void printArray(T[] a) {
        for (T x : a)
            System.out.println(x);
    }
        public static void main(String[] args) {
        Integer[] a = {1, 2, 3};
        String[] b = {"Hello", "Java", "Generics"};

        printArray(a);
        printArray(b);
    }
}

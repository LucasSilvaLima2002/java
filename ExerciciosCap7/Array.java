public class Array {
    public static void main(String[] args) {

        final int ARRAY_LENGHT = 10;
        int[] array = new int[ARRAY_LENGHT];

        for (int i = 0; i < array.length; i++) {
            array[i] = 2 + 2 * i;
            System.out.println(array[i]);
        }

    }
}
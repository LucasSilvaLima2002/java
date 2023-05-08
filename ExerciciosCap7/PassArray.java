public class PassArray {
    public static void main(String[] args) {
        

        int[] array = {1,2,3,4,5};
    
        for (int value : array) 
            System.out.printf(" %d", value);
              


    }

    private static void modifyArray(int[] array2) {
        for (int counter = 0; counter < array2.length; counter++) {
            array2[counter] *= 2;
        }
    }
}

public class MethodOverload {
    public static void main(String[] args) {
     
       
       
      
        System.out.println(square(30));
        System.out.println(square(7.5));
    
    }

    private static int square(int intValue){
        System.out.println(intValue);
        return intValue * intValue;
    }

    private static double square(double doubleValue){
        System.out.println(doubleValue);
        return doubleValue * doubleValue;
    }
    
}

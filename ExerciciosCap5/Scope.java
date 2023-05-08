public class Scope {

    private static  int x = 0;
    
    public static void main(String[] args) {
      
      teste();
      teste2();
     


    }

    private static void teste(){
    
        x = 25;
        System.out.println(Scope.x);
    }

    private static void teste2(){
        int x = 30;
        System.out.println(x);
        
    }
}

import java.lang.reflect.Method;
import java.util.Scanner;

import javax.xml.stream.events.Comment;


public class AutoPolicyTest {
    public static void main(String[] args) {
    
      
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");
        

    


      

       

     
        AutoPolicy.policyInNoFaultState(policy1);   
        AutoPolicy.policyInNoFaultState(policy2);

       boolean teste = (policy1 instanceof AutoPolicy);

       System.out.println();

      

    }

    
   
}

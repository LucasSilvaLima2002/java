import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.UserPrincipal;

public class AbrindoArquivos{


    public static void main(String[] args) {
        
        Path path = Path.of("c:\\dev\\licenses\\windows\\readme.txt");
        UserPrincipal owner = Files.getOwner(path);
        System.out.println("owner = " + owner);
    }
}
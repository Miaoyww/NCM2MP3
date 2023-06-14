import service.Converter;
import java.io.File;

/**
 * @author charlottexiao
 */
public class main {

    public static void main(String[] args) {
        File file = new File(args[0]);
        Converter converter = new Converter();
        converter.ncm2Mp3(file.getPath(),file.getParent());
    }

}

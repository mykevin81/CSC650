import java.util.*;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;


/**
 * Created by mykev on 10/22/2015.
 */
public class CBC {

    public static String DES(byte[] text, String key) {
        try{
            DESKeySpec dks = new DESKeySpec(key.getBytes());
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            SecretKey desKey = skf.generateSecret(dks);
            Cipher cipher = Cipher.getInstance("DES");

            cipher.init(Cipher.ENCRYPT_MODE, desKey);

            byte[] crypt = cipher.doFinal(text);

            return crypt.toString();
        } catch(Exception e) {
            return null;
        }

    }

    public static void main(String[] args) {


    }
}

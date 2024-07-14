import java.util.Arrays;
import java.util.stream.Collectors;

public class CipherMethod {
     private IEncryptable callbackFtn;

    String encryptText(String plainText, String cipher){
        callbackFtn=new Encryption().getMonoCipherMethod();
        return callbackFtn.encrypt(plainText,cipher);
    }

    String decryptText(String cipherText, String cipher){
        callbackFtn=new Encryption().getMonoCipherMethod();
        return callbackFtn.decrypt(cipherText, cipher);
    }

}

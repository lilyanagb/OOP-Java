import java.util.Arrays;
import java.util.stream.Collectors;

public class Encryption {

    private class MonoEncryption implements IEncryptable{
        static final int MAX_CHARS = 256;

        public static char normalChar[]
                = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
                'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

         MonoEncryption(){}

        @Override
        public String encrypt(String plainText, String cipher) {
            char codedChar[]= convert(plainText,cipher).toCharArray();
            String encryptedString = "";

            for (int i = 0; i < plainText.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (plainText.charAt(i) == normalChar[j]) {
                        encryptedString += codedChar[j];
                        break;
                    }
                }
            }
            return encryptedString;
        }

        @Override
        public String decrypt(String cipherText, String cipher) {
            char codedChar[]= convert(cipherText,cipher).toCharArray();
            String decryptedString = "";

            for (int i = 0; i < cipherText.length(); i++) {
                for (int j = 0; j < 26; j++) {
                    if (cipherText.charAt(i) == codedChar[j]) {
                        decryptedString += normalChar[j];
                        break;
                    }
                }
            }
            return decryptedString;
        }

        private int[] getCounts(String cipher){
            int count[] = new int[MAX_CHARS];
            for (int i = 0; i < cipher.length(); i++)
                count[cipher.charAt(i)]++;

            return count;
        }


        String removeDirtyChars(String base, String forRemove) {
            int count[] = getCounts(forRemove);
            int i = 0, j = 0;

            char arr[] = base.toCharArray();

            while (i != arr.length) {
                char temp = arr[i];
                if (count[temp] == 0) {
                    arr[j] = arr[i];
                    j++;
                }
                i++;
            }

            base = new String(arr);

            return base.substring(0, j);
        }

        String convert(String text, String cipher){

            String noDuplicatesInCipher = Arrays.asList(cipher.split(""))
                    .stream()
                    .distinct()
                    .collect(Collectors.joining());

            String alphabet= normalChar.toString();

            String nonRepeatInAlphabet= removeDirtyChars(alphabet,noDuplicatesInCipher);
            String reverse = new StringBuffer(nonRepeatInAlphabet).reverse().toString();

            String cipherpad=noDuplicatesInCipher+reverse;

            return  cipherpad;
        }

        private int[] makeCipher(String cipher){
             int[] ready=new int[26];

             for(int i=0;i<cipher.length();i++){
                 ready[i] = cipher.charAt(i) -'A';
             }
            return ready;
        }
    }

    public IEncryptable getMonoCipherMethod(){
        return new MonoEncryption();
    }

}

import java.util.Scanner;

public class RouteCipher {
    private int key;
    private String str="";
    RouteCipher(){
        setKey(0);
    }

    RouteCipher(int key){
        setKey(key);
    }

    public int getKey(){
        return key;
    }
    public void setKey(int key){
        this.key=key;
    }

    public String decrypt(String cipherText) {
        return str;
    }

    public String encrypt(String plainText){
        String s= plainText.replaceAll("\\s+","").toUpperCase();
        plainText=s.replaceAll("[!.,?]","");
        char[] cipherTextChars=plainText.toCharArray();

        boolean isNegative=false;
        if(key<0) {
            isNegative=true;
            setKey(-key);
        }

        int rows=0;
        if(plainText.length()% key != 0){
            rows=plainText.length()/key +1;
        }else{
            rows=plainText.length()/key;
        }

        int counterForChars=0;
        char[][] matrix = new char[key][rows];

        for(int i = 0; i <rows; i++) {
            for(int j = 0; j < key; j++) {
                if(counterForChars >= plainText.length()){
                    matrix[j][i]='X';
                }else {
                    matrix[j][i] = cipherTextChars[counterForChars];
                }
                counterForChars++;
            }
        }
        String result="";
        if(isNegative){
            result=fromBottomRight(matrix,key,rows);
            setKey(-key);
        }else {
            result=fromTopLeft(matrix, key, rows);
        }
      return result;
    }

    private String fromTopLeft(char[][] matrix, int rows, int col) {
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = col - 1;
        int count = 0;
        while (colStart <= colEnd && rowStart <= rowEnd) {
            for (int i = colStart; i < colEnd; i++) {
                str+=matrix[rowStart][i];
                count++;
            }
            for (int i = rowStart; i < rowEnd; i++) {
                str+=matrix[i][colEnd];
                count++;
            }
            for (int i = colEnd; i > colStart; i--) {
                if (count >= rows * col) break;
                str+=matrix[rowEnd][i];
                count++;
            }
            for (int i = rowEnd; i > rowStart; i--) {
               str+=matrix[i][colStart];
                count++;
            }
            rowStart++;
            colEnd--;
            rowEnd--;
            colStart++;
        }
        return str;
    }

    private String fromBottomRight(char[][] matrix, int rows, int col) {
        int rowStart = 0;
        int rowEnd = rows - 1;
        int colStart = 0;
        int colEnd = col - 1;
        int count = 0;
        while (colStart <= colEnd && rowStart <= rowEnd) {
            for (int i = colEnd; i > colStart; i--) {
               str+=matrix[rowEnd][i];
                count++;
            }
            for (int i = rowEnd; i > rowStart; i--) {
                str+=matrix[i][colStart];
                count++;
            }
            for (int i = colStart; i < colEnd; i++) {
                if (count >= rows * col) break;
               str+=matrix[rowStart][i];
                count++;
            }
            for (int i = rowStart; i < rowEnd; i++) {
                str+=matrix[i][colEnd];
                count++;
            }


            rowStart++;
            colEnd--;
            rowEnd--;
            colStart++;
        }
        return str;
    }

    public String toString() {
        return String.format("The key is: %d\nThe text is: %s", key,str);
    }
}
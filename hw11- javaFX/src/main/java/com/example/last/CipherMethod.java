package com.example.midtermfx;

public class CipherMethod {
     private IEncryptable callbackFtn;

     CipherMethod(){
     }
    String encryptText(String plainText, String cipher){
        callbackFtn=new Encryption().getMonoCipherMethod();
        return callbackFtn.encrypt(plainText,cipher);
    }

    String decryptText(String cipherText, String cipher){
        callbackFtn=new Encryption().getMonoCipherMethod();
        return callbackFtn.decrypt(cipherText, cipher);
    }

}

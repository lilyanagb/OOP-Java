package com.example.regfx;

public class ValidateInput {
   public boolean validateName(String name) {
      return name.matches("^[A-Z][a-z]{2,}$" );
   } 

   public boolean validatePhone( String phone ) {

      return phone.matches( "^\\((\\d{4})\\)\\((\\d{7})\\)$" );
   }

   public boolean validateEmail( String email ) {
      return email.matches( "^[A-Za-z0-9+_.-]+@(.+)$" );
   }

   public boolean validatePassword( String password ) {
      return password.matches( "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$" );
   }
  
}
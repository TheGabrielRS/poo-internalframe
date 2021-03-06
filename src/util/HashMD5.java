/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author gabrielsa
 */
public class HashMD5 {
    
    public String encriptar(String plaintext){
        try{
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(plaintext.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1,digest);
            String hashtext = bigInt.toString(16);
            // Now we need to zero pad it if you actually want the full 32 chars.
            while(hashtext.length() < 32 ){
              hashtext = "0"+hashtext;
            }
            return hashtext;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        
    }
}

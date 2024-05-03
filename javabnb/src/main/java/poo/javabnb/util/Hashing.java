package poo.javabnb.util;
import java.security.MessageDigest;

public class Hashing {
    /**
     * Generates a hashed password.
     * @param passwordToHash the password
     * @return a new String with the hashed passwordl.
     */
    public static String hashPassword(String passwordToHash) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] bytes = md.digest(passwordToHash.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for(byte b: bytes){
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        return generatedPassword;
    }
}
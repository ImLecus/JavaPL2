package poo.javabnb.util;
import java.security.MessageDigest;
import java.security.MessageDigestSpi;

public class Hashing {

    public static String hashInfo(String toHash) {
        String generatedHash = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            byte[] bytes = md.digest(toHash.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder();
            for(byte b: bytes){
                sb.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            generatedHash = sb.toString();
        } 
        catch (Exception e){
            e.printStackTrace();
        }
        return generatedHash;
    }
}
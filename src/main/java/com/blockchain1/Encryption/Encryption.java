package com.blockchain1.Encryption;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {
    public static String sha256(String origin){
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-256");
        }catch (NoSuchAlgorithmException e){
            e.printStackTrace();
        }

        assert digest != null;
        byte[] byteHash = digest.digest(origin.getBytes(StandardCharsets.UTF_8));

        StringBuilder hexHash = new StringBuilder();

        for (byte hash : byteHash) {
            String hexDigit = Integer.toHexString(0xff & hash);

            if (hexDigit.length() == 1) {
                hexHash.append('0');
            }
            hexHash.append(hexDigit);
        }
        return hexHash.toString();
    }
}

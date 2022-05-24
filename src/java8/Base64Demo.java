package java8;

import java.util.Arrays;
import java.util.Base64;

public class Base64Demo {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] bytes = {1,2,3,4,5};
        byte[] encodedBytes = encoder.encode(bytes);
        String encodedStr = encoder.encodeToString(bytes);
        System.out.println(encodedStr);

        Base64.Decoder decoder = Base64.getDecoder();

        String dec = new String(decoder.decode(encodedBytes));
     //   byte[] decodedBytes = decoder.decode(encodedBytes);
        System.out.println(Arrays.toString(decoder.decode(encodedStr)));


        String str = "CODEKUL";
        byte[] encodedStr1 = encoder.encode(str.getBytes());
        byte[] decodedStr = decoder.decode(encodedStr1);
        String newString = new String(decodedStr);
        System.out.println(newString);
    }
}

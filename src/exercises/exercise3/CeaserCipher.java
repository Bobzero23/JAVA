package exercises.exercise3;

public class CeaserCipher {
        public static void main(String[] args) {
            String alphabet = "ABCDEFGHIJKLMNOPRSTUWVXYZ";
            String message = "GOING TO SCHOOL";
            int key = 2;
            int tmp;
            String cipher = "";

            // Encryption
            for (int i = 0; i < message.length(); i++) {
                tmp = alphabet.indexOf(message.charAt(i));
                tmp += key;
                tmp = tmp % alphabet.length();
                cipher += alphabet.charAt(tmp);
            }

            System.out.println("Encrypted Message: " + cipher);

            // Decryption
            String decryptedMessage = "";
            for (int i = 0; i < cipher.length(); i++) {
                tmp = alphabet.indexOf(cipher.charAt(i));
                tmp -= key;
                if (tmp < 0) {
                    tmp += alphabet.length();
                }
                decryptedMessage += alphabet.charAt(tmp);
            }

            System.out.println("Decrypted Message: " + decryptedMessage);
        }
}

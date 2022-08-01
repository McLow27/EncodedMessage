public class Encoded {
    public static void main(String[] args) {
        String original = "";
        String encode = "";
        char[][] decode = {
                { 'e', 'e', 'd', 'A', 'R' },
                { 'B', 't', 'V', 'r', 'o' },
                { 'l', 's', 'i', 'e', 's' },
                { 'u', 'A', 'o', 'R', 'e' },
                { 'e', 'r', 'l', 'e', 's' }
        };

        for (int i = decode.length - 1; i >= 0; i--) {
            for (int j = 0; j < decode.length; j++) {
                encode += decode[j][i];

            }

        }
        for (int i = 0; i < decode.length; i++) {
            for (int j = 0; j < decode.length; j++) {
                original += decode[i][j];

            }

        }
        System.out.println("Original: " + original);
        System.out.println("After " + encode);

    }
}

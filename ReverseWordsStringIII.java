public class ReverseWordsStringIII {

    public static String reverseString(String s) {
        StringBuffer sb = new StringBuffer();
        int strLength = s.length();
        int left = 0;

        for (int i = 0; i < strLength; ++i) {
            char c = s.charAt(i);

            if (c == ' ' || i == strLength - 1) {
                int right;
                if (i == strLength - 1) {
                    right = i;
                } else {
                    right = i - 1;
                }

                while (right >= left) {
                    sb.append(s.charAt(right));
                    right--;
                }

                if (i != strLength - 1) {
                    sb.append(" "); // Add space between reversed words
                }

                left = i + 1;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String name = "Imran Hussain Shah";
        System.out.println(reverseString(name));
    }
}

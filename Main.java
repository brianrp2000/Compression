import java.util.ArrayList;

/**
 * Created by brian on 04/09/2018.
 */
public class Main {
    public static void main(String[] args) {
        String str="aaaaabbbbaaabbccccbbb";
        System.out.println(compress(str));

    }
    static String compress(String str) {
        int count = 1;

        char last = str.charAt(0);

        StringBuilder output = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == last) {
                count++;
            } else {
                if (count > 1) {
                    output.append("" + count + last);
                } else {
                    output.append(last);
                }
                count = 1;
                last = str.charAt(i);
            }
        }
        if (count > 1) {
            output.append("" + count + last);
        } else {
            output.append(last);
        }
        return output.toString();
    }
}

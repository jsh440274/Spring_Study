import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        int ret = 0;
        for (int i = line.length() - 1; i >= 0; i--) {
            char c = line.charAt(i);
            if (i != 0) {
                if (c == '=') {
                    char c2 = line.charAt(i - 1);
                    if (c2 == 'c' || c2 == 's') {
                        i--;
                    } else if (c2 == 'z') {
                        if (i != 1 && line.charAt(i - 2) == 'd') {
                            i--;
                        }
                        i--;
                    }
                } else if (c == '-') {
                    char c2 = line.charAt(i - 1);
                    if (c2 == 'c' || c2 == 'd') {
                        i--;
                    }
                } else if (c == 'j') {
                    char c2 = line.charAt(i - 1);
                    if (c2 == 'l' || c2 == 'n') {
                        i--;
                    }
                }
            }
            ret++;
        }

        System.out.println(ret);
    }
}
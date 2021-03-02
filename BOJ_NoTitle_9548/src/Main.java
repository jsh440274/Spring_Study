import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        while (T != 0) {
            T--;
            String S = br.readLine();
            String line = br.readLine();
            while (!line.equals("END")) {
                String[] oper = line.split(" ");
                StringBuilder sb = new StringBuilder();
                if (oper[0].charAt(0) == 'I') {
                    int index = Integer.parseInt(oper[2]);
                    String a = S.substring(0, index);
                    String b = S.substring(index);
                    sb.append(a);
                    sb.append(oper[1]);
                    sb.append(b);
                    S = sb.toString();
                } else {
                    int start = Integer.parseInt(oper[1]);
                    int end = Integer.parseInt(oper[2]) + 1;
                    bw.write(S, start, end);
                    bw.newLine();
                    bw.flush();
                }
                line = br.readLine();
            }
        }
        br.close();
        bw.close();
    }
}
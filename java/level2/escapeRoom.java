import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class escapeRoom {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1Length = br.readLine();
        String num1s = br.readLine();
        String[] num1Arr = num1s.split(" ");

        String num2Length = br.readLine();
        String num2s = br.readLine();
        String[] num2Arr = num2s.split(" ");

        HashSet<String> num1List = new HashSet<String>();

        for (int i = 0; i < num1Arr.length; i++) {
            num1List.add(num1Arr[i]);
        }

        for (int j = 0; j < num2Arr.length; j++) {
            if (num1List.contains(num2Arr[j])) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        br.close();
    }
}
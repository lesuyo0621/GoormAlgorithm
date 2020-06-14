import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class basicBit2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] st = input.split(" ");
        int num1 = Integer.parseInt(st[0]);
        int num2 = Integer.parseInt(st[1]);

        System.out.println(num1 >> num2);
        System.out.print(num1 << num2);
    }

}
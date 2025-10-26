import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br= new BufferedReader(inputStreamReader);

        System.out.print("Please provide any input: ");
        String text = br.readLine();
        System.out.println("User Input: " + text);

    }
}
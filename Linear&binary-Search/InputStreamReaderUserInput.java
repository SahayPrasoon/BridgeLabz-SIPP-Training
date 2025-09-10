import java.io.*;

public class InputStreamReaderUserInput {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter("user_input.txt")) {
            String input;
            System.out.println("Enter text (type 'exit' to quit):");
            while (!(input = br.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

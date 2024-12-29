import java.io.*;

public class FileCopyWithReplacement {
    public static void main(String[] args) {
        // Ścieżki do plików
        String inputFilePath = "c:\\Vistula\\zadanie10.3\\input.txt";
        String outputFilePath = "c:\\Vistula\\zadanie10.3\\output.txt";

        // try-with-resources
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replace(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("Plik został skopiowany z zamianą spacji na myślniki.");
        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas odczytu lub zapisu pliku: " + e.getMessage());
        }
    }
}

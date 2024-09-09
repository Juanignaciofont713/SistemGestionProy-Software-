package SistGestionProy;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVWriter {
    public static void escribirCSV(String archivo, List<String[]> datos) {
        try (FileWriter writer = new FileWriter(archivo)) {
            for (String[] dato : datos) {
                writer.append(String.join(",", dato));
                writer.append("\n");
            }
        } catch (IOException e) {
        }
    }
}

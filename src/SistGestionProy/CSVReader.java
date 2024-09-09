package SistGestionProy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List<String[]> leerCSV(String archivo) {
        List<String[]> datos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] campos = linea.split(",");
                datos.add(campos);
            }
        } catch (IOException e) {
        }
        return datos;
    }
}
package tp0;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TP0_1_2 {
    static final String INPUT_FILE_PATH = "src/tp0/input_files/entrada.txt";
    static final String OUTPUT_FILE_PATH = "src/tp0/output_files/odd_lines.txt";

    public static void main(String[] args) throws Exception {
        oddLines();
    }

    private static void oddLines() {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(INPUT_FILE_PATH));
            String line;
            String out = "";
            int i = 1;

            while ((line = buffReader.readLine()) != null) {
                if (i % 2 != 0) {
                    out += line + "\n";
                }
                // out += "\n";
                i++;
            }
            buffReader.close();
            out = out.substring(0, out.length() - 1);

            BufferedWriter buffWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE_PATH));
            buffWriter.write(out);
            buffWriter.close();
        } catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage() + "\nEl archivo de entrada no existe.");
        } catch (IOException ex) {
            System.err.println("Error leyendo o escribiendo en algun archivo.");
        }
    }
}

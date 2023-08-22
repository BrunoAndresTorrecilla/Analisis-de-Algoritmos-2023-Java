package tp0;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import utiles.Aleatorio;

public class TP0_1_3 {
    static final String OUTPUT_FILE_PATH = "src/tp0/output_files/random_numbers.txt";
    static final int QUANTITY = 100;

    public static void main(String[] args) throws Exception {
        random();
    }

    private static void random() {
        try {
            int i;
            String out = "";

            for (i = 0; i < QUANTITY; i++) {
                out += Aleatorio.doubleAleatorio(-100, 100) + "\n";
            }

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

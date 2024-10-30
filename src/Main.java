import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            WriteLines cp = new WriteLines(args[0]);
        } catch (IOException ex) {
            System.out.println("Errore di I/O");
            System.exit(1);
        }
    }
}

class WriteLines {
    public WriteLines(String nfile) throws IOException {
        PrintWriter output;
        output = new PrintWriter(new FileWriter(nfile));
        BufferedReader input;
        input = new BufferedReader(new InputStreamReader(System.in));
        
        String linea;
        linea = input.readLine();

        while (!linea.equals("")) {
            output.println(linea);
            linea = input.readLine();
        }
    }
}
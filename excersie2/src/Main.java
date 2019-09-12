import com.enigma.model.Tugas;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input nilai Kordinat =");
        String coordinate = br.readLine();
        String [] posts = coordinate.split(",");
        Tugas rush = new Tugas(Integer.parseInt(posts[0]), Integer.parseInt(posts[0]));

        System.out.print("Masukan jumlah bahan bakar =");
        String fuel = br.readLine();
        int fullFuel = Integer.parseInt(fuel);
        rush.getFuel(fullFuel);

        System.out.print("Masukan perintah =");
        String comand = br.readLine();
        rush.setCommand(comand);

        rush.setRun();

        rush.print();

    }
}

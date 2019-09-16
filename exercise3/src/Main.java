import com.enigma.main.Direction;
import com.enigma.main.Robot;

import java.io.BufferedReader;
import java.io.IOException ;
import java.io.InputStreamReader;
public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Masukan Kordinat Anda (x,y) :");
        String inpNama = baca.readLine();
        String chor [] = inpNama.split(",");
        System.out.println("Kordinat Anda :" + chor[0]+ "," + chor[1]+","+chor[2]);
        Robot jarvis = new Robot(Integer.parseInt(chor[0]),Integer.parseInt(chor[1]),Direction.valueOf(chor[2]));

        System.out.println("Make your move :");
        String inpMove = baca.readLine();
        jarvis.move(jarvis.setCommand(inpMove));
        jarvis.run();
    }
}

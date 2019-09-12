import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException; 

public class TugasNama
{ 
    public static void main( String[] args )throws IOException{ 

      BufferedReader baca = new BufferedReader(new InputStreamReader( System.in) );
      System.out.print("Input Jumlah data:");   
      String jumData = baca.readLine();
      int n = Integer.parseInt(jumData);
      String[] name = new String[n];
      Integer[] umur = new Integer[n];
int numb = 1 ;
 for(int i = 0; i < n; i++){
      System.out.println("silahkan masukan data:"+numb ++);      
      System.out.print(" Name:"); 
       name[i]  = baca.readLine();
       System.out.print(" umur:");   
       umur[i] = Integer.parseInt(baca.readLine());
 }
 System.out.println("========Hasil===========" );
 // menampilkan semua isi array
      System.out.println("|Nama | Umur |");

         for(int i = 0; i < n; i++){
        System.out.print(name[i]);
        System.out.print("  |  ");
        System.out.println(umur[i]);
         }
   } 
}
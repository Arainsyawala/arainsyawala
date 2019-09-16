public class BelajarMethod{

    public static String nama ="Ragil Arain Sawala";

    public static String getNama(){
        return nama;
    }

    public static int HitungUmur(int lahir,int sekarang){
        int umur=sekarang - lahir;
        return umur;
    }

    public static void main(String[]args) {

        String NamaSaya = getNama();
        System.out.println("Nama saya adalah = " + NamaSaya);

        int UmurSaya = HitungUmur(1999,2019);
        System.out.println("Saya berusia = " + UmurSaya);

        int a=3;
        int b=a;
        a=4;
        System.out.println(b);
    }
}
/*  File        : Asersi2.java
    Deskripsi   : Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 7 - Maret - 2025
 */

//class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari > 0) : "Jari-jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}


//PETANYAAN : secara konsep, ada yang kurang tepat pada program Asersi2 di atas.
//Jawaban Peratanyaan : Pada program Asersi2, asersi yang digunakan tidak sesuai dengan kondisi yang diinginkan.



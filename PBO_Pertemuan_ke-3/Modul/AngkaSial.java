/*  File        : AngkaSial.java
    Deskripsi   : Program penggunaan exception buatan sendiri pengenalan klausa 'throw' dan 'throws'
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 7 - Maret - 2025
*/
public class AngkaSial {

    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka +" bukan angka sial ");
    }

    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase ){
            System.out.println(ase.getMessage());
            System.out.println("hati hati dalam memasukan angka !!");
        }
    }
}

/*PERTANYAAN:
Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

Jawaban Pertanyaan:
Baris 12:
Ketika eksepsi dilempar (misalnya, pada pernyataan throw new AngkaSialException();), alur eksekusi segera melompat ke blok catch yang sesuai. Sehingga, semua pernyataan yang ada setelah pernyataan throw di dalam blok try (misalnya, baris 12) tidak dieksekusi.

Baris 21:
Setelah blok catch selesai menangani eksepsi, eksekusi program akan dilanjutkan dengan pernyataan-pernyataan yang ada setelah blok try-catch. Oleh karena itu, baris 21 tetap dieksekusi.
*/
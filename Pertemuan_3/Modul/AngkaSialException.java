/*  File        : AngkaSialException.java
    Deskripsi   : Eksrpsi buatan sendiri, menolak angka 13
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 7 - Maret 2025
*/
public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukan angka 13 karena angka sial !!!");
    }
}

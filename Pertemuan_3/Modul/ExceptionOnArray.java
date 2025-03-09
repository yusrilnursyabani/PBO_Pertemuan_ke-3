/*  File        : ExceptionOnArray.java
    Deskripsi   : Program penggunaan eksepsi menggunakan class library Java
    Pembuat     : Moh Yusril Nur Syabani - 24060123140181
    Tanggal     : 7 - Maret - 2025
 */


public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}    


 //java exeption documentation
//hierarki exeption di java adalah
//Throwable
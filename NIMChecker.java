package exception;
import java.util.Scanner;

//membuat custom exception untuk NIM yang tidak valid
class InvalidNIMException extends Exception {
    //konstruktor untuk mengatur pesan kesalahan
    public InvalidNIMException(String message) {
        super(message);
    }
}

//main class
public class NIMChecker {
    //method untuk validasi format NIM
    public static void validateNIM(String nim) throws InvalidNIMException {
        //cek panjang NIM 15 angka
        if (nim.length() != 15) {
            throw new InvalidNIMException("NIM kamu kurang panjang nih~");
        }
        
        //cek dua digit pertama NIM "24"
        if (!nim.startsWith("24")) {
            throw new InvalidNIMException("Waduh ga boleh! Kamu harus ganti angkatan dulu ke 24 :3");
        }
    }
    
    public static void main(String[] args) {
        //membuat objek scanner untuk baca input
        Scanner scanner = new Scanner(System.in);
        String nim;
        
        //membuat loop hingga nim yang diinput tepat
        while (true) {
            System.out.print("Masukkan NIM kamu~ : ");
            nim = scanner.nextLine();
            
            try {
                //memanggil method untuk validasi NIM
                validateNIM(nim);
                System.out.println("Yay! Berhasil login~ :D");
                break;
            } catch (InvalidNIMException e) {
                //menangkap exception dan menampilkan pesan kesalahan
                System.out.println(e.getMessage());
                System.out.println("NIM ini nggak valid :(");
                System.out.println("Coba lagi yuk! ^_^");
                System.out.println();
            }
        }
    }
}
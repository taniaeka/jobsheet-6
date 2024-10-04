import java.util.Scanner;

public class flowchart2 {
    public static void main(String[] args) {
        Scanner Absen24 = new Scanner(System.in);

        String jenisBuku, hari;
        int jumlahBuku, harga;
        double diskon, totalDiskon, hargaBuku = 0;
        
        System.out.print(" jenis buku : ");
        jenisBuku = Absen24.nextLine();
        System.out.print(" jumlah buku : ");
        jumlahBuku = Absen24.nextInt();
        Absen24.nextLine();
        System.out.print(" hari: ");
        hari = Absen24.nextLine();
        System.out.print(" harga : ");
        harga = Absen24.nextInt();

        if (hari.equalsIgnoreCase("rabu")) {
           if (jenisBuku.equalsIgnoreCase("kamus")) {
                diskon = (1-0.1) * harga;
                if (jumlahBuku > 2) {
                    hargaBuku = (1.0-0.02) * diskon;
                } else {
                    hargaBuku=(diskon);
                }
                totalDiskon=(harga * jumlahBuku) - hargaBuku;
           } else if (jenisBuku.equalsIgnoreCase("novel")) {
                diskon = (1.0 - 0.1) * jumlahBuku * harga;
                if (jumlahBuku > 3) {
                    hargaBuku = (1.0-0.02) * diskon;    
                } else  {
                    hargaBuku = (1.0-0.01) * diskon;   
                }
                totalDiskon=(harga * jumlahBuku) - hargaBuku;
            } else {
                if (jumlahBuku > 3) {
                    hargaBuku = (1.0-0.05) * harga * jumlahBuku;
                } else {
                    hargaBuku = 0;
                }
                totalDiskon=(harga * jumlahBuku) - hargaBuku;
            }
            System.out.println("total diskon : " + totalDiskon);
            System.out.println("total bayar : " + hargaBuku);
        } else {
            System.out.println("tidak mendapat diskon");
        }


    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        Tendik karyawan1 = new Tendik(131, "Santoso", "Dompu", "15-Juli-1997", "Laki-Laki", 2022);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(50000);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(149, "Dimas", "Karimun", "09-April-1978", "Laki-Laki", 1999);
        dosen1.setNomorIndukDosen(987123);
        dosen1.setJurusan("Teknik Industri");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}
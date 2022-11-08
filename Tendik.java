public class Tendik extends Karyawan {
    public int waktu;

    public Tendik(int nip, String newName, String newAlamat, String newLahir, String newJensiKelamin,
            int newTahunMasuk) {
        this.nomorPegawai = nip;
        this.nama = newName;
        this.alamat = newAlamat;
        this.lahir = newLahir;
        this.jenisKelamin = newJensiKelamin;
        this.tahunMasuk = newTahunMasuk;
    }

    void display() {
        System.out.println("Nomor Pegawai   : " + this.nomorPegawai);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Lahir           : " + this.lahir);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Tahun Masuk     : " + this.tahunMasuk);
        System.out.println("Gaji Pokok      : Rp." + this.gaji);
    }

    void displaygaji() {
        System.out.println("Waktu Lembur    : " + this.tampilinWaktuLembur() + " Jam");
        System.out.println("Gaji Setelah Bonus Lembur : Rp." + this.getLembur());
    }
}
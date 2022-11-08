public class Dosen extends Karyawan {
    private String jurusan;
    private int nidn;
    private int uangLembur = 100000;

    public Dosen(int nip, String newName, String newAlamat, String newLahir, String newJensiKelamin,
            int newTahunMasuk) {
        this.nomorPegawai = nip;
        this.nama = newName;
        this.alamat = newAlamat;
        this.lahir = newLahir;
        this.jenisKelamin = newJensiKelamin;
        this.tahunMasuk = newTahunMasuk;
    }

    public void setJurusan(String newJurusan) {
        this.jurusan = newJurusan;
    }

    public String getJurusan() {
        return this.jurusan;
    }

    public void setNomorIndukDosen(int newNomorInduk) {
        this.nidn = newNomorInduk;
    }

    public int getNomorIndukDosen() {
        return this.nidn;
    }

    void displayDosen_Jurusan() {
        System.out.println("No Induk Dosen  : " + this.nidn);
        System.out.println("Jurusan Dosen   : " + this.jurusan);
    }

    void display() {
        System.out.println("Nomor Pegawai   : " + this.nomorPegawai);
        System.out.println("Nama            : " + this.nama);
        System.out.println("Alamat          : " + this.alamat);
        System.out.println("Lahir           : " + this.lahir);
        System.out.println("Jenis Kelamin   : " + this.jenisKelamin);
        System.out.println("Tahun Masuk     : " + this.tahunMasuk);
        System.out.println("Gaji Pokok      : " + this.gaji);
    }

    @Override
    public int getUangLembur() {
        return this.uangLembur;
    }

    @Override
    public int getLembur() {
        return (this.uangLembur * this.waktu) + this.gaji;
    }

    void displaygaji() {
        System.out.println("Total Gaji       : Rp." + this.getLembur());
    }

}
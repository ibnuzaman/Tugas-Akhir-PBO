public class Karyawan {
    protected int nomorPegawai;
    protected String nama;
    protected String alamat;
    protected String lahir;
    protected String jenisKelamin;
    protected int tahunMasuk;
    protected int gaji = 2000000;
    protected int waktu;
    private int uangLembur;

    public void waktuLembur(int time){
        this.waktu = time;
    }

    public int tampilinWaktuLembur(){
        return this.waktu;
    }
    protected void setUangLembur(int uang){
        this.uangLembur = uang;
    }
    public  int getUangLembur(){
        return this.uangLembur;
    }
    public int getLembur(){
        return (this.uangLembur * this.waktu) + this.gaji;
    }

}
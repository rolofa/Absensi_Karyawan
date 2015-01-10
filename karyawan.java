
/**
 * Write a description of class karyawan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class karyawan
{
    public static final int min_jam = 8;
    private String nik, nama, alamat;
    private int gaji_pokok;
    waktu p = new waktu();
    
    public karyawan (String nik, String nama, String alamat, int gaji_pokok)
    {
        this.nik=nik;
        this.nama=nama;
        this.alamat=alamat;
        this.gaji_pokok=gaji_pokok;
    }
    public void setNama(String nama)
    {
        this.nama=nama;
    }
    public void dataDiri()
    {
        System.out.println("NIK \t\t:"+ nik);
        System.out.println("Nama \t\t:"+ nama);
        System.out.println("Alamat \t\t:"+ alamat);
        System.out.println("Gaji Pokok\t:"+ gaji_pokok);
    }
    public void jammasuk(int jamM, int menitM, int detikM)
    {
        p.masuk(jamM,menitM,detikM);
        p.cek();
    }
    public void jamkeluar(int jamK, int menitK, int detikK)
    {
        p.keluar(jamK,menitK,detikK);
        p.lamaJamKerja();
    }
}

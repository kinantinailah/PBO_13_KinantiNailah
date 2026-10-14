public class Pegawai {
    public String nip;
    public String nama;
    public Double gaji;

    public Pegawai(){
        System.out.println("ini constructor class Pegawai");
    }

    public String getInfo(){
        String info = "";
        info += "NIP            : " + nip + "\n";
        info += "Nama           : " + nama + "\n";
        info += "Gaji           : " + gaji + "\n";

        return info;
    }
}


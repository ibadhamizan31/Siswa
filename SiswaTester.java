//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa faddli = new Siswa();
        Siswa natan = new Siswa();
        Siswa leo = new Siswa();
        Siswa kevin = new Siswa();
        Siswa surya = new Siswa();
        

        faddli.id = 19;
        faddli.nama = "faddli";
        faddli.ipk= 90.0;
        faddli.print();

        natan.id = 27;
        natan.nama = "natan";
        natan.ipk= 88.0;
        natan.print();

        leo.id = 18;
        leo.nama ="leo";
        leo.ipk= 89.0;
        leo.print();
        
        kevin.id = 20;
        kevin.nama = "kevin";
        kevin.ipk= 78.0;
        kevin.print();
        
        surya.id = 20;
        surya.nama = "surya";
        surya.ipk= 50.0;
        surya.print();


    }
}
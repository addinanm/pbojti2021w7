package inheritancedua;

public class StaffHarian extends Staff{
    public int jmlJamKerja;

    public StaffHarian() {
    }

    public StaffHarian(int jmlJamKerja, int lembur, int potongan, String nama, String alamat, String jk, int umur, int gaji) {
        super(lembur, potongan, nama, alamat, jk, umur, gaji);
        this.jmlJamKerja = jmlJamKerja;
    }
    
    public void tampilStaffHarian(){
        System.out.println("==================Data Staff Harian=================");
        super.tampilSataStaff();
        System.out.println("Jumlah Jam Kerja    ="+jmlJamKerja);
        System.out.println("Gaji Bersih         ="+(gaji*jmlJamKerja+lembur-potongan));
    }
}

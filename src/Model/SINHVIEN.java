
package Model;
import java.util.Scanner;

public class SINHVIEN extends NGUOI implements TAIKHOAN {
    public String msv, ngoaingu, nganhnghe, sdt, tk, mk;
    public DIEM diem;
    public SINHVIEN(String msv, String ngoaingu, String nganhnghe, String sdt, DIEM diem, String hvt, String gt, String ns, String cccd) {
        super(hvt, gt, ns, cccd);
        this.msv = msv;
        this.ngoaingu = ngoaingu;
        this.nganhnghe = nganhnghe;
        this.sdt = sdt;
        this.diem = diem;
    }
    
    SINHVIEN() {}
    
    @Override
    public void setTaiKhoan(String tk, String mk) {
        this.tk = tk;
        this.mk = tk;  
    }
    
    @Override
    public String[] getTaiKhoan(){
        String[] a = {tk, mk};
        return a;
    }
    
}

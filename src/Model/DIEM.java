
package Model;
import java.io.Serializable;

public class DIEM implements Serializable{
    public float diem1, diem2, diem3,dtb;
    DIEM(){}
    public DIEM(float diem1, float diem2, float diem3) {
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.dtb = (diem1 + diem2 + diem3)/3;
    }
}

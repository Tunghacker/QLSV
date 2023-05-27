
package Model;
import java.io.Serializable;

public class NGUOI implements Serializable {
    public String hvt, gt, ns, cccd;
    NGUOI() {}
    public NGUOI(String hvt, String gt, String ns, String cccd) {
        this.hvt = hvt;
        this.gt = gt;
        this.ns = ns;
        this.cccd = cccd;
    }
    
}

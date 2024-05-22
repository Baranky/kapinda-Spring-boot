package projem.kapında.business.concretes;




import projem.kapında.business.abstracts.OdemeStrategy;
import projem.kapında.entities.concretes.Odeme;


public class KartlaOdeme implements OdemeStrategy {
    private Odeme odeme;
    @Override
    public void odemeYap(int miktar) {
        odeme.setOdemeTuru("kartla");
        //System.out.println("Kartla $" + miktar + " ödeme yapıldı.");
    }
}

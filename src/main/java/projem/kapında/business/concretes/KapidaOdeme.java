package projem.kapında.business.concretes;

import projem.kapında.business.abstracts.OdemeStrategy;
import projem.kapında.entities.concretes.Odeme;

public class KapidaOdeme implements OdemeStrategy {
     private Odeme odeme;
    @Override
    public void odemeYap(int miktar) {
        odeme.setOdemeTuru("kapıda");
       // System.out.println("kapıda $" + miktar + " ödeme yapıldı.");
    }
}

package projem.kapında;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import projem.kapında.entities.concretes.Kurye;
import projem.kapında.entities.concretes.Musteri;
import projem.kapında.entities.concretes.Restorant;
import projem.kapında.entities.concretes.Siparis;

@SpringBootApplication
public class KapındaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KapındaApplication.class, args);

		Siparis siparis = new Siparis();
		Musteri musteri = new Musteri();
		Kurye kurye = new Kurye();
		Restorant restorant=new Restorant();

		siparis.addObserver(musteri);
		siparis.addObserver(kurye);
		siparis.addObserver(restorant);
		siparis.setDurum("hazırlanıyor");
	}

	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}

}

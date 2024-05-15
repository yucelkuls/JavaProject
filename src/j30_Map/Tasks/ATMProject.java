package j30_Map.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATMProject {
	/*
	 * ATM uygulaması yapınız.
	 * 
	 * 1. Adım : Bankamızdaki müşterilerin musteriNumarasi ve 4 haneli şifresini tutan bir HashMap oluşturalım.
	 * 		     Ve şu müşterileri biz ekleyelim.
	 * 			Integer, Integer
	 * 
	 * 			Müşteri No  -- Şifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 * 
	 * 2. Adım : Bankamızdaki müşterilerin hesaplarındaki para miktarini tutan bir tane HashMap oluşturalım.
	 * 		     Ve şu miktarları müşteri numarasıyla birlikte ekleyelim
	 * 			Integer,Float
	 * 
	* 			Müşteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *  	
	 * 3. Adım : Giriş ekranı oluşturalım. Müşteri buradan giriş yapsın.
	 * 			 Kullanıcı adı ve şifre isteyelim, doğru ise giriş yapsın.
	 * 
	 * 4. Adım : Doğru müşteri numarası ve şifre kontrol eden methodlar yazalım.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, doğru müşteri numarasıdır.
	 * 
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki şifre ile uyuşuyorsa doğru şifredir.
	 * 
	 * 5. Adım : Girş yaptıktan sonra karşısına 3 tane seçenek çıksın : 
	 * 			 Bunları da menuGoster() methodu ile yapalım.
	 * 			 1- Para Çek			// 300
	 * 			 2- Para Yükle			// 500 + 100
	 * 			 3- Toplam Paramı Gör	// 200
	 * 			 4- Çıkış Yap	
	 * 
	 * 6. Adım : Çıkış methodu oluşturalım.
	 * 			 Giriş yapan müşteri çıkış yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sıfırlayalım.
	 * 			 Tekrar giriş ekranına yöndendirelim.	
	 * 
	 * 6. Adım : Toplam parami gor methodu oluşturalım. toplamParamiGor()
	 * 			
	 * 7. Adım : 1- Para Çekme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan çekmek istediği tutarı öğrenelim.	
	 * 			 Hesabında yeterli para varsa, para çeksin yoksa uyarı verelim.
	 * 			 Çektiği tutarı, toplam parasından düşelim ve kaydedelim.		
	 *			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 		  
	 * 8. Adım : 1- Para Yükleme Methodu Oluşturalım
	 * 			 Hesaba giriş yapan müşteriye hesabındaki toplam parayı gösterelim.
	 * 			 Kullanıcıdan yüklemek istediği tutarı öğrenelim.	
	 * 			 Yüklediği tutarı, toplam parasına ekleyelim ve gösterelim.
	 * 			 Başka işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi gerçekleştirelim.
	 * 
	 * */
	//Müşteri No ve Şifreyi tutmak için HashMap oluşturduk.

	public static void main(String[] args) {


	}
}
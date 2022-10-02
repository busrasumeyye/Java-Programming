package inheritanceDemo;

public class Main {
	public static void main(String[] args) {
		
		//amaç değişime direnmeyen programlar yapmak
		//OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		//ogretmenKrediManager.Hesapla();

		KrediUI krediUI = new KrediUI();
		krediUI.KrediHesapla(new OgretmenKrediManager());
}
}


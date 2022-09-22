
public class Main {

	public static void main(String[] args) {
		
		String ogrenci1 = "Engin";
		String ogrenci2 = "Ahmet";
		String ogrenci3 = "Selim";
		String ogrenci4 = "Metin";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		
		System.out.println("-----------------------------------");
		
		String[] ogrenciler = new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Ahmet";
		ogrenciler[2]="Selim";
		ogrenciler[3]="Metin";
		
		for(int i=0;i<ogrenciler.length;i++) // i öğrenciler dizisindeki eleman sayisindan kücük oldugu sürece döngü calisir
		{
			System.out.println(ogrenciler[i]); //i 1'er 1'er arttigi icin index numarasina gore sira sira elamanlar yazilir.
			
		}
		
		//dizilerin index'leri 0'dan baslar.
		
		for (String ogrenci : ogrenciler) // Ogrenciler dizisindeki tüm elemanlari gez ve anlik olarak ogrenci degiskeninde her bir elemanı tut.
		{
			
		}
	}

}

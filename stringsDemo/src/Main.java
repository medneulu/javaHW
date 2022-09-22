
public class Main {

	public static void main(String[] args) {
		
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
		
//	System.out.println("Eleman sayısı = " + mesaj.length());
//	System.out.println("5. Eleman = " + mesaj.charAt(4));
//	System.out.println(mesaj.concat(" Yaşasın!"));
//	System.out.println(mesaj.startsWith("A"));
//	System.out.println(mesaj.endsWith("."));
//	char[] karakterler = new char[5];
//	mesaj.getChars(0, 4, karakterler, 0);
//	System.out.println(karakterler);
//	System.out.println(mesaj.indexOf('a'));
		
		String yeniMesaj = mesaj.replace(' ', '-'); // belirtilen degerleri degistirir.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4));// cümle icerisindeki belirtilen degerler arasindaki karakterleri gosterir.

		for(String kelime : mesaj.split(" ")) { // split kelimeleri birbirinden ayirir.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase()); // toLowerCase harfleri kücültür, toUpperCase ise bu islemin tam tersini yapar.
		System.out.println(mesaj.trim()); // cümlenin basindaki ve sonundaki bosluklari atar.
	}

}

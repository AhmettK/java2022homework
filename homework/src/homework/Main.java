package homework;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		System.out.println("Merhaba Java");
		//-------------------------------------
		int ogrenciSayisi=10;
		String mesaj="��renci Say�m: ";
		System.out.println(mesaj+ogrenciSayisi);
		//-------------------------------------
		double sayi0=12.5;
		sayi0=-129;
		char karakter='A';
		boolean dogruMu=false;
		//-------------------------------------
		int sayi= 24;
		if(sayi<20) {
			System.out.println("Say� 20den k���kt�r.");
		}
		else if(sayi==20) {
			System.out.println("Say� 20dir.");
		}
		else {
			System.out.println("Say� 20den b�y�kt�r.");
		}
		//-------------------------------------
		int sayi1=20;
		int sayi2=25;
		int sayi3=2;
		int enBuyuk=sayi1;
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		System.out.println("En b�y�k say�: "+enBuyuk);
		//--------------------------------------
		char grade='B';
		switch (grade) {
		case 'A':
			System.out.println("M�kemmel Ge�tin");
			break;
		case 'B':
		case 'C':
			System.out.println("Ge�tin");
			break;
		case 'D':
			System.out.println("K�l Pay� Ge�tin");
			break;
		case 'F':
			System.out.println("Kald�n");
			break;
		default:
			System.out.println("Ge�ersiz not girdiniz");
		}
		//--------------------------------------
		for (int i = 2; i < 10; i+=2) {
			System.out.println(i);
		}
		System.out.println("for bitti");
		int i=1;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("while bitti");
		int j=0;
		do {
			System.out.println(j);
			j+=2;
		} while (j<10);
		System.out.println("do-while bitti");
		//--------------------------------------
		String[] ogrenciler=new String[3];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Salih";
		for(int k=0;k<ogrenciler.length;k++) {
			System.out.println(ogrenciler[k]);
		}
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
		//-------------------------------------
		double[] myList= {1.2,6.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(max<number) {
				max=number;
			}
			total=total+number;
			System.out.println(number);
		}
		System.out.println(total);
		System.out.println(max);
		//--------------------------------------
		String[][] sehirler = new String[3][3];
		sehirler[0][0]="�stanbul";
		sehirler[0][1]="Bursa";
		sehirler[0][2]="Sakarya";
		sehirler[1][0]="Ankara";
		sehirler[1][1]="Konya";
		sehirler[1][2]="Kayseri";
		sehirler[2][0]="Diyarbak�r";
		sehirler[2][1]="�anl�urfa";
		sehirler[2][2]="Gaziantep";
		for(int a=0;a<=2;a++) {
			for(int b=0;b<=2;b++) {
				System.out.println(sehirler[a][b]);
			}
		}
		//------------------------------------
		String ileti="Bug�n hava �ok g�zel";
		System.out.println("5. eleman: "+ileti.charAt(4));
		System.out.println(ileti.concat(" ya�as�n"));
		System.out.println(ileti.startsWith("B"));
		char[] karakterler= new char[5];
		ileti.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(ileti.indexOf('a'));
		System.out.println(ileti.replace(' ', '-'));
		System.out.println(ileti.substring(2,5));
		//----------------------------------------
		int number=5;
		boolean isPrime=true;
		if(number<2) {
			System.out.println("Ge�ersiz say�");
			return;
		}
		for(int x=2;x<number;x++) {
			if(number%x==0) {
				isPrime=false;
			}
		}
		if(isPrime) {
			System.out.println("Say� asald�r");
		}
		else {
			System.out.println("Say� asal de�ildir");
		}
		//-----------------------------------------
		int number1=28;
		int toplam=0;
		for(int x=1;x<number1;x++) {
			if(number1%x==0) {
				toplam+=x;
			}
		}
		if(toplam==number1) {
			System.out.println("M�kemmel say�d�r");
		}
		else {
			System.out.println("M�kemmel say� de�ildir.");
		}
		//----------------------------------------
	}

}

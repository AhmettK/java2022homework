package homework2;

public class Main {

	public static void main(String[] args) {
		int toplam = topla(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(toplam);
		// ---------
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();
		// ---------
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 4, 5, 6 };
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		// ----------
		DortIslem dortIslem = new DortIslem();
		int total = dortIslem.Topla(3, 4);
		System.out.println(total);
		// -----------
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);

		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		//------------
		Customer customer=new Customer();
		Employee employee=new Employee();
		//------------
		KrediUI krediUI=new KrediUI();
		krediUI.KrediHesapla(new TarimKrediManager());
	}

	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;
	}

}

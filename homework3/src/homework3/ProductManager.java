package homework3;

public class ProductManager {
	public void add(Product product) {
		if(ProductValidator.isValid(product)) {
			System.out.println("�r�n eklendi: "+product.name);
		}
		else {
			System.out.println("�r�n bilgileri ge�ersiz");
		}
	}

}

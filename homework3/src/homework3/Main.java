package homework3;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger(),new OracleCustomerDao());
		customerManager.add();
		//-------------
		ManGameCalculator manGameCalculator=new ManGameCalculator();
		WomenGameCalculator womenGameCalculator=new WomenGameCalculator();
		manGameCalculator.hesapla();
		manGameCalculator.gameOver();
		womenGameCalculator.hesapla();
		womenGameCalculator.gameOver();
		//-------------
		CustomerDao customerDao=new MySqlCustomerDao();
		customerDao.add();
		//-------------
		Product product=new Product();
		product.id=1;
		product.name="Mouse";
		product.price=10;
		ProductManager productManager=new ProductManager();
		productManager.add(product);
		//-------------
		DatabaseHelper.Crud.sil();
		DatabaseHelper.Connection.create();

	}

}

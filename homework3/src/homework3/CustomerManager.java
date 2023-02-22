package homework3;

public class CustomerManager {
	private BaseLogger _baseLogger;
	private CustomerDao _customerDao;
	public CustomerManager(BaseLogger baseLogger,CustomerDao customerDao) {
		_baseLogger=baseLogger;
		_customerDao=customerDao;
	}
	public void add() {
		System.out.println("Müþteri eklendi. ");
		_baseLogger.log("log");
		_customerDao.add();
	}

}

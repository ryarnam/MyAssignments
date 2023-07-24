package week1.day2;

public class Mobile {


public void sendSms() {
		System.out.println("OPPO");
		
	}
	public long makeCall(long phnnum) {
		return phnnum;
	}
	
	public static void main(String[] args) {
		Mobile service = new Mobile();
		service.makeCall(0);
		service.sendSms();
		

	}

}

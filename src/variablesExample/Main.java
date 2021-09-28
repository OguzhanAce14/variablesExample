package variablesExample;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String phoneName="Samsung Galaxy M12";
		double phonePrice=2499.00;
		double phoneStar=4.7;
        boolean phoneIsDiscound=true;
        int phoneDiscound=6;
        System.out.println("Fiyat ;"+phonePrice*(100-phoneDiscound)/100);
        System.out.println("Telefon Markasý ;"+phoneName);
	}

}

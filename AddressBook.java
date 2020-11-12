import java.util.*;
public class AddressBook {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user's first name");
		String first= sc.nextLine(); 
		System.out.println("Enter user's second name");
		String second= sc.nextLine(); 
		System.out.println("Enter user's address");
		String address= sc.nextLine();
		System.out.println("Enter user's city name");
		String city= sc.nextLine();
		System.out.println("Enter user's state name");
		String state= sc.nextLine();
		System.out.println("Enter user's state zip code");
		int zip= sc.nextInt();
		System.out.println("Enter user's phone number");
		long phone= sc.nextLong();
		System.out.println(first +second);
	}

}


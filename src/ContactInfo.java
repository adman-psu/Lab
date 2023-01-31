import java.util.Scanner;

public class ContactInfo {

    String full_name;
    String phone_number;
    String email_address;
    String street_address;
    String city;
    String state;
    int zip_code;

    public ContactInfo(String full_name, String phone_number, String email_address,
                       String street_address, String city, String state, int zip_code) {
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email_address = email_address;
        this.street_address =street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;

    }

    public String toString(){
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.email_address = email_address;
        this.street_address =street_address;
        this.city = city;
        this.state = state;
        this.zip_code = zip_code;
        return full_name;

    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String full_name = input.nextLine();

        System.out.println("Enter your phone number: ");
        String phone_number = input.nextLine();

        System.out.println("Enter your email address: ");
        String email_address = input.nextLine();

        System.out.println("Enter your street address: ");
        String street_address = input.nextLine();

        System.out.println("Enter your city: ");
        String city = input.nextLine();

        System.out.println("Enter your state: ");
        String state = input.nextLine();

        System.out.println("Enter your zip code: ");
        int zip_code = input.nextInt();

        ContactInfo employee1 = new ContactInfo(full_name,phone_number,email_address,street_address,city,
                state,zip_code);
        System.out.println("Name: " + employee1.full_name + System.lineSeparator() +
                "Phone number: " + employee1.phone_number + System.lineSeparator() +
                "Email address: " + employee1.email_address + System.lineSeparator() +
                "Street Address: " + employee1.street_address + System.lineSeparator() +
                "City: " + employee1.city + System.lineSeparator() +
                "State: " + employee1.state + System.lineSeparator() +
                "Zip Code: " + employee1.zip_code);
    }

}


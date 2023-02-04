import java.util.ArrayList;
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
        return "Full name: " + full_name + System.lineSeparator()
        + "Phone number: " + phone_number + System.lineSeparator()
                + "Email: " + email_address + System.lineSeparator()
                + "Address: " + street_address + System.lineSeparator()
                + "City: " + city + System.lineSeparator()
                + "State: " + state + System.lineSeparator()
                + "Zip code: " + zip_code;

    }

   /* public static void printInfo(Object ContactInfo) {
        System.out.println("Name: " + full_name + System.lineSeparator() +
                "Phone number: " + phone_number + System.lineSeparator() +
                "Email address: " + email_address + System.lineSeparator() +
                "Street Address: " + street_address + System.lineSeparator() +
                "City: " + city + System.lineSeparator() +
                "State: " + state + System.lineSeparator() +
                "Zip Code: " + zip_code);
    }

    */
    public static void main(String[] args){

        /*
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

         */



        ArrayList<ContactInfo> employees = new ArrayList<>();
        ContactInfo employee2 = new ContactInfo("Adam Mason",
                "814-215-0652","exampleemail@gmail.com","1600 Pennsylvania Avenue",
                "Washington DC","MD",16601);
        ContactInfo employee3 = new ContactInfo("jane doe","814-100-1000",
                "janedoe123@gmail.com","123 Banana Street",
                "Welaka","Florida",32193);
        ContactInfo employee4 = new ContactInfo("john hancock","n/a",
                "JOHNHANCOCK@constitution.gov","1000 USA lane","washington",
                "maryland",1776);
        ContactInfo employee5 = new ContactInfo("john doe","814-102-1002",
                "johnemail@gmail.com","1002 john drive","pittsburgh","pennsylvania"
        ,15204);



        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
            }


        }


    }




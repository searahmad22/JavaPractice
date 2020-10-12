package PS04;

import java.security.SecureRandom;

public class Customer {
    public static void main(String[] args) {
        Customer cus1 = new Customer("Sear", "Ahmad", "Dushanbe", "1123",
                007, "searahmad22");

        System.out.println(cus1.toString());
    }

    private String firstName;
    private String lastName;
    private String address;
    private String cardNumber;
    private int pin;
    private String username;
    private String password;

    public Customer (String firstName, String lastName, String address, String cardNumber, int pin,
                     String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.username = username;
    }

    public Customer () {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.cardNumber = "";
        this.pin = 0;
        this.username = "";
        this.password = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (isValidPassword(password)){
            this.password = password;
        } else {
            this.password = "DefaultPassword@20";
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin=" + pin +
                ", username='" + username + '\'' +
                ", password='" + getPassword() + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    private boolean isValidPassword(String password) {
        this.password = password;
        String sambols = "@#$%";

        boolean numeric = false;
        boolean lower = false;
        boolean upper = false;
        boolean sambol = false;
        boolean status = false;

        if (password.length() >= 8 && password.length() <= 20) {
            for (int i = 0; i < password.length(); i++) {
                if (Character.isDigit(password.charAt(i))) {
                    numeric = true;
                } if (Character.isUpperCase(password.charAt(i))) {
                    upper = true;
                } if (Character.isLowerCase(password.charAt(i))) {
                    lower = true;
                }
                for (int j = 0; j < sambols.length(); j++) {
                    if (password.charAt(i) == sambols.charAt(j)) {
                        sambol = true;
                    }
                }
            }

        }
        if (upper && lower && sambol && numeric) {status = true;}

        return status;
    }

    private String generatePassword() {
        SecureRandom rand = new SecureRandom();

        String password = "";

        String sambols = "@#$%";
        String upperCases = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCases = "abcdefghijklmnopqrstuvwxyz";
        String numeric = "012345789";

        while (password.length() != 12) {

            password += sambols.charAt(rand.nextInt(sambols.length()));
            password += upperCases.charAt(rand.nextInt(sambols.length()));
            password += lowerCases.charAt(rand.nextInt(sambols.length()));
            password += numeric.charAt(rand.nextInt(sambols.length()));

        }

        return password;
    }
}

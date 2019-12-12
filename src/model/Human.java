package model;

public class Human {
    private String firstName;
    private String lastName;
    private int bornYear;
    private char gender;

    public Human(String firstName, String lastName, int bornYear, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bornYear = bornYear;
        this.gender = gender;
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

    public int getYear() {
        return bornYear;
    }

    public void setYear(int year) {
        this.bornYear = year;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void printFullName() {
        System.out.printf("Full name is %s %s\n", firstName, lastName);
    }

    public void printInfo() {
        printFullName();
        System.out.printf("Born year - %d\n", bornYear);
        System.out.printf("Gender - %c\n", gender);
    }

}
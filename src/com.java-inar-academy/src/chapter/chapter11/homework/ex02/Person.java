package chapter.chapter11.homework.ex02;

public class Person {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected String e_mail;

    public Person() {
        this("", "", "", "");

    }

    public Person(String name, String address, String phoneNumber, String e_mail) {
        this.name = name;
        this.address = address;
        this.e_mail = e_mail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getE_mail() {
        return this.e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() + "\nE-mail: " +
                getE_mail();
    }
}

package models;

public class StudentForm {
    String firstName;
    String lastName;
    String email;
    String gender;
    String phone;
    String birthday;
    String subject;
    String hobbies;
    String address;
    String state;
    String city;

    public StudentForm withfirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentForm withlastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentForm withemail(String email) {
        this.email = email;
        return this;
    }

    public StudentForm withgender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentForm withphone(String phone) {
        this.phone = phone;
        return this;
    }

    public StudentForm withbirthday(String birthday) {
        this.birthday = birthday;
        return this;
    }

    public StudentForm withsubject(String subject) {
        this.subject = subject;
        return this;
    }

    public StudentForm withhobbies(String hobbies) {
        this.hobbies = hobbies;
        return this;
    }

    public StudentForm withaddress(String address) {
        this.address = address;
        return this;
    }

    public StudentForm withstate(String state) {
        this.state = state;
        return this;
    }

    public StudentForm withcity(String city) {
        this.city = city;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getSubject() {
        return subject;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getAddress() {
        return address;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }
}

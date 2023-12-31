package SecondNum1;

public class Author {
    private String name;
    private String email;
    private char gender;
    //Getting variables
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }
    //Setting variables
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    //Just constructor
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    //Overriding method toString() to print info about author
    @Override
    public String toString() {
        return "Author name is "+name+", email is "+email+", gender is "+gender;
    }
}

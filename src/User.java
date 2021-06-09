public class User {
    int id;
    String name;
    String lastName;
    String email;
    String course;

    public User(int id,String name,String lastName,String email,String course){
        super();
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.course = course;
        this.email = email;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

}

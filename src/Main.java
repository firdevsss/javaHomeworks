public class Main {

    public static void main(String[] args) {

        Students students = new Students(2,"Firdevs","İNAL","xx1@gmail.com","Pentest");
        Students students2 = new Students(5,"KAYRA","BAY","xx3@gmail.com","Pentest");

        Instructors ınstructors1 = new Instructors(3,"Hamza","Bay","xxxBAY@gmail.com","Pentest");



        UserManager userManager = new UserManager();
        User[] users ={students, students2, ınstructors1};

        userManager.addMultiple(users);

    }
}

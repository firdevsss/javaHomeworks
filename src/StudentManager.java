public class StudentManager extends UserManager{
    public void register(User user) {
        System.out.println(user.course + " kayıt olundu.");
    }

    public void cancel(User user) {
        System.out.println(user.course + " kayıt silindi.");
    }

}

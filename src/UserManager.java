public class UserManager {
    public void add(User user) {
        System.out.println(user.id + " " + user.name + " " + user.lastName +"---"+ "KAYIT EDİLDİ.");
    }
    public void delete(User user) {
        System.out.println(user.id + " silindi.");
    }
    public void update(User user) {
        System.out.println(user.id+ " güncellendi.");
    }

    public void addMultiple(User[] users) {

        for(User user : users) {
            add(user);
        }
    }


}

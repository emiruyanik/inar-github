package week_14.assignments;


public class Question_14_18 {
    public static void main(String[] args) {
        ContactManager contactManager=new ContactManager();
        contactManager.addContact("emir","054524656");
        contactManager.addContact("cello","054552324656");
        contactManager.addContact("ahmet","5686");

        System.out.println("phone number-->"+contactManager.searchByName("emir"));
        System.out.println("name-->"+contactManager.searchByPhone("054552324656"));
        System.out.println("name-->"+contactManager.searchByPhone("5686"));

    }
}

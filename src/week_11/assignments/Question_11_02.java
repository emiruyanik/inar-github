package week_11.assignments;

public class Question_11_02 {
    public static void main(String[] args) {
        Person person=new Person("emir","yenimahalle","0565878512"
                ,"emir@gmail.com");
        Student student=new Student("yusuf","ankara","0568979",
                "yusuf@gmail.com",Student.FRESHMAN);
        Employee employee=new Employee("ali","ivedik",
                "ali@mail","05478945","macunköy",98754);
        Faculty faculty=new Faculty("elçin","cebeci",
                "047895412","elçin@gmail","odtü",
                157878,"15-18","prof");
        Staff staff=new Staff("ahmet","şentepe","054896322",
                "ahmet@mail.com","bilkent",5478,"electricman");
        System.out.println(person);
        System.out.println("_______");
        System.out.println(employee);
        System.out.println("_______");
        System.out.println(faculty);
        System.out.println("_______");
        System.out.println(staff);
        System.out.println("_______");
    }
}

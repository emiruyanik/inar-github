package week_14.assignments;


public class Question_14_20 {
    public static void main(String[] args) {
        Post post1=new Post("123456");
        post1.addTag("nature");
        post1.addTag("photo");
        post1.addTag("sea");
        System.out.println("Tags for post1-->"+post1.listOfTags());
        post1.removeTag("photo");
        System.out.println("Tags for post1-->"+post1.listOfTags());
        System.out.println("sea exists or not?-->"+post1.isExist("sea"));
        System.out.println("___________________________________________");
        Post post2=new Post("1234567");
        post2.addTag("java");
        post2.addTag("python");
        post2.addTag("c++");
        System.out.println("Tags for post2-->"+post2.listOfTags());
        post2.removeTag("c++");
        System.out.println("Tags for post2-->"+post2.listOfTags());
        System.out.println("java exists or not?-->"+post2.isExist("java"));

    }
}

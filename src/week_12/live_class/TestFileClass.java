package week_12.live_class;

import java.io.File;

public class TestFileClass {
    public static void main(String[] args) {
        File file=new File("C:\\\\Users\\\\yusuf\\\\Desktop\\\\story.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
    }
}

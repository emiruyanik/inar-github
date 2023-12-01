package week_13.assignments;

public class Question_13_16 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.exit(1);
        }


        switch (args[1].charAt(0)) {
            case '+' -> {
                String[] firstArgument = args[0].split("/");
                String[] secondArgument = args[2].split("/");
                MainRational mainRational1 = new MainRational(Long.parseLong(firstArgument[0]),
                        Long.parseLong(firstArgument[1]));
                MainRational mainRational2 = new MainRational(Long.parseLong(secondArgument[0]),
                        Long.parseLong(secondArgument[1]));
                MainRational add = mainRational1.add(mainRational2);
                System.out.println("result-->" + add);
            }
            case '-' -> {
                String[] str1 = args[0].split("/");
                String[] str2 = args[2].split("/");
                MainRational r1 = new MainRational(Long.parseLong(str1[0]),
                        Long.parseLong(str1[1]));
                MainRational r2 = new MainRational(Long.parseLong(str2[0]),
                        Long.parseLong(str2[1]));
                MainRational subtract = r1.subtract(r2);
                System.out.println("result-->" + subtract);
            }
            case '*' -> {
                String[] str3 = args[0].split("/");
                String[] str4 = args[2].split("/");
                MainRational r3 = new MainRational(Long.parseLong(str3[0]),
                        Long.parseLong(str3[1]));
                MainRational r4 = new MainRational(Long.parseLong(str4[0]),
                        Long.parseLong(str4[1]));
                MainRational multiply = r3.multiply(r4);
                System.out.println("result-->" + multiply);
            }
            case '/' -> {
                String[] str5 = args[0].split("/");
                String[] str6 = args[2].split("/");
                MainRational r5 = new MainRational(Long.parseLong(str5[0]),
                        Long.parseLong(str5[1]));
                MainRational r6 = new MainRational(Long.parseLong(str6[0]),
                        Long.parseLong(str6[1]));
                MainRational divide = r5.divide(r6);
                System.out.println("result-->" + divide);
            }
        }
    }
}

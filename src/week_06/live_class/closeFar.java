package week_06.live_class;

import java.util.Scanner;

public class closeFar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        boolean x = closeFar(a, b, c);

        System.out.println(x);


    }

    public static boolean closeFar(int a, int b, int c) {
        int []numbs ={a,b,c};
        for(int i= 0;i<numbs.length;i++){
            int max=numbs[i];
            for(int j=i+1;j<numbs.length;j++){
                if(max<numbs[j]){
                    int temp=numbs[i];
                    numbs[i]=numbs[j];
                    numbs[j]=temp;
                }
            }
        }
        if(Math.abs(numbs[0]-numbs[1])<=1||Math.abs(numbs[0]-numbs[2])<=1||Math.abs(numbs[1]-numbs[2])<=1){
            if(Math.abs(numbs[0]-numbs[1])>1 || Math.abs(numbs[1]-numbs[2])>1){
                return true;
            }


        }

        return false;
    }

}

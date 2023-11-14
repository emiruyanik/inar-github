package week_10.assignments;

public class Question_10_10 {
    public static void main(String[] args) {
        Queue queue=new Queue();
        for (int i = 1; i <=20 ; i++) {
            queue.enQueue(i);
        }
        System.out.println(queue.getSize());

        System.out.println(queue.deQueue());
        System.out.println(queue.getSize());
        int loopNumber=queue.getSize();
        for (int i = 0; i <loopNumber ; i++) {
            System.out.print(queue.deQueue()+" ");
        }
    }
}

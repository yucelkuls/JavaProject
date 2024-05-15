package j08_Loops.Loop2_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve
		kaç tane oldugunu print eden code create ediniz.
		 */
        int end = 999;
        int count = 0;
        while (end > 99) {
            if (end % 4 == 0 && end % 6 == 0) {
                count++;
                System.out.print(end + " ");
            }
            end--;
        }
        System.out.println("\nThere are "+count+" integers that are divisible by both 4 and 6.");
    }
}

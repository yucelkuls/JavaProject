package j101_InterviewQuestionsJava;

public class Q57_RandomCiftSayi {

    public static void main(String[] args) {
        //task->0-20 arasında  Math.random() kullanarak cikan sayinin cift ya da tek olmasını kontrol eden code create ediniz
        // Math.random()*((max-min)+1)+min); -> max ile min arası rastgele sayı ureten komut
        int max = 20;
        int min = 0;
        int number = (int) (Math.random()*((max-min)+1)+min);

        if (number % 2 == 0){
            System.out.println(number+" is a even number ");
        }else {
            System.out.println(number+" is a odd number ");
        }
    }
}

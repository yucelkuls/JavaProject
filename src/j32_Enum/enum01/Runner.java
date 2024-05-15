package j32_Enum.enum01;

public class Runner {
    public static void main(String[] args) {
        //Task-> verilen yılın ayını numarasına göre kaç gun ektğini print eden code create ediniz.
        Aylar ay = Aylar.MART; // Aylar enum data type ay variable tanimlanip deger atandi.
        System.out.println("ay = " + ay); // MART
        System.out.println("ay.name() = " + ay.name()); // MART
        System.out.println("ay.ordinal() = " + ay.ordinal()); // 2
        switch (ay) {
            case OCAK:
                System.out.println("Ocak 31 gundur");
                break;
            case SUBAT:
                System.out.println("Subat 28 gundur");
                break;
            case MART:
                System.out.println("Mart 31 gundur");
                break;
            case NISAN:
                System.out.println("Nisan 30 gundur");
                break;
            case MAYIS:
                System.out.println("Mayis 31 gundur");
                break;
            case HAZIRAN:
                System.out.println("Haziran 30 gundur");
                break;
            case TEMMUZ:
                System.out.println("Ocak 31 gundur");
                break;
            case AGUSTOS:
                System.out.println("Agustos 31 gundur");
                break;
            case EYLUL:
                System.out.println("Eylul 30 gundur");
                break;
            case EKIM:
                System.out.println("Ekim 31 gundur");
                break;
            case KASIM:
                System.out.println("Kasim 30 gundur");
                break;
            case ARALIK:
                System.out.println("Aralik 31 gundur");
                break;

        }
        System.out.println("Kod sorunsuz calisti");
    }
}

package j32_Enum.enum02;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
        user.name = "Enes";
//        user.role = 0;
//        user.status = 2;
        user.role=Role.ADMIN;
        user.status=Status.ACTIVE;

        User user2 = new User();
        user2.name = "Selim";
//        user2.role = 0;
//        user2.status = 2;
        user2.role=Role.CUSTOMER;
        user2.status=Status.INACTIVE;

        if (user2.role==Role.ADMIN){
            System.out.println(user2.name+" yetkilisiniz");
        }else {
            System.out.println(user2.name+" yetkin yok");
        }
        if (user.role==Role.ADMIN){
            System.out.println(user.name+" yetkilisiniz");
        }else {
            System.out.println(user.name+" yetkin yok");
        }


    }
}

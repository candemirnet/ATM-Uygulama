import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        String userName,password;
        int right =3;
        int balance = 1500;
        int select;
        int price;
        while(right>0){
            System.out.print("Adınızı Giriniz: ");
            userName = imp.nextLine();
            System.out.print("Parolayı Giriniz: ");
            password = imp.nextLine();
            if(userName.equals("Can") &&(password.equals("123456"))){
                System.out.println("CanBANK'A Hoşgeldiniz!");
                for(int i =0; i<6; i++){
                    for(int k=0; k<i; k++){
                        System.out.print(" ");
                    }
                    for(int m =0; m<2*(6-i) -1; m++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                do {
                    System.out.println(
                            "1-Para Yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Görüntüle\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select= imp.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Para Miktarı: ");
                            price = imp.nextInt();
                            balance+=price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı: ");
                            price = imp.nextInt();
                            if(price>balance){
                                System.out.println("Yetersiz Bakiye");
                            }else{
                                balance -=price;
                            }
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);

                    }
                }while(select!=4);
                System.out.println("Tekrar Görüşmek Üzere");
                break;

            }else{
                right--;
                System.out.println("Hatalı Bir Tuşlama Yaptınız");
                if(right ==0){
                    System.out.println("Hesabınız Bloke Olmuştur");
                }else{
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }
        }
    }
}
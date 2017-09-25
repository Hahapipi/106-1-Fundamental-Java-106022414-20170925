import java.util.Scanner;


// name:林虹汶
// date:20170925
// id:106022414
// purpose:公升轉加侖
public class Main {

    public static void main(String[] args) {
        Scanner Scn = new Scanner(System.in);
        int val = Scn.nextInt();
        System.out.println(Math.round((val*0.26418)*10)/10f);
    }
}
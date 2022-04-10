
package daireninalanı;
import java.util.*;
public class DaireninAlanı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yarıçapı uzunluğunu giriniz:");
        int r = input.nextInt();
        
        System.out.print("Merkez açı ölçüsünü giriniz:");
        int merkezAcı = input.nextInt();
        
        double pi =3.14;
        
        double alan = (pi*(r^2)*merkezAcı)/360;
        
        System.out.print("Dairenin alanı:" + alan);
    }
    
}
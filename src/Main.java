import java.util.Scanner;
import java.util.Vector;
import java.io.*;
public class Main {
    public static void main(String[] args)throws Exception {
        Vector v = new Vector(10,10);

        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose menu point");
            //System.out.println("1 - добавить пациента");
            System.out.println("1 - просмотр данных учащихся");
            System.out.println("2 - просмотр данных студентов");
            System.out.println("3 - просмотр данных аспирантов");
            //System.out.println("5 - Static method*");
            System.out.println("4 - Выход");
            int x = scanner.nextInt();
            if(x==1){
                StuDay p = new StuDay();
                p.institution();
            }
            else if (x==2) {
                System.out.println("NewBranch");
            }
            else if (x==3) {

            }
            if(x==4){
                break;
            }

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void arrayListler(int[] array){

        for (int i=0;i<array.length; i++){

            System.out.println("Element "+(i+1)+": "+ array[i]);
        }

    }

    public static Double ortBul(int[] array){
        int ort=0;

        for (int i=0; i< array.length; i++){

            ort+=array[i];


        }

        return ((double)ort/array.length);

    }

    public static void main(String[] args){
        //int[] a=new int[10];
        /*int[] a= new int[5];
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<5; i++){
            System.out.println((i+1)+".Sayıyı Giriniz.");
            a[i]=scanner.nextInt();


        }
        for (int i=0; i<5;i++){

            System.out.println(a[i]);
        }*/
        int[] c={7,21};
        //arrayListler(c);
        System.out.println(ortBul(c));
    }
}

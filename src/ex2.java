import java.util.Scanner;

public class ex2 {


        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String word ="abba";
            char[] a=word.toCharArray();
            System.out.println(word.length());

            System.out.println();
            for(int i=0;i<word.length()-1;i++)
            {

                System.out.print(a[i]);
                System.out.print(a[i+1]);
                System.out.println();
            }

            for(int i=0;i<word.length()-2;i++)
            {

                System.out.print(a[i]);
                System.out.print(a[i+1]);
                System.out.print(a[i+2]);
                System.out.println();

            }

            for(int i=0;i<a.length;i++)
            {
                //System.out.println(word.charAt(i));
                    for(int j=0;j<=a.length-i;j++)
                    {
                        System.out.println(word.substring(j,j+i));
                    }
            }
        }

}

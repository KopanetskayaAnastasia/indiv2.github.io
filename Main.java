import java.util.*;
public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter grade of Polinom 1:");
        int n=sc.nextInt();
        System.out.println("Enter coefficients of Polinom 1:");
        int []a=new int[n+1];
        for(int i=0;i<n+1;i++)
            a[i]=sc.nextInt();
        Polinom p1=new Polinom(n,a);
        p1.print();

        System.out.println("Enter grade of Polinom 2:");
        int k=sc.nextInt();
        System.out.println("Enter coefficients of Polinom 2:");
        int []b=new int[k+1];
        for(int i=0;i<k+1;i++)
            b[i]=sc.nextInt();
        Polinom p2=new Polinom(k,b);
        p2.print();

        System.out.println("Enter figure for Polinom 1:");
        int x= sc.nextInt();
        System.out.println("Polinom 1 with x="+x+": "+p1.result(x));


        Polinom dif=p1.dif(p2);
        System.out.println("Difference:");
        dif.print();

        Polinom sum=p1.sum(p2);
        System.out.println("Summa:");
        sum.print();

        Polinom multi=p1.multi(p2);
        System.out.println("Multiplication:");
        multi.print();

    }

}
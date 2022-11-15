import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number;

        System.out.print("N sayısı: ");
        number=inp.nextInt();
        recDesen(number,number,0);

    }
    static int recDesen(int no, int tNo, int control) //tno=>temporary number
    {
        if(no>0 && control==0)
        {
            System.out.print(no+" ");
            no-=5;
            if(no<=0)
                control=1;// controlu 1 yapmamızın sebebi 0 veya altına düştüğü zaman sadece arttırma işlemi yapması
            return recDesen(no,tNo,control);

        }else
        {
            System.out.print(no+" ");
            no+=5;
            if (no!=tNo) // başlangıç sayısına eşit olana kadar metotu çağırıyoruz
            {
                return recDesen(no,tNo,control);
            }else
            {
                System.out.print(no);
                return 1;
            }
        }
    }
}
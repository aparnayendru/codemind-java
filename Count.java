import java.util.Scanner;
class Frequent
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int m=0;
        int sum=0,k=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                sum++;
            }
            else
            {
                k++;
            }
        }
        System.out.println(sum+" "+k);
        
    }
}
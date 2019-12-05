import java.util.*;
class stackmain
{
    public static void main(String args[])
    {
        stacklinklist sl=new stacklinklist();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 1 for push");
            System.out.println("enter 2 for pop");
            System.out.println("enter 3 for display");
            System.out.println("enter 4 for exit");
            System.out.println("enter your choice");
            int a=sc.nextInt();
            switch(a)
            {
                case 1: 
                sl.push();
                break;

                case 2:
                sl.pop();
                break;

                case 3:
                sl.display();
                break;

                case 4:
                System.exit(2);
            }
        }
    }

}

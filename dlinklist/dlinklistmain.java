import java.util.*;
class dlinklistmain
{
    public static void main(String args[])
    {
        dlinklist dl =new dlinklist();
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 1 for insert at first");
            System.out.println("enter 2 for insert at last");
            System.out.println("enter 3 for search insert");
            System.out.println("enter 4 for  display");
            System.out.println("enter 5 for delete at first");
            System.out.println("enter 6 for delete at last");
            System.out.println("enter 7 for serach delete");
            System.out.println("enter 8 for exit");
            System.out.println("enter 9 for searchlast");
            System.out.println("enter your choice");
            int x=sc.nextInt();
            switch(x)
            {

                case 1:
                dl.insertFirst();
                break;

                case 2:
                dl.insertLast();
                break;
                case 3:
                dl.searchinsert();
                break;
                case 4:
                dl.display();
                break;
                case 5:
                dl.deletefirst();
                break;
                case 6:
                dl.deletelast();
                break;
                case 7:
                dl.searchdelete();
                break;

                case 8 :
                System.exit(1);

                case 9:
                dl.searchlast();

            }
        }
    }
}


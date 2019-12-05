import java.util.*;
class linklistmain
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        Linklist lt1 =new Linklist();
        Linklist lt2= new Linklist();
        Linklist lt3= new Linklist();
        System.out.print("Enter the no. of elements ");
        int n1=sc.nextInt();
        //System.out.print("Enter the no. of elements ");
        //int n2=sc.nextInt();
        //System.out.print("Enter the no. of elements ");
        //int n3=sc.nextInt();
        System.out.println("elements the elements ");
        for(int i=0;i<n1;i++)
            lt1.insertLast();

        //System.out.println("elements the elements ");
        /*for(int i=0;i<n2;i++)
        lt2.insertLast();*/

        /*System.out.println("elements the elements ");
        for(int i=0;i<n3;i++)
            lt3.insertLast();*/

        //lt1.merge(lt2.START,lt3.START);
        //lt1.join(lt2.START);
        //lt1.lsort();
               
        lt1.reverse(lt1.START);
        lt1.display(); 

    }
    //Linklist lt =new Linklist();

    /*while(true)
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1 for insert at first");
    System.out.println("enter 2 for insert at last");
    System.out.println("enter 3 for search insert");
    System.out.println("enter 4 for  display");
    System.out.println("enter 5 for delete at first");
    System.out.println("enter 6 for delete at last");
    System.out.println("enter 7 for serach delete");
    System.out.println("enter 8 for reverse & display");
    System.out.println("enter 9 for display the element of node");
    System.out.println("enter 10 for exit");
    System.out.println("enter 11 for node count");
    System.out.println("enter 12 for swappair");
    System.out.println("enter 13 for find position");
    System.out.println("enter 14 for find balanced");

    System.out.println("enter your choice");
    int x=sc.nextInt();
    switch(x)
    {

    case 1:
    lt.insertFirst();
    break;

    case 2:
    lt.insertLast();
    break;
    case 3:
    lt.Searchinsert();
    break;
    case 4:
    lt.display();
    break;
    case 5:
    lt.deleteFirst();
    break;
    case 6:
    lt.deletelast();
    break;
    case 7:
    lt.Searchdelete();
    break;

    case 8:
    lt.reverse(lt.START);
    break;

    case 9:
    lt.displaynode();
    break;

    case 10 :
    System.exit(1);

    case 11:
    lt.ncount();
    break;

    case 12:
    lt.swappair();
    break;

    case 13:
    lt.fpos();
    break;

    case 14:
    lt.balanced();
    break;
    }
    }*/
    //}
    //}
}


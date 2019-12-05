import java.util.*;
class Linklist
{
    node START,ptr,pptr,s,s1;
    int count=1;
    Linklist()
    {
        START=null;
    }

    void insertFirst()
    {
        Scanner sc= new Scanner(System.in);
        node temp= new node();// creation of node
        System.out.print("Enter the data ");
        temp.data=sc.nextInt();

        if(START==null)// empty list
            START=temp;
        else
        {
            temp.link=START;
            START=temp;
        }
    }

    void insertLast()
    {
        Scanner sc= new Scanner(System.in);
        node temp= new node();// creation of node
        System.out.print("Enter the data ");
        temp.data=sc.nextInt();

        if(START==null)// empty list
            START=temp;
        else
        {
            ptr=START;
            while(ptr.link!=null)
                ptr=ptr.link;

            ptr.link=temp;
        }
    }

    void Searchinsert()
    {
        Scanner sc= new Scanner(System.in);
        node temp= new node();// creation of node
        if(START==null)
            System.out.println("List Empty ");
        else
        {
            System.out.print("Enter the search data ");
            int num=sc.nextInt();
            ptr=START;
            while(ptr!=null)
            {
                if(ptr.data==num)
                {
                    System.out.print("Enter the data ");
                    temp.data=sc.nextInt();
                    temp.link=ptr.link;
                    ptr.link=temp;
                    break;
                }
                ptr=ptr.link;
            }
        }
    }

    void deleteFirst()
    {
        if(START==null)
            System.out.println("List Empty ");
        else
        {
            System.out.println("Deleted "+START.data);
            START=START.link; // move to the next node
        }
    }

    void display()
    {
        if(START==null)
            System.out.println("List Empty ");
        else
        {
            ptr=START;
            while(ptr!=null)
            {
                System.out.println(ptr.data);
                ptr=ptr.link; // move to the next node
            }
        }
    }

    void displaynode()
    {
        if(START==null)
            System.out.println("list is empty");
        else
        {
            ptr=START;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the node for showing element ");
            int x=sc.nextInt();
            int c=1,f=0;
            while(ptr!=null)
            {

                if(c==x)
                {
                    System.out.println(ptr.data);
                    f=1;
                    break;
                }
                c++;
                ptr=ptr.link;
            }
            if(f==0)
                System.out.println("Number not present ");

        }
    }

    void deletelast()
    {
        if(START==null)
            System.out.println("List Empty ");
        else
        {
            if(START.link==null)
            {
                System.out.println("Deleted "+START.data);
                START=START.link; // move to the next node
            }
            else{
                ptr=START;
                while(ptr.link.link!=null)
                    ptr=ptr.link;

                ptr.link=null;
            }
        }
    }

    void reverse(node S)
    {

        if(S==null)
            System.out.println("");
        else
        {
            reverse(S.link);
            System.out.println(S.data);
        }

    }

    void join(node S)
    {
        node ptr=START;
        while(ptr.link!=null)
        {
            if(ptr.link==S)
            {
                System.out.println(ptr.data);
                break;

            }
            ptr=ptr.link;
        }
    }

    void merge(node S , node s1)
    {
        node ptr=START;
        while(ptr.link!=null)
            ptr=ptr.link;

        ptr.link=S;
        
        while(ptr.link!=null)
           ptr=ptr.link;
           
           ptr.link=s1;
    }

    void lsort()
    {
        //node temp=new node();
        int temp;
        node ptr=START;
        node ptr2=null;
        while(ptr.link!=null)
        {
            ptr2=ptr.link;
            while(ptr2!=null)
            {
                if(ptr2.data<ptr.data)
                {
                    temp=ptr2.data;
                    ptr2.data=ptr.data;
                    ptr.data=temp;

                }
                ptr2=ptr2.link;

            }
            ptr=ptr.link;
        }
    }

    void Searchdelete()
    {
        Scanner sc= new Scanner(System.in);
        node temp= new node();// creation of node
        if(START==null)
            System.out.println("List Empty ");
        else
        {
            System.out.print("Enter the search data ");
            int num=sc.nextInt();
            if(START.data==num)
                START=START.link;
            else
            {
                ptr=START;
                node pptr= new node();// hold previous node
                while(ptr!=null)
                {
                    if(ptr.data==num)
                        pptr.link=ptr.link;

                    pptr=ptr; // store the previous node
                    ptr=ptr.link; // move to next node
                }
            }
        }
    }

    void swappair()
    {
        //node temp= new node();
        if(START==null)
            System.out.println("List is empty");
        else
        {
            ptr=START;
            while(ptr.link!=null)
            {

                //pptr=ptr.link.link.data;

                int temp=ptr.data;
                ptr.data=ptr.link.data;
                ptr.link.data=temp;
                ptr=ptr.link.link;

            }

        }
        ptr=START;
        while(ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.link; // move to the next node
        }

    }

    void ncount()
    {

        if(START==null)
            System.out.println("list is empty");
        else
        {
            ptr=START;
            while(ptr.link!=null)
            {
                count++;
                ptr=ptr.link;
            }
        }
        System.out.println(count);
    }

    void fpos()
    {
        Scanner sc=new Scanner(System.in);
        int count=0;

        if(START==null)
            System.out.println("list is empty");
        else{
            System.out.println("enter the nos");
            int no=sc.nextInt();
            ptr=START;
            while(ptr!=null)
            {
                count++;
                if(ptr.data==no)
                {
                    System.out.println(count);
                    break;
                }

                ptr=ptr.link;
            }
        }
    }

    void balanced()
    {
        int s=0,s1=0,su1=0,su2=0;

        int y=0;
        int x=count/2;
        ptr=START;
        while(ptr!=null)
        {
            if(y<x)
            {

                s=ptr.data;
                su1+=s;
                y++;
            }
            else if(y>x)
            {

                s1=ptr.data;
                su2+=s1;
                y++;
            }

            ptr=ptr.link;
        }
        System.out.println(su1);
        System.out.println(su2);
    }
}

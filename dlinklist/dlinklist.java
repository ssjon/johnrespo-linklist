import java.util.*;
class dlinklist
{
    node2 START,ptr,ptr1, temp;
    node2 END;
    dlinklist()
    {
        START=null;
    }

    void insertFirst()
    {
        Scanner sc=new Scanner(System.in);
        temp=new node2();
        System.out.print("Enter the number ");
        temp.data=sc.nextInt();

        if(START==null)
            START=temp;
        else
        {
            temp.rlink=START;
            START.llink=temp;
            START=temp;
        }
    }

    void insertLast()
    {
        Scanner sc=new Scanner(System.in);
        temp=new node2();
        System.out.print("enter the no");
        temp.data=sc.nextInt();
        if(START==null)
            START=temp;

        else
        {
            ptr=START;
            while(ptr.rlink!=null)
                ptr=ptr.rlink;

            ptr.rlink=temp;
            temp.llink=ptr;
        }

    }

    void searchinsert()
    {
        Scanner sc=new Scanner(System.in);
        temp=new node2();
        if(START==null)
            System.out.print("LIST IS EMPTY");
        else
        {
            System.out.print("enter the search data ");
            int x=sc.nextInt();
            ptr=START;
            while(ptr!=null)
            {
                if(ptr.data==x)
                {
                    System.out.print("enter the data ");
                    temp.data=sc.nextInt();

                    temp.rlink=ptr.rlink;
                    ptr.rlink.llink=temp;
                    temp.llink=ptr;
                    ptr.rlink=temp;
                    break;
                }
                ptr=ptr.rlink;
            }
            if(ptr==null)
                System.out.print("data not found");
        }
    }

    void deletefirst()
    {
        if(START==null)
            System.out.println("LIST EMPTY  ");
        else
        {
            System.out.println("DELETED "+START.data);
            START=START.rlink;
            START.llink=null;

        }

    }

    void deletelast()
    {
        if(START==null)
            System.out.print("LIST IS EMPTY  ");
        else
        {
            if(START.rlink==null)
            {
                START.rlink=null;
                System.out.println("DELETED   "+START.data);
            }
            else
            {
                ptr=START;

                while(ptr.rlink.rlink!=null)
                    ptr=ptr.rlink;
                System.out.println(ptr.rlink.data);
                ptr.rlink=null;

            }
        }
    }

    void display()
    {
        if(START==null)
            System.out.print("LIST IS EMPTY  ");
        else
        {
            ptr=START;
            while(ptr!=null)
            {
                System.out.println(ptr.data);
                ptr=ptr.rlink;
            }
        }
    }

    void searchdelete()
    {
        if(START==null)
            System.out.print("LIST IS EMPTY  ");
        else
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the search data");
            int num=sc.nextInt();
            if(START.data==num)
            {
                START=START.rlink;
                START.llink=null;
            }
            else
            {
                ptr=START;
                while(ptr.rlink!=null)
                {
                    if(ptr.rlink.data==num)
                    {
                        ptr.rlink=ptr.rlink.rlink;
                        ptr.rlink.llink=ptr;
                        break;
                    }

                    ptr=ptr.rlink;
                }
            }
        }
    }

    void searchlast()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no");
        int n=sc.nextInt();
        ptr=START;
        while(ptr.rlink!=null)
            ptr=ptr.rlink;
        int f=0;
        while(ptr!=null)
        {
            if(ptr.data==n)
            {
                System.out.println(ptr.data);
                f=1;
                break;
            }

            ptr=ptr.llink;
        }
        if(f==0)
         System.out.println("Not found");
    }
}


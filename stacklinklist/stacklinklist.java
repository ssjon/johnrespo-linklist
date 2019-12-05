import java.util.*;
class stacklinklist
{
    node1 top,temp;
    stacklinklist()
    {
        top=null;
    }

    void push()
    {
        Scanner sc=new Scanner(System.in);
        node1 newNode=new node1();
        System.out.print("enter the element ");
        newNode.data=sc.nextInt();

        if(top==null)
            top=newNode;
        else
        {
            newNode.next=top;
            top=newNode;
        }
        System.out.println("insertion is success..");
    }

    void pop()
    {
        if(top==null)
            System.out.println("stack is empty..");
        else{
            //temp=top;
            System.out.println("deleted.."+top.data);
            top=top.next;
        }
    }

    void display()
    {
        if(top==null)
            System.out.println("\n stack is empty");
        else{
            temp=top;
            while(temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
            //System.out.println("%d....null"+top.data);
        }
    }
}


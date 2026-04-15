package com.mycompany.binarytreeg600;

public class List {
   private Node head;

    public List() {
    }
    
    public boolean isEmpty()
    {
        return head==null;
    }
    
    public void AddFirst(Object data)
    {
        if(isEmpty())
            head=new Node(data);
        else
        {
            Node n = new Node(data);
            n.setLink(head);
            head=n;
        }
    }
    
   @Override
    public String toString()
    {
        String text="";
        Node aux=head;
        while(aux!=null)
        {
            text = text + aux.getData() + "-";
            aux=aux.getLink();
        }
        return text;
    }

   public Node Last()
   {
       Node aux=head;
       while(aux!=null && aux.getLink()!=null)
           aux=aux.getLink();
       
       return aux;
   }   
   
   public void AddLast(Object data)
   {
       if(isEmpty())
           head =new Node(data);
       else
       {
           Node last = Last();
           Node n = new Node(data);
           last.setLink(n);
       }
   }
   
   public int Size()
   {
       int count=0;
       Node aux=head;
       while(aux!=null)
       {
           count++;
           aux=aux.getLink();
       }
       return count;
   }
   
   public Node Previous(Node search)
   {
       Node pre=null;
       Node aux=head;
       while(aux!=null && aux!=search)
       {
           pre=aux;
           aux=aux.getLink();
       }
       return pre;
   }
   
   public void AddPos(Object data,int pos)
   {
       if(pos==1)
           AddFirst(data);
       else
       {
           if(pos==Size()+1)
                AddLast(data);
           else
           {
               int count=1;
               Node aux=head;
               while(aux!=null && count<pos)
               {
                   count++;
                   aux=aux.getLink();
               }
               Node n=new Node(data);
               n.setLink(aux);
               Node pre = Previous(aux);
               pre.setLink(n);
           }
       }
   }
   
   public boolean DeleteFirst()
   {
       if(!isEmpty())
       {
           head=head.getLink();
           return true;
       }
       return false;
   }
   
   public boolean DeleteLast()
   {
       if(!isEmpty())
       {
           Node last=Last();
           Node pre=Previous(last);
           if(pre!=null)
               pre.setLink(null);
           else
               head=null;
           return true;
       }
       return false;
   }
   
   public boolean DeletePos(int pos)
   {
       if (!isEmpty())
       {
           if(pos==1)
            return DeleteFirst();
       else
       {
           if(pos==Size())
               return DeleteLast();
           else
           {
               Node aux=head;
               int count=1;
               while(aux!=null && count<pos)
               {
                   count++;
                   aux=aux.getLink();
               }
               Node pre=Previous(aux);
               pre.setLink(aux.getLink());
               return true;
           }
       }
           
       }
       return false;
   }
}

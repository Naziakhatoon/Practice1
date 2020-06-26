class Student1  
{  
    int id;  
    String name;  
    int age;  
    //creating two arg constructor  
    Student1(int i,String n){  
    id = i;  
    name = n;  
    }  
    //creating three arg constructor  
    Student1 (int i,String n,int a){  
    id = i;  
    name = n;  
    age=a;  
    }  
    void display(){System.out.println(id+" "+name+" "+age);}  
   
    public static void main(String args[]){  
    Student1 s1 = new Student1(111,"Nazia",26);  
    Student1 s2 = new Student1(222,"Ram",25); 
    Student1 s3 = new Student1(333,"Shyam",30); 
    Student1 s4 = new Student1(333,"Gita",32);   
    s1.display();  
    s2.display();  
    s3.display(); 
    s4.display(); 
   }  
}

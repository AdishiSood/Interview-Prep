/*
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. 
It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.
When you inherit from an existing class, you can reuse methods and fields of the parent class. 
Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.
*/

class Employee
{  
 float salary=40000;  
}  
class Programmer extends Employee
{  
 int bonus=10000;  
 public static void main(String args[])
 {  
   Programmer p=new Programmer();  
   System.out.println("Programmer salary is:"+p.salary);  
   System.out.println("Bonus of Programmer is:"+p.bonus);  
 } 
}  

/*
OUTPUT
Programmer salary is:40000.0
Bonus of programmer is:10000
*/

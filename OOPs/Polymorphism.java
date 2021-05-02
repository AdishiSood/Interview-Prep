/*
Polymorphism refers to the ability to present the same interface for different forms.
Although the concept of polymorphism is the same in all programming languages that support it, 
its implementation differs from one language to another.

Types of polymorphism and method overloading & overriding. You can refer them here:
1. Method Overloading in Java – This is an example of compile time (or static polymorphism)
2. Method Overriding in Java – This is an example of runtime time (or dynamic polymorphism)
3. Types of Polymorphism – Runtime and compile time – This is our next tutorial where we have covered the types of polymorphism in detail. 
I would recommend you to go though method overloading and overriding before going though this topic.

*/


// Java program for Method overloading

class MultiplyFun {

	// Method with 2 parameter
	static int Multiply(int a, int b)
	{
		return a * b;
	}

	// Method with the same name but 2 double parameter
	static double Multiply(double a, double b)
	{
		return a * b;
	}
}

class Main {
	public static void main(String[] args)
	{

		System.out.println(MultiplyFun.Multiply(2, 4));

		System.out.println(MultiplyFun.Multiply(5.5, 6.3));
	}
}


/*
Output:
8
34.65
*/

import java.io.*;
public class TestOne {

	public static void main(String[] x) throws IOException
	{
	// examples for adding string using buffered reader without using wrapper classes
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	System.out.print("enter first Subjects no = "); //2
	String data=br.readLine();
	//int n=Integer.parseInt(data);
	System.out.println("the entered data is: "+data);//2
	System.out.print("enter second Subjects no = "); //3
	String data1=br.readLine();
	System.out.println("the entered data is: "+data1); //3
	System.out.print("if i add the data= "+(data+data1));// output :23

	// examples for adding string using buffered reader without using wrapper classes
	System.out.println("\n");
	System.out.print("enter first Subjects no = "); //2
	String data3=br.readLine();
	int n=Integer.parseInt(data3); 
	System.out.println("the entered data is: "+n); //2
	System.out.print("enter second Subjects no = "); //3
	String data4=br.readLine();
	int n1=Integer.parseInt(data4);
	System.out.println("the entered data is: "+n1); //3
	System.out.print("if i add the data= "+(n+n1));//output :5

	// showing difference between readline() && read() 

	System.out.println("\n");
	System.out.print("enter first Subjects no = "); //2
	String data5=br.readLine();
	System.out.println("the entered data is: "+data5); //2
	System.out.print("enter second Subjects no = "); //3
	int data6=br.read(); //it will read ascii value of enterd value
	System.out.println("the entered data is: "+data6);  //51
	System.out.println("if we add the data "+(data5+data6)); //251 

	// finding percentage of students

	System.out.println("\n");
	System.out.println("Enter how many subject do you have ? ");
	String t=br.readLine();
	int sub=Integer.parseInt(t);

		for(int k=0;k<=sub;k++)
			{

				System.out.print("enter marks of subject: "+k);
				//int k=parseInt(k);
				int tot=+k;
				System.out.print("total marks is :"+tot);
				float percentage=(float)tot/sub;
				System.out.println("the percentage is:"+percentage);
				System.out.println("");
			}

	}
}

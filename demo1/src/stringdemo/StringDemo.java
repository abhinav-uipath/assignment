package stringdemo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String namedemo ="Abhinav Sharma";
				System.out.println("Length of Name = "+namedemo.length());
				
				String ConvertUppercaseDemo="abhinav sharma";
				System.out.println("ConvertUppercase = "+ConvertUppercaseDemo.toUpperCase());
				
				String ConvertLowercaseDemo = "ABHINAV SHARMA";
				System.out.println("ConvertLowercaseDemo = "+ConvertLowercaseDemo.toLowerCase());
				
				char ast = namedemo.charAt(9);
				System.out.println("Index Range = "+ast);
	}

}

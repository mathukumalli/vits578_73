import java.text.SimpleDateFormat;
public class Main {

	public static void main(String[] args)throws Exception {
		String sdate="23-06-1997";
	Student s=new Student(501,"pallavi",new SimpleDateFormat("dd-mm-yyyy").parse(sdate),92.6);
	System.out.println(s.getId());
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}

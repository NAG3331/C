
public class StudentTest {

	public static void main(String[] args) throws CustomisedException {
		StudentTest st= new StudentTest();
		int id=123;
		st.studentFind(id);
		int id1=234;
		st.studentFind(id1);
		
		
		// TODO Auto-generated method stub

	}
	
	public void studentFind(int id) throws CustomisedException
	{
		if (id==123)
		{
			System.out.println("Student found with the id");
		}
		
		else {
			throw new CustomisedException("Entered inavlid student id ");
		}
	}

}

package january12;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//new allocates memory in the ram and amol is the reference variable of type Student
		 Student amol= new Student("Amol", 123,"COEP","Mechanical");
		 amol.attendsLecture();
		 amol.appearsForExam();
		 amol.goesToCollege();
		 System.out.println("------------------------------");
		
		 //Multiple objects can be created with different parameters
		 Student saloni= new Student("Saloni",456,"Electrical");
		 saloni.appearsForExam();
		 saloni.attendsLecture();
		 saloni.studiesInDepartment();
		 saloni.goesToCollege();
		 System.out.println("------------------------------");
		 
		 String result= saloni.returnName();
		 System.out.println(result);
			 
		 int result1=saloni.returnId();
		 System.out.println(result1);
		 }
	}
	



package january12;


//class consists of variables, constructors and methods
public class Student {
	String name;
	int id;
	String collegeName;
	String department;
	
	//Constructor is called when object is created
	//If no constructor is created jvm creates a default constructor(i.e 0-parameterized)
	//4-parameterized constructor
	Student(String iname, int iid, String iCollege, String idepartment){
		name=iname;
		id=iid;
		collegeName=iCollege;
		department=idepartment;
		}
	
	//3-parameterized constructor
	Student(String iname, int iid, String idepartment){
		name=iname;
		id=iid;
		department=idepartment;
		
		//Remains same for all the object which has 3 parameters as argument
		collegeName="Dhole Patil";
		}
	void attendsLecture() {
		System.out.println(name+" attends lecture");
	}
	void appearsForExam() {
		System.out.println(name+" attends exam with id "+ id);
	}
	void studiesInDepartment() {
		System.out.println(name+ " studies in department: "+department);
	}
	void goesToCollege() {
		System.out.println(name+ " goes to college: "+collegeName);
	}
	
	String returnName() {
		return name;
	}
	
	int returnId() {
		return id;
	}

}

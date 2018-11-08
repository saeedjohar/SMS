package Model;

import DAL.DataAccess;

public class Student extends Person {
	public String Program;

	
	
	public int Addstudent(Student s) throws Exception
	{
		DataAccess da = new DataAccess();
		String query = "insert into sms.student(studentid,name,email,password,gender) values("+
				s.PersonID+ ",'"+s.Name+"','" +s.Email+"','" + s.Password+"','" + s.Gender+"')";
		return da.ExecuteUpdate(query);
	}
	
	public int UpdateStudent(Student s) throws Exception
	{
		DataAccess da = new DataAccess();
		String query = "update sms.student set  name = '"+ s.Name+"','"+
				" Email = '" + s.Email+"','"+
				" Password = " + s.Password+"' where studentid = " + s.PersonID;
		return da.ExecuteUpdate(query);
	}
	
	public int DeleteStudent(int ID) throws Exception
	{
		DataAccess da = new DataAccess();
		String query = "delete from sms.student where  studentid = " + ID;
		return da.ExecuteUpdate(query);
	}
	
	
	
	
//	int getStudentID() {
//		return StudentID;
//	}
//
//	void setStudentID(int studentID) {
//		StudentID = studentID;
//	}
//
//	
//	
//	//public void Addstudent(int stid, String name,String gender,	String email,	String password, 	String adress, 	String mobileNumer,
//	//String phoneNumber) throws Exception
//	
//	public int Addstudent(int stid, String name,String gender,	String email,	String password, 	String adress) throws Exception
//	{
//		DataAccess da = new DataAccess();
//		String query = "insert into sms.student(studentid,name,email,password,gender) values("+
//		stid + ",'"+name+"','" + email+"','" + password+"','" + gender+"')";
//		
//		return da.ExecuteUpdate(query);
//	}
//	
//	
//	
//	public int Updatestudent(int stid, String name,String gender,	String email,	String password, 	String adress) throws Exception
//	{
//		DataAccess da = new DataAccess();
//		String query = "insert into sms.student(studentid,name,email,password,gender) values("+
//		stid + ",'"+name+"','" + email+"','" + password+"','" + gender+"')";
//		
//		return da.ExecuteUpdate(query);
//	}
//
//	public String getName() {
//		return Name;
//	}
//
//	void setName(String name) {
//		Name = name;
//	}
//
//	String getGender() {
//		return Gender;
//	}
//
//	void setGender(String gender) {
//		Gender = gender;
//	}
//
//	String getEmail() {
//		return Email;
//	}
//
//	void setEmail(String email) {
//		Email = email;
//	}
//
//	public String getPassword() {
//		return Password;
//	}
//
//	void setPassword(String password) {
//		Password = password;
//	}
//
//	
	
	

}

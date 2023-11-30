class FaceBook 
{
	private String user_name;
	private String pwd="Qsp@123";
	private long contact=9876543210l;
	private String dob;
	//Constr
	FaceBook()
	{}
	FaceBook(String user_name,String dob)
	{
		//L.I
		this.user_name=user_name;
		this.dob=dob;
	}
	//Helper Method
	public String getUserName()
	{
		return user_name;
	}
	public String getPwd()
	{
		return this.pwd;
	}
	public long getContact()
	{
		return contact;
	}

}

package cn.bean;

public class MedicalStaff
{
	private int id;
	private Login mlogin;
	private String name;
	private int level;
	private int phonenumber;
	private String department;
	private String position;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public Login getMlogin()
	{
		return mlogin;
	}
	public void setMlogin(Login mlogin)
	{
		this.mlogin = mlogin;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getLevel()
	{
		return level;
	}
	public void setLevel(int level)
	{
		this.level = level;
	}
	public int getPhonenumber()
	{
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber)
	{
		this.phonenumber = phonenumber;
	}
	public String getDepartment()
	{
		return department;
	}
	public void setDepartment(String department)
	{
		this.department = department;
	}
	public String getPosition()
	{
		return position;
	}
	public void setPosition(String position)
	{
		this.position = position;
	}
}

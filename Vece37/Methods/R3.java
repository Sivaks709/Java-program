class R3 
{
	static int fact=1,num,count;//5
	public static void main(String[] args) 
	{
		
		num=5;
		count=num;
		System.out.println(factorial(num));
	}
	public static int factorial(int num)//5,4,3,2,1,0
	{
		if(count!=0)//4,3,2,1
		{
			fact*=num;//5,20,60,120,120
			num--;//4,3,2,1,0
			count--;//4,3,2,1,0
			factorial(num);
		}
		return fact;
	}
}

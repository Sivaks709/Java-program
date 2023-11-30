class I2 
{
	static int a=12;
	public static void main(String[] args) 
	{
		int b=4;
		int res=b++ + a++;
		System.out.println(res++ + b++);
		int c=(res++ + a)+(b++ + ++a);
		System.out.println(c++ + ++a);
		System.out.println(b++ + a);
		int d=(c++ +b)+(res++ +a);
		System.out.println(d+"-"+a+"-"+b+"-"+c+"-"+res);
	}
}

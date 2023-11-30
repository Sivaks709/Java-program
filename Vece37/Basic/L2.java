class L2 
{
	public static void main(String[] args) 
	{
		boolean a=!((true || 5>1) && false);
		System.out.println(a);
		System.out.println(!a);
		boolean res=!((a||a) && (false || false));
		System.out.println(!res);
		System.out.println(!((res && res)|| true));
	}
}

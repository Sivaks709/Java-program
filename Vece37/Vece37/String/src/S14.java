//input: I Love Biryani
//op: I Hate Curd
class S14 
{
	public static void main(String[] args)  
	{
		String s1="I Love Biryani";
		String[] s2=s1.split(" ");
		// System.out.println(s2.length);
		System.out.println(s1);
		System.out.println(replce(s2,"Love","Biryani","Hate","Curd"));
	}
	public static String replce(String[] str,String old1,String old2,String w1,String w2)
	{
		String res="";
		// System.out.println(str.length);
		for (int index=0;index<str.length ;index++ )
		{
			if(str[index].equals(old1))
				str[index]=w1;
			else if(str[index].equals(old2))
				str[index]=w2;

			res+=str[index]+" ";
		}
		return res;
	}
}

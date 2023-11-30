interface I1
{
	void dance();
}
interface I2
{
	void demo();
}
class C1 implements I1,I2
{
	@Override
		public void dance()
		{
			System.out.println("Dance is Implemented");
		}
	@Override
		public void demo()
		{
			System.out.println("Demo is Implemented");
		}
}
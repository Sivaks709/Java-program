abstract class Animal 
{
	abstract  void food();
	abstract  void legs();
}
class Dog extends Animal
{
	@Override
		public void food()
		{
			System.out.println("Both Veg and Non-Veg");
		}
	@Override
		void legs()
		{
			System.out.println("4 Legs It Is Dog");
		}
}

class Lion extends Animal
{
		@Override
		public void food()
		{
			System.out.println("Non-Veg");
		}
	@Override
		void legs()
		{
			System.out.println("4 Legs It Is Lion");
		}

}

class Tiger extends Animal
{
		@Override
		public void food()
		{
			System.out.println(" Non-Veg");
		}
	@Override
		void legs()
		{
			System.out.println("4 Legs It Is Tiger");
		}

}

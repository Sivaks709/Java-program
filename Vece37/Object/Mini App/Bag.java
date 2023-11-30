class Bag 
{
	//Lazy Inst
	Ball ball;

	//Behaviours
	public void addBall(Ball ball)
	{
		//Adding The Ball is possible if this.ball==null
		if(this.ball==null)
		{
			this.ball=ball;
			System.out.println("Ball Added Into The Bag..");
		}
		else
			System.out.println("Already Ball is Present Inside The Bag...");
	}
	public void removeBall()
	{
		//if this.ball is not null means ball is Present
		if(this.ball!=null){
			this.ball=null;
			System.out.println("Ball Removed Successfully..");
		}//removeing the Ball
		else// if it is equal to null
			System.out.println("No Ball is Thier To Remove...");
	}
	public boolean isBagEmpty()
	{
		//if this.ball is null Bag is Empty
		if(this.ball==null)
			return true;//true means bag is Empty
		else
			return false;//false means bag contains Ball;
	}
	public void showGame()
	{
		if(this.ball==null)
			System.out.println("No Game is BEing Played..");
		else if(this.ball instanceof TennisBall)
		{
			//if this block exicutes means ball having tennis Ref
			TennisBall ref=(TennisBall)ball;
			System.out.println(ref.game+" is Being Played");
		}
		else if(this.ball instanceof BasketBall)
		{
			//if this block exicutes means ball having tennis Ref
			BasketBall ref=(BasketBall)ball;
			System.out.println(ref.game+" is Being Played");
		}
	}
}

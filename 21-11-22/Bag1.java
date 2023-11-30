class Bag extends Ball
{
	Ball ball;
	public void addball()
	{
		if (this.ball==null)
		{
			this.ball=ball;
			System.out.println("ball add success in bag");
		}
		else
        {
			System.out.println("already present");
        }
	}
    public void removeball()
	{
		if (this.ball!=null)
        {
            this.ball=null;
        }
		else
        {
            System.out.println("already presnnt");
        }
    }
    public boolean isbagempty()
    {
	    if (this.ball==null)
        {
            return true;
        }
	    else
        {
            return false;
        }
    }
    public void showgame()
    {
	    if(this.ball==null)
        {
            System.out.println("no game played");
        }
        else if( this.ball instanceof TennisBall)
	    {
		    TennisBall ref=(TennisBall)ball;
		    System.out.println(ref.game+"id being played");
	    }
    }
}
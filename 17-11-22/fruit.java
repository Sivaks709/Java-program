class fruit
{
    String orgin;
    String taste;

    fruit()
    {

    }
    fruit(String o,String t)
    {
        this.orgin=o;
        this.taste=t;
    }
}
class apple extends fruit
{
    String name;
    String color;
    apple()
    {
        super();
    }
    apple(String name,String color)
    {
        super("India","sweet");
        this.name=name;
        this.color=color;

    }
}
 
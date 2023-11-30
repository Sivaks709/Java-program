import java.util.*; 
class Main {
  static int fact=1;
  public static int RecursionChallenge(int num) {
    if(num!=0){
      fact*=num;
      num--;
      RecursionChallenge(num);
    }
    return fact;
  }
  public static void main (String[] args) {       
    Scanner s = new Scanner(System.in);
    System.out.print("Enter The Number : ");
    System.out.print(RecursionChallenge(s.nextInt())); 
    s.close();
  }
}
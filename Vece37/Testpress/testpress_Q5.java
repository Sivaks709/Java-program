public class testpress_Q5 {
    public static void main(String[] args) {
        int n[]={54, 546, 548, 60 ,55896,1,6865,0,55896};
        int maximum=n[0];
        int minimum=n[0];

        for (int index = 0; index < n.length; index++) {
            if(n[index]> maximum){
                maximum=n[index];
            }
            if(n[index]< minimum){
                minimum=n[index];
            }
        }
        System.out.println(maximum+" "+minimum);
    }
}

package prog;

public class find_duplicat_char {
    
    public static void main(String[] args) {
        String s1="sivakumar";
        char c1[]=s1.toCharArray();
        int count=1;
        for (int i = 0; i < c1.length; i++) {
            count=1;
            for (int j = i+1; j < c1.length; j++) {
                if (c1[i]==c1[j]) {
                    count++;
                    c1[j]=' ';
                }
                
            }
            if (count>=1 && c1[i]!=' ') {
                System.out.println(c1[i]+" : "+count);
            }
           
        }
    }
}

public class Huge_Num{
    public static void main (String[] args) {
        String huge = "";
        Long final_num = 0l;
        long final_Huge_num=0;
        int []array_of_num = {54,546,548,60};
        for (int i=0;i<array_of_num.length ;i++ ) {
            for (int j=i+1;j<array_of_num.length ;j++ ) {
                String value1 = String.valueOf(array_of_num[i]+""+array_of_num[j]);
                String value2 = String.valueOf(array_of_num[j]+""+array_of_num[i]);
                int num = Integer.parseInt(value1);
                int num1 = Integer.parseInt(value2);
                if (num < num1) {
                    int temp = array_of_num[i];
                    array_of_num[i]=array_of_num[j];
                    array_of_num[j]=temp;
                }
            }
        }
        for (int i =0 ;i<array_of_num.length ;i++ ) {
            huge += array_of_num[i];
            final_num = Long.parseLong(huge);
            final_Huge_num =final_num;
        }
        System.out.println(final_Huge_num);
    }
}
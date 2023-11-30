public class Assending {

    public static void main(String[] args) {
        int Num[]={3,5,8,4,6,2,8,5,7,2,1};
        int temp=0;
        for (int i = 0; i < Num.length; i++) {
            for (int j = i+1; j < Num.length; j++) {
                if (Num[i]<Num[j]) {
                    temp=Num[i];
                    Num[i]=Num[j];
                    Num[j]=temp;
                }
            }
        }
        for (int i = 0; i < Num.length; i++) {
            System.out.print(Num[i]+" ");
        }
    }
}
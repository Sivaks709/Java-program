package TEST;

public class mERGE_sORT {
    public static void main(String[] args) {
        int Num[]={1,3,9,5};
        int Num1[]={8,2,4,7};
        int Num3[]=new int[Num.length+Num1.length];
        for (int i = 0,j=0; i < Num3.length; i++) {
            if (i<Num.length) {
                Num3[i]=Num[i];
            } else {
                Num3[i]=Num1[j];
                j++;
            }
        }
        for (int i = 0; i < Num3.length; i++) {
            for (int j = i+1; j < Num3.length; j++) {
                if (Num3[i]>Num3[j]) {
                   int temp=0;
                   temp=Num3[i];
                   Num3[i]=Num3[j];
                   Num3[j]=temp;
                }
            }
        }
        for (int i = 0; i < Num3.length; i++) {
            System.out.print(Num3[i]+" ");
        }
    }
}

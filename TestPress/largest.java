public class largest {
    public static void main(String[] args) {
        int arr[] = { 54, 546, 548, 60 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                String ref = String.valueOf(arr[i]+""+arr[j]);
                String ref1 = String.valueOf(arr[j]+""+arr[i]);
                int num1=Integer.parseInt(ref);
                int num2=Integer.parseInt(ref1);
                if (num1<num2) {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}

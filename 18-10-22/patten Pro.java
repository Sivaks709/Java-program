class Pattern
{
    public static void main(String[] args) {
        int n=5,num=1;
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                if (num!=10) {
                    if (j!=6) {
                        System.out.print(num++ +" ");
                    } else {
                        System.out.print("");
                    }
                } else {
                    System.out.print(num);
                    num=1;
                }
            }
            System.out.println();
        }
    }
}
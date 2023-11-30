public class impliments_the_classes {

    public static void main(String[] args) {
        impliments_the_classes1 ref = new impliments_the_classes1();
        impliments_the_classes2 ref1 = new impliments_the_classes2();
        System.out.println(ref.s.hashCode()==ref1.s.hashCode());
        System.out.println(ref.equals(ref1)?"Both Datas Are Same":"Both Datas Are Not Same");
        System.out.println(ref1.equals(ref)?"Both Datas Are Same":"Both Datas Are Not Same");
    }
}

class impliments_the_classes1 {
    String s="siva";
    @Override
    public boolean equals(Object obj) {
        impliments_the_classes2 foo = (impliments_the_classes2) obj;
        if (this.s==foo.s) {
            return true;
        }
        return false;
    }
}
class impliments_the_classes2 {
    String s="siva";
    @Override
    public boolean equals(Object obj) {
        impliments_the_classes1 foo = (impliments_the_classes1)obj;
        if(this.s==foo.s){
            return true;
        }
        return false;
    }
}
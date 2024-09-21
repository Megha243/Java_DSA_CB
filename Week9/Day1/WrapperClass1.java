package Week9.Day1;

public class WrapperClass1 {
        // private
        private static int Prnum=10;
        //default
        int deNum=20;
        //public
        public int pubNum=30;
        // protected
        protected int protectNum=40;
    
    public static void main(String[] args) {
        OOPs1 o1=new OOPs1();
        System.out.println(o1.num);
        System.out.println(Prnum);
        // System.out.println(o1.Prnum); //as its privates so throws error
    
        System.out.println("NON ACCESS MODIFIER");
        NonAccessModifier n1=new NonAccessModifier();
        System.out.println(n1.num);
        System.out.println("------------");
        System.out.println(n1.nums);
        System.out.println("------**************------");

        NonAccessModifier n2=new NonAccessModifier();
        System.out.println(n2.num);
        System.out.println("------------");
        System.out.println(n2.nums);
        System.out.println("------**************------");

        NonAccessModifier n3=new NonAccessModifier();
        System.out.println(n3.num);
        System.out.println("------------");
        System.out.println(n3.nums);

    }
    
}

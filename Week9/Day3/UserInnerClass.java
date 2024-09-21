package Week9.Day3;

// import Week9.Day3.UserInnerClass.InnerClass.SecondInnerClass;

public class UserInnerClass {
    public static class InnerClass{
        public InnerClass(){}
        public static class SecondInnerClass {
        
                public SecondInnerClass(){}
        }
    }
    public static void main(String[] args) {
        UserInnerClass uic=new UserInnerClass();
        InnerClass ic=new InnerClass();
        // SecondInnerClass sic=new SecondInnerClass();
        InnerClass.SecondInnerClass sic=new InnerClass.SecondInnerClass();

    }
}

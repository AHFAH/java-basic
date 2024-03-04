package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1;
        data1 = 10;
        //data1 = 20;  //컴파일 오류

        method(data1);
    }
    
    static void method(final int a){
        //a = 20; //컴파일 오류
    }
}

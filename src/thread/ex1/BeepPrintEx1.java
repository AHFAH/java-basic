package thread.ex1;

import javax.tools.Tool;
import java.awt.Toolkit;

public class BeepPrintEx1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i=0; i<5; i++){  // 0.5초 간격으로 비프음을 발생
                    toolkit.beep();
                    try{
                        Thread.sleep(500);
                    }
                    catch(Exception e){}
                }
            }
        });

        thread.start();

        /*
        작업 스레드에서 0.5초 간격으로 비프음을 발생시키는 것과
        메인 스레드에서 0.5초 간격으로 "띵" 출력하는 것이 동시에 이루어짐
        */

        for(int a=0; a<5; a++){
            System.out.println("띵");
            try{Thread.sleep(500);}
            catch(Exception e){}
        }
    }
}

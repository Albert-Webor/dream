package jproject.basic;
/*
* 控制流程案例
* */
public class ControlFlowDemo {
    /* 测试带标签的break*/
    public void testBreak(){
        boolean flg=true;
        int i=0;
        //最外层标签
        end:
        while(flg){
            go: //倒数第二内层
            for(int a=0 ;a<=3;a++){
                for(int b=0 ;b<3;b++){
                    if(a == 1)
                        break end;
                    System.out.println("@");
                }
            }
            System.out.println("YES");
            flg=false;
        }
        System.out.println("nihao");
    }
    public static void main(String[] args) {
         for(int a=0;a<3;a++){
             end:
             for(int b=0;b<3;b++){
                 if( a == 1 && b == 1)
                     break end;
                 System.out.println("a="+a+"b="+b);
             }
             System.out.println("GG");
         }

    }
}

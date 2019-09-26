package main;

public class Clock {
    Display minute=new Display(60);
    Display hour=new Display(24);
    public void start(){
        while(true){
            minute.increase();
            if(0==minute.getNumber()){
                hour.increase();
            }
            System.out.printf("%02d:%02d\n",hour.getNumber(),minute.getNumber());
        }
    }
    public static void main(String[] args) {
        Clock cc=new Clock();
        cc.start();
    }
}

package main;

public class Display {
    private Integer number=0;
    private Integer limit;
    Display(Integer limit){
        this.limit=limit;
    }
    public Integer getNumber(){
        return number;
    }
    public void increase(){
        number+=1;
        if(number>=limit){
            number=0;
        }
    }
}

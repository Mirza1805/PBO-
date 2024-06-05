package week3;
public class Clock{
    public static void main(String[]args){
        ClockDisplay jam = new ClockDisplay(14,30);
        
        jam.timeTick();
        System.out.println(jam.getTime());
    }
}
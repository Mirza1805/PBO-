package week3;
public class NumberDisplay{
    private int limit;
    private int value;
    
    //contruktor
    public NumberDisplay (int rollerOVerLimit){
        limit=rollerOVerLimit;
        value=0;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int nilai){
        if ((nilai>=0)&&(nilai<limit)){
            value=nilai;
        }
    }

    public String getDisplayValue(){
        if(value < 10){
            return "0" +value; //concatenate
            /* 11+11.3 = 22.3
            "11"+"11"="1111"
            "11"+11="1111" 
            */
        }
        else{
            return ""+value;
        }
    }

    public void increment(){
        value=(value+1)%limit;
    }
}
package shiyan;



public class Sjx {
	
	private double a;

    private double b;

    private double c;
    
    private String temp;
    
    public Sjx(double a, double b, double c) {

        super();

        this.a = a;

        this.b = b;

        this.c = c;

     }
    public boolean isSjx(){//判断三角形

        if(a+b<=c || a+c<=b || b+c<=a){

            return false;

        }

        else{

            return true;

        }

     }
    
    public String cal(){
    	if(isSjx()){
    		
    		if(a==b&&a==c){
    			temp="等边三角形";
    		}
    		else if(a==b||a==c||b==c){
    			temp="等腰三角形";
    		}
    		else{
    			temp="其他三角形";
    		}
    	}
    	else{
    		return "构不成三角形";
    	}
    	return temp;
    }

}

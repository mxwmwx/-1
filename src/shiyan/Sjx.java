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
    public boolean isSjx(){//�ж�������

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
    			temp="�ȱ�������";
    		}
    		else if(a==b||a==c||b==c){
    			temp="����������";
    		}
    		else{
    			temp="����������";
    		}
    	}
    	else{
    		return "������������";
    	}
    	return temp;
    }

}

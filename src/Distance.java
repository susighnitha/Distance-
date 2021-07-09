import java.lang.Math.*;
public class Distance {
	public static void main(String arg[])	
	{
            int x1,x2,y1,y2;
	    double dis;
	    x1=3;y1=4;x2=5;y2=4;
	    dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));	 	    
            System.out.println("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+dis);
	}
}



public class Calculate {

	public static int square(int par){
		int x=par*par;
		return x;
	}
	
	public static int cube(int par){
		int x=par*par*par;
		return x;
	}
	
	public static double average(double par,double par2){
		double x=(par+par2)/2;
		return x;
	}
	
	public static double average(double par1,double par2,double par3){
		double x=(par1+par2+par3)/3;
		return x;
	}
	
	public static double toDegrees(double par){
		double x=(par*180)/3.14159;
		return x;
	}
	
	public static double toRadians(double par){
		double x=(par*3.14159)/180;
		return x;
	}
	
	public static double discriminant(double a, double b, double c){ //not finished
		return (b*b)-(4*a*c);
	}
	
	public static String toImproperFrac(int par,int par2,int par3){
		int x=((par*par3)+par2);
		String str=x+"/"+par2;
		return str;
	}
	
	public static String toMixedNum(int par,int par2){
		int x=(par/par2);
		int y=(par%par2);
		String str=x+"_"+y+"/"+par2;
		return str;
	}
	
	public static String foil(int a,int b,int c,int d,String var){
		int x=(a*c);
		int y=(a*d)+(b*c);
		int z=(b*d);
		String str=x+var+"^2"+y+var+z;
		return str;
	}
	
	public static boolean isDivisibleBy(int par,int par2){
		if(par%par2==0){
			return true;
		}else{
			return false;
		}
	}
	
	public static double absValue(double par){
		if(par<0){
			par*=-1;
		}
		return par;
	}
	
	public static String max(int par,int par2,int par3){
		int x=((par*par3)+par2);
		String str=x+"/"+par2;
		return str;
	}
}

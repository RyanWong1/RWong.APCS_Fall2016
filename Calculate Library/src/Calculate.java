//sfdgfghhjjkliouytrewqaszxcvbnmk,lkopiuytrewqasdfg

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
		String str=x+var+"^2+"+y+var+"+"+z;
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
	
	public static int max(int par,int par2){
		if(par>par2){
			return par;
		}else{
			return par2;
		}
	}
	
	public static double min(double par,double par2){
		if(par<par2){
			return par;
		}else{
			return par2;
		}
	}
	
	public static double round2(double par){
		double var=par;
		var=(var*100)+0.5;
		var=(int)var;
		var=(double)var;
		var=var/100;
		return var;	
	}
	
	public static double exponent(double par,int x){
		double total=1;
		int counter=x;
		while(x>=0){
			total=par*par;
			counter--;
		}
		return par;
	}
	
	public static int factorial(int par){
		int total=1;
		for(int i=par;i>0;i--){
			total*=i;
		}
		return total;
	}
	
	public static boolean isPrime(int x){
		boolean prime=true;
		x=(int) absValue(x);
		for(int i=2;i<x;i++){
			if(x%i==0){
				prime=false;
			}
		}
		return prime;
	}
	
	public static int gcf(int x,int y){
		int gcf=1;
		for(int i=1;i<=x;i++){
			if(isDivisibleBy(x,i) && isDivisibleBy(y,i)){
				gcf=i;
			}
		}
		return gcf;
	}
	
	public static double sqrt(double x){
		double y=0;
		double sqrt=x/2;
		do{
			y=sqrt;
			sqrt=(y+(x/y))/2.0;
		}while(y-sqrt!=0);
		sqrt=round2(sqrt);
		return sqrt;
	}
}

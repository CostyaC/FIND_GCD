package tasks.task1_GCD;

public class FindGCD {
	
// question 1.1

public static int GCD(int a , int b){
	
while (a != b)	
	
if(a > b) 
		
  a = a - b;
	
	      else
		
   b = b - a;

  return a ; 

}



// question 1.2

public static int getRest(int b, int a){
	
	if ( b % a == 0)
		
		return b / a;
	
	else 
		
		return b % a ;
	
}

public static int Recursive_1GCD(int a, int b){
	
  if( b == getRest(b,a)) {
	  
	  return GCD(a,b); 
  }
  
  else {
	  
if(b == GCD(a,b))
	
	return b;

else return getRest(a,b);
   
}
  
  
}



//question 1.3

public static int Recursive_2GCD(int a, int b){
	
	if( a == b) {
		
return	a = GCD(a,b);
		
	}  else
	
	if(GCD(a/2,b/2) == 2){
		
		return GCD(a,b);
	
	} else
	
	if(GCD(a,b/2) == GCD(a,b)){
		
		return GCD(a,b);
		
	} else
	
	if(GCD(a/2,b) == GCD(a,b)){
		
	return GCD(a,b);
		
	} else 
		
	if(GCD(a-b,b) == GCD(a,b)){
		
	return GCD(a,b);
		
	} else 
		
		
		return GCD(a,b - a);
		
}



}
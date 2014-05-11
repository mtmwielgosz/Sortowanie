import java.util.Arrays;
import java.util.Random;



public class Sortowanie 
{
  public static long ile = 0;
  
	
  public static void main(String[] args)
  {
	  int s1 = 10000;
	  int s2 = 100000;
	  int s3 = 1000000;
	 

	  int[] a = new int[s1];
	  int[] b = new int[s1];
	  int[] c = new int[s1];
	  int[] d = new int[s1];
	  int[] e = new int[s1];
	  int[] f = new int[s1];
	  utworz(a,b,c,d,e,f,s1,s1);
	  
	  //Bubble1
	  Linia bubble1 = new Linia();
	  bubble1.nazwa = "Bubble sort for 10k records";
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czas = ile;
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czaspos = ile;
	  zamien(a);
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czasod = ile;
	  String nazwa = "Name";
	  String p = "|";
	  String norm ="Normal [ms]";
	  String rdy = "Ready [ms]";
	  String opp = "Opposite [ms]";

	  System.out.printf( "%-30s %s %13s %s %13s %s %13s %s %n", nazwa,p,norm,p,rdy,p,opp,p);
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", bubble1.nazwa,p,bubble1.czas,p,bubble1.czaspos,p,bubble1.czasod,p);

	  
	  //Shell1
	  
	  Linia shell1 = new Linia();
	  shell1.nazwa = "Shell sort for 10k records";
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czas = ile;
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czaspos = ile;
	  zamien(b);
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", shell1.nazwa,p,shell1.czas,p,shell1.czaspos,p,shell1.czasod,p);
	  
	  
	  //Insert1
	  
	  Linia insert1 = new Linia();
	  insert1.nazwa = "Insert sort for 10k records";
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czas = ile;
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czaspos = ile;
	  zamien(c);
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", insert1.nazwa,p,insert1.czas,p,insert1.czaspos,p,insert1.czasod,p);
	 
	  
	  
	  //Select1
	  
	  Linia l = new Linia();
	  l.nazwa = "Select sort for 10k records";
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(d);
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  
	  //Quick1
	  
	  l.nazwa = "Quick sort for 10k records";
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(e);
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
 //Java1
	  
	  l.nazwa = "Java sort for 10k records";
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(f);
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  
	  
	  System.out.println();

	  //100k
	  
	  a = new int[s2];
	  b = new int[s2];
	  c = new int[s2];
	  d = new int[s2];
	  e = new int[s2];
	  f = new int[s2];
	  utworz(a,b,c,d,e,f,s2,s2);
	  
	  //Bubble10
	  
	  bubble1 = new Linia();
	  bubble1.nazwa = "Bubble sort for 100k records";
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czas = ile;
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czaspos = ile;
	  zamien(a);
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13s %s %13s %s %13s %s %n", nazwa,p,norm,p,rdy,p,opp,p);
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", bubble1.nazwa,p,bubble1.czas,p,bubble1.czaspos,p,bubble1.czasod,p);
	  
	  //Shell10
	  
	  shell1 = new Linia();
	  shell1.nazwa = "Shell sort for 100k records";
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czas = ile;
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czaspos = ile;
	  zamien(b);
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", shell1.nazwa,p,shell1.czas,p,shell1.czaspos,p,shell1.czasod,p);
	  
	  
	  //Insert10
	  
	  insert1 = new Linia();
	  insert1.nazwa = "Insert sort for 100k records";
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czas = ile;
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czaspos = ile;
	  zamien(c);
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", insert1.nazwa,p,insert1.czas,p,insert1.czaspos,p,insert1.czasod,p);
	 
	  
	  
	  //Select10
	  
	  l = new Linia();
	  l.nazwa = "Select sort for 100k records";
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(d);
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  
	  //Quick10
	  
	  l.nazwa = "Quick sort for 100k records";
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(e);
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  //Java100
	  
	  l.nazwa = "Java sort for 100k records";
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(f);
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  
	  
	  
	  System.out.println();
	  
	  

	  //1m
	  
	  a = new int[s3];
	  b = new int[s3];
	  c = new int[s3];
	  d = new int[s3];
	  e = new int[s3];
	  f = new int[s3];
	  utworz(a,b,c,d,e,f,s3,s3);
	  
	  //Bubble100
	  
	  bubble1 = new Linia();
	  bubble1.nazwa = "Bubble sort for 1m records";
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czas = ile;
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czaspos = ile;
	  zamien(a);
	  ile = System.currentTimeMillis();
	  bubble(a);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  bubble1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13s %s %13s %s %13s %s %n", nazwa,p,norm,p,rdy,p,opp,p);
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", bubble1.nazwa,p,bubble1.czas,p,bubble1.czaspos,p,bubble1.czasod,p);
	  
	  //Shell100
	  
	  shell1 = new Linia();
	  shell1.nazwa = "Shell sort for 1m records";
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czas = ile;
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czaspos = ile;
	  zamien(b);
	  ile = System.currentTimeMillis();
	  shell(b);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  shell1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", shell1.nazwa,p,shell1.czas,p,shell1.czaspos,p,shell1.czasod,p);
	  
	  
	  //Insert100
	  
	  insert1 = new Linia();
	  insert1.nazwa = "Insert sort for 1m records";
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czas = ile;
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czaspos = ile;
	  zamien(c);
	  ile = System.currentTimeMillis();
	  insert(c);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  insert1.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", insert1.nazwa,p,insert1.czas,p,insert1.czaspos,p,insert1.czasod,p);
	 
	  
	  
	  //Select100
	  
	  l = new Linia();
	  l.nazwa = "Select sort for 1m records";
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(d);
	  ile = System.currentTimeMillis();
	  select(d);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	  
	  
	  //Quick100
	  
	  l.nazwa = "Quick sort for 1m records";
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(e);
	  ile = System.currentTimeMillis();
	  quick(e,0,e.length-1);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);


	  //Java100
	  
	  l.nazwa = "Java sort for 1m records";
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czas = ile;
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czaspos = ile;
	  zamien(f);
	  ile = System.currentTimeMillis();
	  Arrays.sort(f);
	  ile = Math.abs(ile - System.currentTimeMillis());
	  l.czasod = ile;
	  
	  System.out.printf( "%-30s %s %13d %s %13d %s %13d %s %n", l.nazwa,p,l.czas,p,l.czaspos,p,l.czasod,p);
	 
	  
	  
	  
	   
  }
	
	
  public static void utworz(int[] a, int[] b, int[] c, int[] d, int[] e, int[] f, int n, int m)
  {

	  Random r = new Random();
	  for(int i=0; i<n;i++)
	  {
		  int pom = r.nextInt(m);
		  a[i] = pom;
		  b[i] = pom;
		  c[i] = pom;
		  d[i] = pom;
		  e[i] = pom;
		  f[i] = pom;
		  
	  }
  }
  
  public static void zamien(int[] a)
  {
	  int i=0;
	  int k=a.length-1;
	  while(i<k)
	  {
		  int pom = a[i];
		  a[i] = a[k];
		  a[k] = pom;
		  i++;
		  k--;
	  }
  }
	
	
  public static void bubble(int[] a)
  {
	  int n = a.length;
	   do
	   {
	    for (int i=0; i<n-1; i++)
	      if(a[i] > a[i+1])
	      {
	    	  int pom = a[i];
	    	  a[i] = a[i+1];
	    	  a[i+1] = pom;
	    	  
	      }
	    n = n-1;
	   }
	   while(n>1);

  }  
  






public static void shell(int[] a)
  {
	  

	  int luka = 0; 
	  for(luka = a.length / 2; luka > 0; luka = luka == 2 ? 1 : (int) ( luka / 2.2 ) )
	            for(int i = luka; i < a.length; i++)
	            {
	                Integer pom = a[i];
	                int j = i;
	                while(j>= luka && pom.compareTo( a[ j - luka ] ) < 0)
	                {
	                    a[j] = a[j - luka];
	                    
	                    j -= luka;
	                }
	                a[j] = pom;
	                
	            }

	    
  }
  
  
  
  public static void insert(int[] a)
  {
	  

    	for(int i = a.length - 1; i >= 1; i--) 
    	{
    		int pom = a[i-1];
    		while ((i<a.length) && (pom > a[i]))
    		{
    			a[i-1] = a[i];
    		    i++;
    		    
    		}
    		    a[i-1] = pom;
    		    
    		 
        }

  }
    
    
  
  public static void select(int[] a) 
  {

      int i, j, min_i;
      int n = a.length;
      for (i = 0; i < n - 1; i++) 
      {
    	  min_i = i;
          for (j = i + 1; j < n; j++)
        	  if (a[j] < a[min_i])
                   min_i = j;
          
          if (min_i != i) 
          {
              int pom = a[i];
              a[i] = a[min_i];
              a[min_i] = pom;
          }
      }

 }
   
  
   private static void quick(int[] a,int x,int y) 
   {
	  int i,j,v;
	  i=x;
	  j=y;
	  v=a[(x+y)/2];
	  do 
	  {
		  while (a[i]<v)
			  i++;
		  while (v<a[j])
			  j--;
		  if (i<=j) 
		  {
			 int pom=a[i];
			 a[i]=a[j];
			 a[j]=pom;
			 i++;
			 j--;
		  }
	  }
	  while (i<=j);
	  
	  if (x<j)
		  quick(a,x,j);
	  if (i<y)
		  quick(a,i,y);
  }
  
  
   public static void wyswietl(int a[])
   {
	   for(int i=0; i<a.length; i++)
	   {
		   System.out.print(a[i]+", ");
	   }
	   System.out.print(" Czas trwania: "+ile+" ms");
   }
	
	
	

}

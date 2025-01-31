package rex;
public class AmtIntoWrds
{
   public void MethodA(int n)
   {
     String []str={"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Tweleve","Thirteen","Fourteen","Fiveteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty"};
     String []ttr={"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
     if(n<100 && n>20)
    {
     int a=n/10;
     int b=n%10;
     System.out.println("Result:"+ttr[a]+" "+str[b]);
    }
    else if(n>100&&n<1000)
    {
      int r=n/100;
      int s=(n/10)%10;
      int u=n%10;
      if(s==1)
      {
       System.out.println("Result:"+str[r]+" hundred and "+str[(s*10)+u]);
      }
      else{
      System.out.println("Result:"+str[r]+" hundred and "+ttr[s]+" "+str[u]);
      }
    }
    else if(n>1000 &&n<=100000)
    {
       int q=n/1000;
      int rt=n/100;
      int ht=rt%10;
      int t=n%10;
      int tt=n/10;
      int tt2=tt%10;
      if(tt2==1)
      {
        System.out.println("Result:"+str[q]+" Thousand "+str[ht]+" hundred and  "+str[(tt2*10)+t]);
      }
      else{
      System.out.println("Result:"+str[q]+" Thousand "+str[ht]+" hundred and "+ttr[tt2]+" "+str[t]); 
      }
    }
     else if(n>100000)
    {
       int q=(n/100000);
       int ni=(n/10000)%10;
      int ht=(n/100)%10;
      int htt=(n/1000)%10;
      int t=n%10;
      int tt=n%100;
      int tt2=tt/10;
      if(tt2==1)
      {
        System.out.println("Result:"+str[q]+" Lakh "+ttr[ni]+" "+str[htt]+" Thousand "+str[ht]+" Hundred and "+str[(tt2*10)+t]); 
      }
      else{
       System.out.println("Result:"+str[q]+" Lakh "+ttr[ni]+" "+str[htt]+" Thousand "+str[ht]+" Hundred and "+ttr[tt2]+" "+str[t]); 
      }
    }
  }
}
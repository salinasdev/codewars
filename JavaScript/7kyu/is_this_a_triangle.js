function isTriangle(a,b,c)
{
   if (a == 0 || b == 0 || c == 0){
     return false;
   }else{
     if ((a < b + c) &&  (b < a + c) && (c < a + b)){
       return true;
     }else{
       return false;    
     }
   }
   return true;
}
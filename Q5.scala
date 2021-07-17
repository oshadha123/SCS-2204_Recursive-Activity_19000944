//19000944
object Q5 extends App{

  def isEven(n:Int):Boolean = n match {
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n: Int):Boolean = !(isEven(n))

 def sum(n:Int):Int= {

   if(n==1){
     0
   }
   else
     {
       if(isEven(n))
         sum(n-1)+n

       else
         sum(n-1)
     }

 }
  var m:Int=10
  println(sum(m-1))
}

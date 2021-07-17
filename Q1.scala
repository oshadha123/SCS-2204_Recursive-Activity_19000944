//19000944
object Q1 extends App {

  def gcd(x:Int,y:Int):Int=y match {
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ =>gcd(y,x%y)
  }

  def prime(p:Int,n:Int=2):Boolean= n match {
    case x if(p==x) =>true
    case x if (gcd(p,x)>1) => false
    case x => prime(p,x+1)
  }


  println(prime(5))
  println(prime(8))

}

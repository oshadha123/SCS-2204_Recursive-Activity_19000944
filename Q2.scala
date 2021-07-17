//19000944
object Q2 extends App {

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

  def primeSeq(n:Int):Any={


    if(n>1) {

      primeSeq(n-1)
      if(prime(n)) println(n)

    }

  }

  println(primeSeq(10))

}

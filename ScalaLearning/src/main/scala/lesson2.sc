class Foo{}

object FooMaker{
  def apply = new Foo
}

//val fooMaker = new FooMaker()

(x :Int) => x+1

val f = (x:Int) => x+1

1.to(10)

BigInt.probablePrime(4,util.Random)

"Ashish".distinct

10 max 2
BigInt(2).pow(1024)

1 to(12)
/*for( n <- 1 to(12) ){

  if( n == 6) util.control.Breaks.break()
  print(n +" ")
}*/

def decorate(str: String,left:String="[",right:String="]")=left+str+right

print(decorate("hello"))

print("hello")

def sum(args : Int*)={

  var result = 0;
  for(arg <- args){
    result += arg
  }
  result
}

sum(1,2,3,4,5)


def adder(m:Int,n:Int)=m+n

adder(2,4)

val add2 = adder(2,_:Int)

add2(6)

def multiply(m :Int,n:Int) = m*n

multiply(3,4)

val multiply2 = multiply(2,_:Int)
multiply2(8)

def multiplyCurried (m:Int)(n:Int) :Int = m*n
multiplyCurried(3)(4)

def multiplyCurried3 = multiplyCurried(3)_

multiplyCurried3(8)

val curriedAdder = (adder _).curried

val add3 = curriedAdder(3)
add3(6)

// variable length arguements

def capitalizeAll(args: String *) ={

  args.map( args => args.capitalize)
}

capitalizeAll("ashish","ïon")

/*class Calculator{

  val brand : String = "HP"
  def add(m:Int,n:Int)=m+n
}

val calc = new Calculator
calc.add(3,6)
calc.brand*/

class Calculator(brand : String){

  val color : String = if(brand == "TI")
      "blue"
  else if(brand == "HP")
      "red"
  else
    "black"

  def add(m:Int,n:Int) = m+n
}

val calc = new Calculator("HP")
calc.color

class C {

  var acc = 0
  def minc= {acc += 1}
  def finc ={ () => acc += 1}
}

val c = new C

c.minc
c.finc

//Inheritance

class ScientificCalculator(brand : String) extends Calculator(brand){

  def log(m :Int,base : Int) = math.log(m)/math.log(base)
}

abstract class Shape{

  def getArea(r:Int)=math.Pi*r*r
}

trait opertaion{

  def add(m: Int) : Int
}

class impl extends opertaion{

  def add(m : Int) = m+4
}
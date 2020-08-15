

object loops {
  def main( args :Array[String]){
//    var x=20;
//    
//    do{
//      println(x);
//      x+=1;
//    }while(x<10)
//  }
//
    var y=0;
    for(x<- 0 until 10){
      println(x);
      y+=1;
    }
    val lst= List(1,2,3,4,5,6,7,8,9,10);
    
   val result= for{x<-lst if x<6} yield {
      x*x;
    }
    
   println(result);
  }
}


object match_switch {
  def main(args: Array[String]){
    val age=50;
    age match{
      case 24 => println(age);
      case 30 => println(age);
      case 20 => println(age);
      case 40 => println(age);
      case _ => println("default");
    
    }
   
    val result = age match{
      case 24 => age;
      case 30 => age;
      case 20 => age;
      case 40 => age;
      case _ => "default";
    
    } 
  }
}
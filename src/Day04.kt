

/**
 * Created by Administrator on 2017/5/24.
 */
val  data = object : TypeCastException() {

}
fun  transform(color:String):Int{
    return when(color){
        "RED" ->0
        "GEEEN"->1
        "BLUE"->2
        else ->throw  IllegalArgumentException("非法参数异常")
    }
}
//try /catch 表达式

fun testTry(){
    val  result  =try{
//        count();
    }catch (e:ArithmeticException){
        throw IllegalStateException(e);
    }
}

// "if" 表达式

fun  foo(parm:Int){
    val  result = if (parm ==1){
        "one"
    }else if (parm ==2){
        "two"
    }
    else{
        "three"
    }
}
fun arrayOfMinusOnes(size :Int):IntArray{
//    全是 -1
    return  kotlin.IntArray(size).apply { fill(-1) }
}
fun theAnswer() =42
 class Turtle{
    fun penDown(){
        print("penDown")
    }
     fun penUp(){
         print("penUp")
     }
     fun turn(degree: Double){
         print("turn")
     }
     fun  forward(pixels:Double){
         print("forward")
     }
}
//fun Day07.main(args: Array<String>) {
//    print("arrayOfMinusOnes(10) ${arrayOfMinusOnes(10)}")
//    val myTurtle =Turtle()
//    with(myTurtle){//画一个 100像素的正方形
//        for (i in 1..4){
//            forward(100.0)
//            turn(90.0)
//        }
//        penUp()
//    }
//    val  stream =Files.newInputStream(Paths.get("./res/file.txt"))
//    stream.buffered().reader().use {
//        reader ->
//        println(reader.readText())
//    }
//
////    val  b :Boolean?=
//
//
//}
class Person(id:Int,name:String)
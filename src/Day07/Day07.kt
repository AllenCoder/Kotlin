package Day07

/**
 * Created by Administrator on 2017/6/3.
 */
fun main(args: Array<String>)
{
    var x = 7
    when (x) {
        in 1..10 -> print("x is in the range")
        !in 10..20 -> print("x is outsize the range")
        else -> print("none of the above")
    }

}
//val hasPrefix = when(x) {
//    is String -> x.startsWith("prefix")
//    else -> false
//}
fun loop():Boolean{
 return  false
}
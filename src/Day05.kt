/**
 * Created by Administrator on 2017/5/25.
 */
//interface Foo<out T:Any>{
//    fun foo(a:Int) :T
//}
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
val  a :Int =10000
val boxedA :Int?=a
val antherBoxedA:Int?=a

//显式转换

//fun Day07.main(args: Array<String>) {
//    println("${oneMillion}")
//    println("${creditCardNumber}")
//    println("${socialSecurityNumber}")
//    println("${hexBytes}")
//    println("${bytes}")
//
//    println(boxedA ===antherBoxedA)
//    val a: Int? = 1 // ⼀个装箱的 Int (java.lang.Integer)
//}
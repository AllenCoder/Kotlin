package Day14

/**
 * Created by Allen on 2017/6/21.
 */
abstract class Source<out T> {
    abstract fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs //这个是输出泛型
}

abstract class Comparable<in T> {
    abstract fun compareTo(other: T): Int
}

fun demo(x:Comparable<Number>){
    x.compareTo(1.0)//1.0输入number子类型
    val y:Comparable<Double> =x
}
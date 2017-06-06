/**
 * Created by Administrator on 2017/5/26.
 */
abstract class Array<T> private constructor(){
    val size:Int = 0
    abstract operator fun get(index:Int):T
    abstract operator fun set(index: Int, value:T):Unit
    abstract operator fun iterator():Iterable<T>
}


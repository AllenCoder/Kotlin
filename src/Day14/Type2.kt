package Day14

/**
 * Created by Allen on 2017/6/21.
 */
class Array<T>(val size: Int) {
    fun get(index: Int): T {
        val x: T? = null;return x!!
    }

    fun set(index: Int, value: T) {}
}

fun copy(from: Array<out Any>, to: Array<Any>) {

}

fun fill(dest: Array<in String>, value: String) {

}

fun <T> singletonList(item: T): List<T> {

    val arg: T? = null
    return arrayListOf(arg!!)
}

fun <T> T.basicToString(): String {
    return ""
}



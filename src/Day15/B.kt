package Day15

/**
 * Created by Allen on 2017/6/22.
 */
class B : A() {
    override fun foo(i: Int) {
        println("B implement i ${i}")
    }

    fun printHello(name: String?): Unit {
        if (name != null) {
            println("Hello ${name}")
        } else {
            println("Hi there")
        }
    }

    fun double(x: Int): Int = x * 2
    //    编译器推断
    fun float(x: Float) = x * 2

    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()

        result += ts
        return result
    }
}
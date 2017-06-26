package Day15

import com.sun.corba.se.impl.orbutil.graph.Graph
import sun.security.provider.certpath.Vertex
import java.util.concurrent.locks.Lock

/**
 * Created by Allen on 2017/6/22.
 */
fun main(args: Array<String>) {
    var b = B()
    b.foo(100)
    println(b.asList(1, " 2 ", 7, "a"))
//[1,  2 , 7, a]
    println(b.asList(" 1 ", " 2 "))
//    [ 1 ,  2 ]

    val a = arrayOf(1, 2, 3)

    val list = b.asList(-1, 2, *a, 4)

//[-1, 2, 1, 2, 3, 4]
    println(list)
    val x = arrayOf("a", 2, 3)
    val alist = b.asList(-1, 2, x, 4)
//[-1, 2, [Ljava.lang.Object;@3fee733d, 4]
    println(alist)

    println(findFixPoint(100.00))

    var str ="love23next234csdn3423javaeye"
    println(str.replace("[\\d]","ac"))
}


fun dfs(graph: Graph) {

    val visited = HashSet<Vertex>()
    fun dfs(current: Vertex) {
        if (!visited.contains(current)) {
            return
        }
    }
}
//inline fun lock<T>(lock:Lock,body:() ->T):T{
//   val a :T
//
//    return a!!;
//}
tailrec fun findFixPoint(x: Double = 1.0): Double {
    return if (x == Math.cos(x)) x else {

        println("X  is ${x}")
        findFixPoint(Math.cos(x))
    }
}

fun <T> lock(lock: Lock, body: () -> T): T {
    lock.lock()
    try {
        return body()
    } finally {
        lock.unlock()
    }
}
package Day16

import kotlin.coroutines.experimental.*

/**
 * Created by Allen on 2017/6/23.
 */
fun main(args: Array<String>) {
    println("before coroutine")
//    启动我们的协程
    asyncCalcMd5("kotlin-docs.pdf") {
        println("in 第一个协程coroutine. Before suspend.")
        //暂停我们的线程，并开始执行一段耗时操作
        val result: String = suspendCoroutine {
            continuation ->
            println("in 第一个协程suspend block.")
            continuation.resume(calcMd5(continuation.context[FilePath]!!.path))
            println("after第一个协程 resume.")
        }
        println("in 第一个协程 coroutine. After suspend. result = $result")
    }
    println("after 第一个协程 coroutine")

    asyncCalc("saaaaaaaa") {
        println("in coroutine,我开始计算 md5")
        val result: String = suspendCoroutine {
            continuation ->
            println("in suspend block")

            continuation.resume(calcStringMd5(continuation.context[getCoroutineContextMd5]!!.md5String))

            println("after resume")
        }

        println("in coroutine. After suspend. result = $result")
    }

    println("end end end")
}

/**
 * 上下文，用来存放我们需要的信息，可以灵活的自定义
 */
class FilePath(val path: String) : AbstractCoroutineContextElement(FilePath) {
    companion object Key : CoroutineContext.Key<FilePath>
}

class getCoroutineContextMd5(var md5String: String) : AbstractCoroutineContextElement(getCoroutineContextMd5) {
    companion object Key : CoroutineContext.Key<getCoroutineContextMd5>

}

fun asyncCalc(md5String: String, block: suspend () -> Unit) {
    val continuation = object : Continuation<Unit> {
        override val context: CoroutineContext
            get() = getCoroutineContextMd5(md5String) //To change initializer of created properties use File | Settings | File Templates.

        override fun resume(value: Unit) {
            println("resume $value")
        }

        override fun resumeWithException(exception: Throwable) {
            println(exception.toString())
        }

    }
    println("block 开始执行 continuation")
    block.startCoroutine(continuation)
}

fun asyncCalcMd5(path: String, block: suspend () -> Unit) {
    val continuation = object : Continuation<Unit> {
        override val context: CoroutineContext
            get() = FilePath(path)

        override fun resume(value: Unit) {
            println("resume: $value")
        }

        override fun resumeWithException(exception: Throwable) {
            println(exception.toString())
        }
    }
    block.startCoroutine(continuation)
}

fun calcStringMd5(path: String): String {
    println("calc md5 for $path")
    Thread.sleep(2000)
    return System.currentTimeMillis().toString()
}

fun calcMd5(path: String): String {
    println("calc 第一个协程 md5 for $path.")
    //暂时用这个模拟耗时 
    Thread.sleep(1000)
    //假设这就是我们计算得到的 MD5 值 
    return System.currentTimeMillis().toString()
}
//fun <T> async(block: supsend()->T)

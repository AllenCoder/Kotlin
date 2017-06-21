package Day14

/**
 * Created by Allen on 2017/6/21.
 */
class C {

    //私有函数
    private fun foo() = object {
        val x: String = "X"
    }
    //公有函数
    fun publicFoo() = object {
        val x: String = "x"
    }

    fun bar() {
        val x1 = foo().x
        println("------------")

        println(this)
        println("foo() ${foo()}")
        val x2 = publicFoo()
        println(" publicFoo() ${publicFoo()}")
    }
}


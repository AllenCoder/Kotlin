package Day09

/**
 * Created by Administrator on 2017/6/6.
 */
open class A {
    open fun f() {
        print("A")
    }
}

interface B {
    fun f() {
        print("B")
    }
    fun b(){
        print("b")
    }
}
class C():A(),B{
    override fun f(){
        super<A>.f()
        super<B>.f()
    }
}

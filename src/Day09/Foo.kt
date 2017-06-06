package Day09

/**
 * Created by Administrator on 2017/6/6.
 */
interface FooInter {
    val count: Int
}

class Bar2(override val count: Int) : FooInter

class Bar3 : FooInter {
    override var count: Int = 0
}
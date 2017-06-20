package Day11

/**
 * Created by Administrator on 2017/6/11.
 */
class Child:MyInterface{
    override val prop: Int
        get() = 29 //To change initializer of created properties use File | Settings | File Templates.
    override fun bar() {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        print("child bar")
    }


    override fun foo() {
        super.foo()
        print("Child override foo")
    }

}
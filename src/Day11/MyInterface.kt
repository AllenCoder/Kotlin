package Day11

/**
 * Created by Administrator on 2017/6/11.
 */
interface MyInterface {
    fun bar()
    fun foo(){
        print("foo")
    }
    val prop:Int//抽象的
    val propertWithImplementation:String
        get() = "foo"
}
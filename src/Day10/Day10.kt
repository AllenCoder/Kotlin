package Day10

/**
 * Created by Administrator on 2017/6/8.
 */
private var _table:Map<String,Int>? =null

public val table:Map<String,Int>
    get(){
        if (_table ==null){
            _table =HashMap()
        }
        return _table?:throw AssertionError("set to null by another thread")
    }


public class MyTest{
    lateinit var subject:String
    fun setup(){
        subject= String()
    }
    fun test(){
        subject.plus(7)
    }
}
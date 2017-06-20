package Day12

/**
 * Created by Administrator on 2017/6/13.
 */
class C private constructor(a:Int){

    fun MutableList<Int>.swap(index1:Int,index2:Int){
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] =tmp
    }
}
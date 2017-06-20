package Day12

/**
 * Created by Administrator on 2017/6/13.
 */
open class Outer {
    private val a = 1
    protected open val b = 2
    internal val c = 3

    protected class Nested {
        public val e: Int = 5
    }
}
class Subclass:Outer(){
    override val b =5
}
class Unrelated(o:Outer){

}
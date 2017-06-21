package Day14

/**
 * Created by Allen on 2017/6/21.
 */
class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}

val instance =MyClass.create()
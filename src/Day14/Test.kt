package Day14

import java.awt.SystemColor.window
import kotlin.Array
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Created by Allen on 2017/6/21.
 */

fun main(args: Array<String>) {
    printAllValues<RGB>()
    val ab: A = object : A(1), B {
        override val y = 15
    }
    foo()

    val x = C();
    x.bar()

    val b = BaseImpl(10)
    Derived(b).print()
    println()
    val example = Example()
    println(example.p)

    println()
    println(lazyValue)
    println("懒加载之后")
    println(lazyValue)

    val user = User()
    user.name = "first"
    user.name = "second"

    var student = Student(mapOf("name" to "John Doe",
            "age" to 25,
            "length" to "ABC"))

    println(student.name)

    println(student.age)
    println(student)

    println(1 shl 2)

    println(9.shl(2))
}

infix fun Int.sh1(x:Int):Int{
    return (x*Math.random()).toInt()
}

val lazyValue: String by lazy {
    println("computed")
    "lazyValue"
}

fun foo() {
    val adHoc = object {
        var x: Int = 7
        var y: Int = 8
    }

    print(adHoc.x + adHoc.y)
}

class User {
    var name: String by Delegates.observable("<no name>") {
        property, oldValue, newValue ->
        println("$oldValue ->$newValue")
    }
}

class Student(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}
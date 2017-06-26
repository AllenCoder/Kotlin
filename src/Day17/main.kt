package Day17

/**
 * Created by Allen on 2017/6/26.
 */
fun main(args: Array<String>) {
    val person = Person("Allen", 20)

    val (name, age) = person //根据参数顺序，而不是参数名称，最好是名称和参数对应

    println(name)
    println(age)

    val (arg1, arg2) = person

    println("$arg1  +   $arg2")

    val map = mapOf("parms" to "value")

    for ((key, value) in map) {
        println("  $key +  $value")
    }

    for ((arg1, arg2) in map) {
        println("  $arg1 +  $arg2")
    }
//下划线⽤于未使⽤的变量（
    for ((_, value) in map) {
        println("   +  $value")
    }

    println(map.mapValues {

        (_, value) ->
        "$value"
    })



    for (i in 1..4) print(i)
    for (i in 4..1) print(i)
    for (i in 4 downTo 1) print(i)
    for (i in 1..4 step 2) print(i)
    for (i in 4 downTo 1 step 2) print(i)
    for (i in 1 until 10){
        println(i)
    }


}
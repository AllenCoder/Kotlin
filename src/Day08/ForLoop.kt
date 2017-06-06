package Day08

/**
 * Created by Administrator on 2017/6/5.
 */

/*
*
* for 循环
* */
fun main(args: Array<String>) {
    var ints = listOf<Int>(1, 2, 3)
    for (item in ints.indices) {
        print(item)
    }

    println("---------------")
    for ((key,value) in ints.withIndex()){
        println("the element at $key is ${value}")
    }
    var x = 10
    while (x>0){
        x--
        println(x)
    }
    loop@ for (i in 1..100){
        for (j in 1..100){
            if (i*j>9999){
                print("跳出循环")
                break@loop
            }else {
                if (i*j%50==0){
                    println(i*j)
                }
            }
        }
    }
    foo()



}
fun foo(){
    var ints = listOf<Int>(1, 2, 3)
    ints.forEach {
        if (it ==0){
            return
        }

        println(it)
    }
    ints.forEach {
        if (it ==3) return@forEach
        println(it)
    }
    println("匿名函数")
    ints.forEach { fun (value:Int){
        if (value ==0) return
        print(value)
    } }
}
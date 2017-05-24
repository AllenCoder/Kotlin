/*
 *
 *  * Copyright  2017 [AllenCoderr]
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.devcoder.app

/**
 * Created by Administrator on 2017/5/20.
 */
fun sum1(a: Int, b: Int): Int {
    return a + b
}

fun sum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit {
    print("sum of $a and $b is ${a + b}")
}

fun printSum2(a: Int, b: Int) {
    print("sum of $a and $b is ${a + b}")

}

val a: Int = 1;//立即赋值
val b = 2//自动推断出 ’Int 类型

//使用字符串模板
fun StringPattern(): Unit {
    var a = 1
    val s1 = "a is $a"
    a = 2
    val s2 = "${s1.replace("is", "was")} ,but now is $a"

    print("StringPattern $s2")
}

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    }
    return b
}

fun maxof2(a: Int, b: Int) = if (a > b) a else b

fun parseInt(str: String): Int? {
    //
    return Integer.parseInt(str)
}


fun printProduct(a: String, args: String) {

    val x = parseInt(a)
    val y = parseInt(args)
    if (x != null && y != null) {
        println(x * y)
    } else {
        println("either '$a' or '$args' is not a number")
    }
}

fun parseIntNull(str: String): Int {
    //
    return Integer.parseInt(str)
}

fun printProductNull(a: String, args: String) {

    val x = parseIntNull(a)
    val y = parseIntNull(args)
    println(x * y)
}

fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

//使用for循环

fun loop() {
    val items = listOf("Appple", 15, "kiwi")
    for (item in items) {
        println(item)
    }


    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}

fun describle(obj: Any): String =
        when (obj) {
            1 -> "one"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a String"
            else -> {//注意这个
                "Unknow"
            }
        }

fun range() {
    val x = 10
    val y = 9;
    if (x in 1..y + 1) {
        println("fits in range")
    }
}

fun rangeList() {
    val list = listOf("A", "B", "C")
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    println("list.indices is ${list.indices}")
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range into")
    }
    for (x in 1..5) {
        print(x)
    }
    println()
//    数列迭代
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val items = listOf(1, 2, 3)

    for (item in items) {
        println(item)
    }

    when {
        1 in items -> println("juicy")

        2 in items -> println("apple is fine too")
    }
}

data class Customer(val name: String, val email: String)

fun foo(a: Int = 0, b: String = "") {
    var list = listOf<Int>(1, 2, 3)
    var positve = list.filter { x ->
        x > 0;x < 7
    }
    val positives =list.filter { it>0 }

    println("Name ")

    when(positives.last()){
        is Int -> println("is int")
    }
    val  map = mapOf<String,Int>("a" to 1,"b" to 2,"c" to 3)

    for ((k,v) in map){
        println("$k  -> $v")
    }
    println(map["a"])
}
fun main(args: Array<String>) {

    loop()
    StringPattern()
    println("-----------------")
    println("maxof ${maxOf(7, 88)}")

    println("maxof ${maxof2(7, 88)}")

    println("printProduct ${printProduct("78", "32")}")

    println("printProduct ${printProduct("78", "32")}")
    println("printProductNull ${printProductNull("78", "32")}")

    println("getStringLenget ${getStringLength("isisii")}")
    println("getStringLenget ${getStringLength(5888)}")
    range()
    rangeList()
    foo()

}








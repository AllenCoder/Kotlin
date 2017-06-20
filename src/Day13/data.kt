package Day13

/**
 * Created by Administrator on 2017/6/20.
 */
fun copy (name:String ="小明",age:Int =17) =User(name,age)

val jack =User(name = "Jack",age =1)
val oldJack = jack.copy(age = 2)
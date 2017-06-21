package Day14

import java.awt.event.ActionListener

/**
 * Created by Allen on 2017/6/21.
 */
class Outer {
    private val bar: Int = 1;

    inner class Inner {
        fun foo() = bar
    }

    val demo = Outer().Inner().foo()
}
//匿名内部类

val listener = ActionListener { print("click") }

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class ProtocoloState{
    WAITING{
        override fun signal(): ProtocoloState {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return super.toString()
        }
    },
    TALKING{
        override fun signal(): ProtocoloState {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun toString(): String {
            return super.toString()
        }
    };
    inner class InnerClass{

    }

    abstract fun signal():ProtocoloState
}
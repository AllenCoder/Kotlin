package Day14

/**
 * Created by Allen on 2017/6/21.
 */
interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() {
        print("this is BaseImple print")
    }

}


class Derived(b: Base) : Base by b


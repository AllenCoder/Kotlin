package Day09

/**
 * Created by Administrator on 2017/6/6.
 */
class Address {
    var name: String = "小明"
    var street: String = "001"
    var city: String = "信阳"
    var state: String? = "open"
    var zip: String = "rar"
}

fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}
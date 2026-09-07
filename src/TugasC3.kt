fun main() {

    print("Masukkan bilangan: ")
    val bilangan: Int = readln().toInt()

     println(cekGenapGanjil(bilangan))
}
fun cekGenapGanjil(bilangan: Int): String {
    return if (bilangan % 2 == 0) {
        "$bilangan merupakan bilangan Genap"
    } else {
        "$bilangan merupakan bilangan Ganjil"
    }
}


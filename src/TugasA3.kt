fun main(){
    // menerima input  dari user
    print("Masukkkan bilangan desimal:")
    val bilangan: String = readln()
    println()
    // data yang input user masih dalam tipe data string sehingga diubah dengan fungsi ke double
    println("Nilai Double: ${bilangan.toDouble()}")
    println("Nilai Int: ${bilangan.toDouble().toInt()}")
    println("Nilai String: $bilangan")
}
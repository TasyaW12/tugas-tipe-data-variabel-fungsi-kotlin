fun main() {
    // data yang input user masih dalam tipe data string sehingga diubah dengan fungsi ke double
    print("Masukkan suhu Celsius: ")
    val celsius: Double = readln().toDouble()
    // mengubah inputan user menjadi farenheid dan kelvin
    val fahrenheit: Double = (celsius * 9 / 5) + 32
    val kelvin: Double = celsius + 273.15
    //menampilkan hasil
    println("Celsius : $celsius °C ")
    println("Fahrenheit: $fahrenheit °F")
    println("Kelvin: $kelvin K")
}
fun main() {
    //menerima input dari user
    print("Masukkan karakter: ")
    val karakter: Char = readln()[0]
    // menampilkan hasil
    println("Karakter        : $karakter")
    println("Kode karakter   : ${karakter.code}")
    println("Termasuk huruf  : ${karakter.isLetter()}")
    println("Termasuk angka  : ${karakter.isDigit()}")
}
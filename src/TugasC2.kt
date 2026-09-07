fun main(){
    print("Masukkan panjang: ")
    val panjang = readln().toDouble()
    print("Masukkan lebar: ")
    val lebar = readln().toDouble()

    println("Luas ${hitungLuas(panjang, lebar).toInt()}")

}
fun hitungLuas(panjang:Double, lebar:Double):Double{
    println("Panjang : ${panjang.toInt()}")
    println("Lebar : ${lebar.toInt()}")
    val luas = panjang*lebar
    return luas
}

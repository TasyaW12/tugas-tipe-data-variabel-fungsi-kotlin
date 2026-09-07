fun main(){
    val PI : Double = 3.14159
    // data yang input user masih dalam tipe data string sehingga diubah dengan fungsi ke double
    print("Masukkan jari jari :")
    val jariJari : Double = readln().toDouble()
    // menghitung luas dan keliling
    val luas: Double = PI * jariJari * jariJari
    val keliling:Double = 2*PI*jariJari
    //Menampilkan hasil perhitungan
    println("Jari jari: $jariJari")
    println("Luas Lingkaran $luas")
    println("Keliling Lingkaran: $keliling")
}
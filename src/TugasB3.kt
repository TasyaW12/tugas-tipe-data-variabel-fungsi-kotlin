fun main() {
    //menerim inputan user, untuk beberapa variabel dari string diubah ke double atau int
    //untuk proses perhitungan
    print("Masukkan nama barang: ")
    val namaBarang: String = readln()
    print("Masukkan harga barang: ")
    val hargaBarang: Double = readln().toDouble()
    print("Masukkan jumlah barang: ")
    val jumlahBarang: Int = readln().toInt()
    print("Masukkan diskon (%): ")
    val diskon: Double = readln().toDouble()

    // Menghitung subtotal
    val subtotal = hargaBarang * jumlahBarang

    // Menghitung potongan
    val potongan = subtotal * diskon / 100

    // Menghitung total bayar
    val totalBayar = subtotal - potongan
    //menampilkan detail belanja
    println()
    println("DETAIL BELANJA ")
    println("Nama barang : $namaBarang")
    println("Harga       : $hargaBarang")
    println("Jumlah      : $jumlahBarang")
    println("Diskon      : $diskon%")
    println("Subtotal    : $subtotal")
    println("Potongan    : $potongan")
    println("Total bayar : $totalBayar")
}
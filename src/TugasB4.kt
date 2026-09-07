fun main() {
    //menerim inputan user, untuk beberapa variabel dari string diubah ke double
    //untuk proses perhitungan
    print("Masukkan nama pegawai: ")
    val namaPegawai: String = readln()

    print("Masukkan gaji pokok: ")
    val gajiPokok: Double = readln().toDouble()

    print("Masukkan tunjangan: ")
    val tunjangan: Double = readln().toDouble()

    print("Masukkan uang lembur: ")
    val uangLembur: Double = readln().toDouble()

    print("Masukkan potongan: ")
    val potongan: Double = readln().toDouble()
    // proses perhitungan
    val gajiKotor = gajiPokok + tunjangan + uangLembur
    val gajiBersih = gajiKotor - potongan

    //menampilkan hasil
    println()
    println("DATA GAJI PEGAWAI")
    println("Nama pegawai : $namaPegawai")
    println("Gaji pokok   : $gajiPokok")
    println("Tunjangan    : $tunjangan")
    println("Uang lembur  : $uangLembur")
    println("Potongan     : $potongan")
    println("Gaji kotor   : $gajiKotor")
    println("Gaji bersih  : $gajiBersih")
}
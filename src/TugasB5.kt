fun main() {
    //menerim inputan user, untuk beberapa variabel dari string diubah ke double
    //untuk proses perhitungan
    print("Masukkan nama mahasiswa: ")
    val nama: String = readln()

    print("Masukkan nilai tugas: ")
    val tugas: Double = readln().toDouble()

    print("Masukkan nilai kuis: ")
    val kuis: Double = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val uts: Double = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val uas: Double = readln().toDouble()

    // proses perhitungan
    val nilaiAkhir = (tugas * 0.25) +
            (kuis * 0.15) +
            (uts * 0.25) +
            (uas * 0.35)
    //menampilkan hasil
    println()
    println("HASIL NILAI MAHASISWA")
    println("Nama        : $nama")
    println("Nilai tugas : $tugas")
    println("Nilai kuis  : $kuis")
    println("Nilai UTS   : $uts")
    println("Nilai UAS   : $uas")
    println("Nilai akhir : $nilaiAkhir")
}
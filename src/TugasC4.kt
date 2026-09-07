fun main(){
    print("Masukkan nilai Tugas: ")
    val tugas: Double = readln().toDouble()

    print("Masukkan nilai UTS: ")
    val uts: Double = readln().toDouble()

    print("Masukkan nilai UAS: ")
    val uas: Double = readln().toDouble()

    val nilaiAkhir = hitungNilaiAkhir(tugas, uts, uas)
    val grade = tentukanGrade(nilaiAkhir)

    println()
    println("Nilai akhir : $nilaiAkhir")
    println("Grade       : $grade")
}


fun hitungNilaiAkhir(
    tugas: Double,
    uts: Double,
    uas: Double
): Double {
    return (tugas * 0.30) + (uts * 0.30) + (uas * 0.40)
}

fun tentukanGrade(nilai: Double): String {
    return if (nilai >= 80) {
        "A"
    } else if (nilai >= 70) {
        "B"
    } else if (nilai >= 60) {
        "C"
    } else if (nilai >= 50) {
        "D"
    } else {
        "E"
    }
}


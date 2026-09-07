fun main() {

    var ulang = "y"

    while (ulang == "y") {

        print("Masukkan angka pertama: ")
        val a: Double = readln().toDouble()

        print("Masukkan angka kedua: ")
        val b: Double = readln().toDouble()

        println()
        println("Pilih operasi:")
        println("1. Penjumlahan")
        println("2. Pengurangan")
        println("3. Perkalian")
        println("4. Pembagian")

        print("Pilihan: ")
        val pilihan: Int = readln().toInt()

        println()

        if (pilihan == 1) {
            println("Hasil: ${tambah(a, b)}")

        } else if (pilihan == 2) {
            println("Hasil: ${kurang(a, b)}")

        } else if (pilihan == 3) {
            println("Hasil: ${kali(a, b)}")

        } else if (pilihan == 4) {

            if (b == 0.0) {
                println("Error: Tidak dapat melakukan pembagian dengan nol.")
            } else {
                println("Hasil: ${bagi(a, b)}")
            }

        } else {
            println("Pilihan tidak tersedia.")
        }

        println()
        print("Apakah ingin menghitung lagi? (y/n): ")
        ulang = readln().lowercase()

        println()
    }

    println("Program selesai.")
}


fun tambah(a: Double, b: Double): Double {
    return a + b
}

fun kurang(a: Double, b: Double): Double {
    return a - b
}

fun kali(a: Double, b: Double): Double {
    return a * b
}

fun bagi(a: Double, b: Double): Double {
    return a / b
}
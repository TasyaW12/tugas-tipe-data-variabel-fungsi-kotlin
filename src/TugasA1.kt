fun main() {
    // DATA YANG SUDAH DITENTUKAN
    val nama: String = "Tasya"
    val umur: Int = 21
    val tinggiBadan: Double = 158.0
    val mahasiswaAktif: Boolean = true
    val golonganDarah: Char = 'O'

    println("DATA YANG SUDAH DITENTUKAN ")
    println("Nama            : $nama")
    println("Umur            : $umur tahun")
    println("Tinggi badan    : $tinggiBadan cm")
    println("Mahasiswa aktif : $mahasiswaAktif")
    println("Golongan darah  : $golonganDarah")

    println()

    // DATA DARI INPUT PENGGUNA
    print("Masukkan nama: ")
    val namaInput: String = readln()
    // data yang input user masih dalam tipe data string sehingga di ubah dengan fungsi ke integer
    print("Masukkan umur: ")
    val umurInput: Int = readln().toInt()
    // data yang input user masih dalam tipe data string sehingga di ubah dengan fungsi ke double
    print("Masukkan tinggi badan: ")
    val tinggiBadanInput: Double = readln().toDouble()
    // data yang input user masih dalam tipe data string sehingga di ubah dengan fungsi ke boolean
    print("Apakah mahasiswa aktif? (true/false): ")
    val mahasiswaAktifInput: Boolean = readln().toBoolean()
    // data yang input user masih dalam tipe data string sehingga di ubah dengan fungsi ke char
    print("Masukkan golongan darah: ")
    val golonganDarahInput: Char = readln().toCharArray()[0]

    println()

    println("BIODATA DARI INPUT")
    println("Nama            : $namaInput")
    println("Umur            : $umurInput tahun")
    println("Tinggi badan    : $tinggiBadanInput cm")
    println("Mahasiswa aktif : $mahasiswaAktifInput")
    println("Golongan darah  : $golonganDarahInput")
}
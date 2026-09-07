
    fun main() {
        //Mengisi nilai awal
        val nama: String = "Tasya"
        val npm: String = "235314110"
        var semester: Int = 7
        var ipk: Double = 3.86

        println("DATA SEBELUM DIPERBARUI")
        println("Nama     : $nama")
        println("NPM      : $npm")
        println("Semester : $semester")
        println("IPK      : $ipk")

        // Memperbarui semester dan IPK
        semester = 8
        ipk = 3.93

        println()
        println("DATA SETELAH DIPERBARUI")
        println("Nama     : $nama")
        println("NPM      : $npm")
        println("Semester : $semester")
        println("IPK      : $ipk")
    }

fun main(){
    // data yang input user masih dalam tipe data string sehingga diubah dengan fungsi ke integer
    print("Masukkan nilai a :")
    var a : Int = readln().toInt()
    // data yang input user masih dalam tipe data string sehingga diubah dengan fungsi ke integer
    print ("Masukkan nilai b:")
    var b : Int = readln().toInt()

    println("Sebelum ditukar")
    println("A= $a")
    println("B= $b")
    //proses penukaran nilai
    val sementara = a
    a = b
    b = sementara

    println("Setelah ditukar")
    println("A= $a")
    println("B= $b")
}
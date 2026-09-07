fun main() {
    print("Panjang : ")
    val panjang = readln().toDouble()

    print("Lebar   : ")
    val lebar = readln().toDouble()


    val luas = hitungLuas(panjang, lebar)

    println("Luas    : $luas")
}


fun hitungLuas(panjang: Double, lebar: Double): Double {
    return panjang * lebar
}
fun main() {

    val PI = 3.14159

    print("Masukkan jari-jari lingkaran (r): ")
    val r = readln().toDouble()

    val luas = PI * r * r
    val keliling = 2 * PI * r

    println("-----------------------------------")
    println("Luas Lingkaran     : $luas")
    println("Keliling Lingkaran : $keliling")
}
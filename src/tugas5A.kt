fun main () {
    print("Masukan Karakter =")
    val input = readln()

    var char = input[0]

    val kodeAscii = char.code
    val ishuruf = char.isLetter()
    val isAngka = char.isDigit()

    println("karakter = $char")
    println("kode karakter = $kodeAscii")
    println("Termasuk huruf = $ishuruf")
    println("Termasuk angka = $isAngka")
}
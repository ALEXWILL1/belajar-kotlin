fun main() {
    print("Masukkan nama: ")
    val inputNama = readln()

    // Memanggil fungsi
    tampilkanSalam(inputNama)
}

fun tampilkanSalam(nama: String) {
    println("Selamat datang, $nama!")
}
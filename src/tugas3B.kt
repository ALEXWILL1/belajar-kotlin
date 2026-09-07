fun main() {
    print("masukan nama barang =")
    val namaBarang = readLine()!!

    print("Masukan harga barang =")
    val hargaBarang = readln().toDouble()!!

    print("Masukan jumlah barang = ")
    val jumlahBarang = readln().toInt()!!

    print("Masukan Diskon (%) = ")
    val diskonBarang = readln().toDouble()!!

    val subTotal = hargaBarang * jumlahBarang
    val potongan = subTotal * diskonBarang / 100
    val totalBayar = subTotal - potongan

    println("")
    println("nama barang kamu = $namaBarang")
    println("harga barang satuab = $hargaBarang")
    println("jumlah barang  = $jumlahBarang")
    println("subTotal barang = $subTotal")
    println ("diskon ($diskonBarang) = $potongan")
    println("------------------------------------------")
    println("total bayar = $totalBayar")
}
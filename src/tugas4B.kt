fun main() {
    print("Masuk nama pegawai =")
    val namaPegawai = readLine().toString()

    print("Masuk nomor pegawai  =")
    val nomorPegawai = readLine().toString()

    print("Masukan gaji pegawai = ")
    val gajiPegawai = readln(). toDouble()

    print("masukan tunjangan = ")
    val tunjanganPegawai = readln(). toDouble()

    print("masukan uang lembur =")
    val uangLambur = readln(). toDouble()

    print("masukan potongan = ")
    val potongan = readln(). toDouble()

    val gajiKotor = gajiPegawai + tunjanganPegawai + uangLambur
    val gajiBersih = gajiKotor - potongan

    println("\n===Gaji Pegawai === =")
    println("nama Pegawai = $namaPegawai")
    println("nomor Pegawai = $nomorPegawai")
    println("gaji Pegawai = $gajiPegawai")
    println("gaji kotor yang didapatkan = $gajiKotor")
    println("gajiBersih = $gajiBersih")

}
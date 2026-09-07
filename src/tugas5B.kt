fun main() {
    print("Nama Mahasiswa : ")
    val nama = readln()
    print("Nilai Tugas    : ")
    val tugas = readln().toDouble()
    print("Nilai Kuis     : ")
    val kuis = readln().toDouble()
    print("Nilai UTS      : ")
    val uts = readln().toDouble()
    print("Nilai UAS      : ")
    val uas = readln().toDouble()

    val nilaiAkhir = (tugas * 0.25) + (kuis * 0.15) + (uts * 0.25) + (uas * 0.35)

    println("\nNama Mahasiswa : $nama")
    println("Nilai Akhir    : $nilaiAkhir")
}
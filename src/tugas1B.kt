fun main() {
    print("Masukkan Nama     : ")
    val nama = readln()
    print("Masukkan NPM      : ")
    val npm = readln()
    print("Masukkan Semester : ")
    var semester = readln().toInt()
    print("Masukkan IPK      : ")
    var ipk = readln().toDouble()

    println("\n=== DATA MAHASISWA (AWAL) ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")

    println("\n--- Update Data ---")
    print("Masukkan Semester Baru : ")
    semester = readln().toInt()

    print("Masukkan IPK Baru      : ")
    ipk = readln().toDouble()


    println("\n=== DATA MAHASISWA (SETELAH DIPERBARUI) ===")
    println("Nama     : $nama")
    println("NPM      : $npm")
    println("Semester : $semester")
    println("IPK      : $ipk")
}
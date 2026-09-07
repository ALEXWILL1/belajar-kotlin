

fun main() {

    print("masukan nilai suhu celcius =")
    val celcius: Double = readln().toDouble()

    val fahreinheit: Double =  (celcius * 9 /5) + 32
    val kelvin: Double = celcius + 275.15

    println("fahreinheit = $fahreinheit")
    println("kelvin = $kelvin")

}
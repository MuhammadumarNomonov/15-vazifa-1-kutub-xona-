import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val kutubxona = Kutubxona()

    while (true) {
        println(" 1 - O'quvchi qo'shish: , 2 - O'quvchilarni ko'rish: , 3 - Kitob qo'shish: , 4 - Kitoblarni ko'rish")

        when (scanner.nextInt()) {
            1 -> {
                println("O'quvchi ismini kiriting: ")
                val ism = scanner.next()
                println("O'quvchi ID sini kiriting: ")
                val id = scanner.nextInt()
                kutubxona.oquvchiQoshish(Oquvchi(ism, id))
                println("O'quvchi qo'shildi.")
            }
            2 -> {
                println("Barcha o'quvchilar: ${kutubxona.barchaOquvchilar()}")
            }
            3 -> {
                println("Kitob nomini kiriting: ")
                val nomi = scanner.next()
                println("Kitob toifasini kiriting: ")
                val toifa = scanner.next()
                kutubxona.kitobQoshish(Kitob(nomi, toifa))
                println("Kitob qo'shildi.")
            }
            4 -> {
                println("Barcha kitoblar: ${kutubxona.barchaKitoblar()}")
            }
            else -> {
                println("Noto'g'ri tanlov. Iltimos, qaytadan urinib ko'ring.")
            }
        }
    }
}

data class Kitob(val nomi: String, val toifa: String)
data class Oquvchi(val ism: String, val id: Int)

class Kutubxona {
    val kitoblar = ArrayList<Kitob>()
    val oquvchilar = ArrayList<Oquvchi>()

    fun kitobQoshish(kitob: Kitob) {
        kitoblar.add(kitob)
    }

    fun oquvchiQoshish(oquvchi: Oquvchi) {
        oquvchilar.add(oquvchi)
    }

    fun barchaKitoblar(): List<Kitob> {
        return kitoblar
    }

    fun barchaOquvchilar(): List<Oquvchi> {
        return oquvchilar
    }
} // 15 mavzu 1 vazifa


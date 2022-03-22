package Prak02

class PEKERJAAN {
    var nama: String = " "
    var gaji: String = " "
    var durasikerja: String = " "
    var tempatkerja: String = " "

    fun spesifikasi(){
        println("$nama")
        println("Gaji dari pekerjaan ini adalah $gaji, lalu anda akan bekerja selama $durasikerja jam" +
                " Kemudian anda akan bekerja di $tempatkerja")
    }
}
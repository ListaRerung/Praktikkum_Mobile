package Prak02

import Prak02.PEKERJAAN

fun main(){
    val polisi = PEKERJAAN()
    polisi.nama = "Polisi"
    polisi.gaji = "4 juta"
    polisi.durasikerja = "6"
    polisi.tempatkerja = "kantor polisi"

    polisi.spesifikasi();
}
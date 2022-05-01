package com.example.modul4.ui.hewanudara

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R

class HewanudaraViewModel : ViewModel() {
    var udaraMutableLiveData:MutableLiveData<ArrayList<HewanUdara>?> = MutableLiveData()
    var udaraArrayList: ArrayList<HewanUdara>? = null

    fun init(){
        udaralist()
        udaraMutableLiveData.value = udaraArrayList
    }
    fun udaralist(){
        var hudara = HewanUdara(R.string.udara1,R.drawable.bangau)
        udaraArrayList = ArrayList()
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara2,R.drawable.burung_beo)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara3,R.drawable.burung_kolibri)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara4,R.drawable.burung_kutilang)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara5,R.drawable.cendrawasih)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara6,R.drawable.elangjawa)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara7,R.drawable.kelelawar)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara8,R.drawable.lalat)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara9,R.drawable.lebah)
        udaraArrayList!!.add(hudara)
        hudara = HewanUdara(R.string.udara10,R.drawable.singapuar)
        udaraArrayList!!.add(hudara)
    }
    init {
        init()
    }
    fun udaradata(hewanUdara: HewanUdara,context: HewanudaraFragment){
        udaraArrayList
    }

}
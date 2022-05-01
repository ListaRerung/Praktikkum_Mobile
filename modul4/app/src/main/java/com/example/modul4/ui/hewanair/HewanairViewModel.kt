package com.example.modul4.ui.hewanair

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R
import com.example.modul4.model.HewanAir

class HewanairViewModel : ViewModel() {
    var airMutableLiveData: MutableLiveData<ArrayList<HewanAir>?> = MutableLiveData()
    var airArrayList: ArrayList<HewanAir>? = null

    fun init(){
        airlist()
        airMutableLiveData.value = airArrayList
    }

    fun airlist(){
        //hair = hewan air
        var hair = HewanAir(R.string.air1,R.drawable.belut)
        airArrayList = ArrayList()
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air2,R.drawable.hiu)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air3,R.drawable.ikanpari)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air4,R.drawable.kraken)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air5,R.drawable.krustasea)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air6,R.drawable.kudalaut)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air7,R.drawable.lumba_lumba)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air8,R.drawable.paus)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air9,R.drawable.salmon)
        airArrayList!!.add(hair)
        hair = HewanAir(R.string.air10,R.drawable.ubur_ubur)
        airArrayList!!.add(hair)
    }
    init {
        init()
    }
    fun airdata(hewanair: HewanAir,context: Context){
        airArrayList
    }

}
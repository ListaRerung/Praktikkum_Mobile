package com.example.modul4.ui.hewandarat

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.modul4.R
import com.example.modul4.model.HewanDarat

class HewanDaratViewModel : ViewModel() {
    var daratMutableLiveData: MutableLiveData<ArrayList<HewanDarat>?> = MutableLiveData()
    var daratArrayList: ArrayList<HewanDarat>? = null

    fun init(){
        daratlist()
        daratMutableLiveData.value = daratArrayList
    }

    fun daratlist(){
        var hdarat = HewanDarat(R.string.darat1,R.drawable.badakjawa)
        daratArrayList = ArrayList()
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat2,R.drawable.beruangkutub)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat3,R.drawable.gajah)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat4,R.drawable.harimausumatra)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat5,R.drawable.jerapah)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat6,R.drawable.maleo)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat7,R.drawable.merak)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat8,R.drawable.mose)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat9,R.drawable.musangcongok)
        daratArrayList!!.add(hdarat)
        hdarat = HewanDarat(R.string.darat10,R.drawable.singa)
        daratArrayList!!.add(hdarat)
    }
    init {
        init()
    }

}

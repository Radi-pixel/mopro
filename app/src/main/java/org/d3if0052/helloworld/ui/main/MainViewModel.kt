package org.d3if0052.helloworld.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import org.d3if0052.helloworld.Hewan
import org.d3if0052.helloworld.R

class MainViewModel {
    private val data = MutableLiveData<List<Hewan>>()
    init {
        data.value = initData()
    }

    private fun initData(): List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek),
            Hewan("Domba", "Ovis ammon", R.drawable.domba),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi),
        )
    }
    fun getData(): LiveData<List<Hewan>> = data
}



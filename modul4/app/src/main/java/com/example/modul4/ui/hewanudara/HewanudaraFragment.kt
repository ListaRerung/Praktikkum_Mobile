package com.example.modul4.ui.hewanudara

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.modul4.R
import com.example.modul4.databinding.FragmentHewanudaraBinding


class HewanudaraFragment : Fragment(R.layout.fragment_hewanudara){
    private lateinit var recyclerView: RecyclerView
    private lateinit var newarrayudara: ArrayList<HewanUdara>
    var recyclerViewudaraadapter: HewanudaraAdapter? = null
    private var _binding: FragmentHewanudaraBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val hewanudaraViewModel =
            ViewModelProvider(this).get(HewanudaraViewModel::class.java)
        hewanudaraViewModel?.udaraMutableLiveData.observe(viewLifecycleOwner,udaraListUpdateObserver)
        _binding = FragmentHewanudaraBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewUdara

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var udaraListUpdateObserver : Observer<ArrayList<HewanUdara>?> =
        Observer<ArrayList<HewanUdara>?> { udaraArrayList ->
            recyclerViewudaraadapter = HewanudaraAdapter(requireContext(),udaraArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(context)
            recyclerView!!.adapter = recyclerViewudaraadapter
        }
}
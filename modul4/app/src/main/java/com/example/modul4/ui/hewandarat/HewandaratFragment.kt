package com.example.modul4.ui.hewandarat

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
import com.example.modul4.adapter.HewandaratAdapter
import com.example.modul4.model.HewanDarat
import com.example.modul4.databinding.FragmentHewandaratBinding

class HewandaratFragment : Fragment(R.layout.`fragment_jobdarat.xml`) {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentHewandaratBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    var recyclerViewdaratAdapter: HewandaratAdapter? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val hewanudaraViewModel =
            ViewModelProvider(this).get(HewanDaratViewModel::class.java)
        hewanudaraViewModel?.daratMutableLiveData.observe(viewLifecycleOwner,daratListUpdateObserver)
        _binding = FragmentHewandaratBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewDarat
        return root

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var daratListUpdateObserver : Observer<ArrayList<HewanDarat>?> =
        Observer<ArrayList<HewanDarat>?>{ daratArrayList ->
            recyclerViewdaratAdapter = HewandaratAdapter(requireContext(),daratArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(context)
            recyclerView!!.adapter = recyclerViewdaratAdapter
        }
}
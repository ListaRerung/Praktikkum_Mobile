package com.example.modul4.ui.hewanair

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
import com.example.modul4.adapter.HewanairAdapter
import com.example.modul4.databinding.FragmentHewanairBinding
import com.example.modul4.model.HewanAir


class HewanairFragment : Fragment(R.layout.`fragment_jobsains.xml`) {
    private lateinit var recyclerView: RecyclerView
    private var _binding: FragmentHewanairBinding? = null
    var recyclerViewairadapter :HewanairAdapter? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val hewanudaraViewModel =
            ViewModelProvider(this).get(HewanairViewModel::class.java)
        hewanudaraViewModel?.airMutableLiveData.observe(viewLifecycleOwner,airListUpdateObserver)
        _binding = FragmentHewanairBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = _binding!!.recylerViewAir
        recyclerView.setHasFixedSize(true)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    var airListUpdateObserver : Observer<ArrayList<HewanAir>?> =
        Observer<ArrayList<HewanAir>?> { airArrayList ->
            recyclerViewairadapter = HewanairAdapter(requireContext(),airArrayList)
            recyclerView!!.layoutManager = LinearLayoutManager(getContext())
            recyclerView!!.adapter = recyclerViewairadapter
        }
}
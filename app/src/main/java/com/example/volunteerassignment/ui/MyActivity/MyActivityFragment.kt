package com.example.volunteerassignment.ui.MyActivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.volunteerassignment.R

class MyActivityFragment : Fragment() {

    private lateinit var myActivityViewModel: MyActivityViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myActivityViewModel =
            ViewModelProviders.of(this).get(myActivityViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_pointandredeem, container, false)
        val textView: TextView = root.findViewById(R.id.text_send)
        myActivityViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
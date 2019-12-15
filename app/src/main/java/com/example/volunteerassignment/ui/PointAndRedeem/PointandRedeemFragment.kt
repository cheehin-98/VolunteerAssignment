package com.example.volunteerassignment.ui.PointAndRedeem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.volunteerassignment.R

class PointandRedeemFragment : Fragment() {

    private lateinit var PointAndRedeemViewModel: PointandRedeemViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        PointAndRedeemViewModel =
            ViewModelProviders.of(this).get(PointandRedeemViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_share, container, false)
        val textView: TextView = root.findViewById(R.id.text_share)
        PointAndRedeemViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
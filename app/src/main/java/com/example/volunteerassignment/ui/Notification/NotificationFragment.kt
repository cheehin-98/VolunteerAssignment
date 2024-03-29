package com.example.volunteerassignment.ui.Notification

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.volunteerassignment.R

class NotificationFragment : Fragment() {

    private lateinit var notificationViewModel: NotificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationViewModel =
            ViewModelProviders.of(this).get(NotificationViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notification, container, false)
        val textView: TextView = root.findViewById(R.id.text_gallery)
        notificationViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}
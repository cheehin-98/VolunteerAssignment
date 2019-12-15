package com.example.volunteerassignment.ui.Model

import android.graphics.ColorSpace
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.viewpager.widget.ViewPager
import com.example.volunteerassignment.R
import com.example.volunteerassignment.ui.Adapter.SlidePagerAdapter
import com.example.volunteerassignment.ui.Model.Slide

class MainActivity : AppCompatActivity(){
    var listSlides:MutableList<Slide> = ArrayList()
    var sliderPage: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sliderPage = this.findViewById(R.id.view_pager_glide)
        listSlides.add(Slide(R.drawable.blooddonationevent, "Blood Donation Event"))
        listSlides.add(Slide(R.drawable.blooddonationevent, "Financial Master Event"))
        listSlides.add(Slide(R.drawable.blooddonationevent, "Organ Donation Event"))
        listSlides.add(Slide(R.drawable.blooddonationevent, "Build your confidence Event"))

        var adapter :SlidePagerAdapter = SlidePagerAdapter(this,listSlides)
        sliderPage!!.adapter = adapter
    }
}




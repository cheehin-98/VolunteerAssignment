package com.example.volunteerassignment.ui.Adapter

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.volunteerassignment.R
import com.example.volunteerassignment.ui.Model.Slide

class SlidePagerAdapter :PagerAdapter{

    var mContext: Context? = null
    var mList:List<Slide>? = null

    constructor(context:Context,list:List<Slide>)
    {
        mContext = context
        mList = list
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        return super.instantiateItem(container, position)
        var inflater:LayoutInflater = mContext!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        var slideLayout:View =inflater.inflate(R.layout.slide_event, null)

        var slideImage:ImageView = slideLayout.findViewById(R.id.slide_image)
        var slideText: TextView = slideLayout.findViewById(R.id.slide_title)
        slideImage.setImageResource(mList!!.get(position).image)
        slideText.setText(mList!!.get(position).title)
        container.addView(slideLayout)
        return slideLayout

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return mList!!.count()
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
        container.removeView(`object` as View)
    }
}

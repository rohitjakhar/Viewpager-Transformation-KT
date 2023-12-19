package com.jakhar.rohit.viewpagertransformation.Fragments

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.jakhar.rohit.viewpagertransformation.R
import com.squareup.picasso.Picasso
import android.view.LayoutInflater

class FifthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val five = view.findViewById<View>(R.id.fragmentFiveBackground) as ImageView
        Picasso.get().load(R.drawable.five).fit().centerCrop().into(five)
    }
}
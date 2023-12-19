package com.jakhar.rohit.viewpagertransformation.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.jakhar.rohit.viewpagertransformation.R
import com.squareup.picasso.Picasso

class EighthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_eighth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val eight = view.findViewById<View>(R.id.fragmentEightBackground) as ImageView
        Picasso.get().load(R.drawable.eight).fit().centerCrop().into(eight)
    }
}
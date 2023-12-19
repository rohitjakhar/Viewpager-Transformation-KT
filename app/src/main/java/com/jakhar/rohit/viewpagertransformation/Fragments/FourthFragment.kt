package com.jakhar.rohit.viewpagertransformation.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.jakhar.rohit.viewpagertransformation.R
import com.squareup.picasso.Picasso
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FourthFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fourth, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val four = view.findViewById<View>(R.id.fragmentFourBackground) as ImageView
        Picasso.get().load(R.drawable.four).fit().centerCrop().into(four)
    }
}
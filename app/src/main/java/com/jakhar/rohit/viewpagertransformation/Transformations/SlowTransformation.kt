package com.jakhar.rohit.viewpagertransformation.Transformations

import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import androidx.viewpager2.widget.ViewPager2
import com.jakhar.rohit.viewpagertransformation.R

class SlowTransformation : ViewPager2.PageTransformer {
    var number: TextView? = null
    var word: TextView? = null
    var code: TextView? = null
    var github: ImageButton? = null
    override fun transformPage(page: View, position: Float) {
        number = page.findViewById<View>(R.id.numberTextView) as TextView
        word = page.findViewById<View>(R.id.wordTextView) as TextView
        code = page.findViewById<View>(R.id.codeTextView) as TextView
        github = page.findViewById<View>(R.id.githubImageButton) as ImageButton
        if (position < -1) { // [-Infinity,-1)
            // This page is way off-screen to the left.
            page.alpha = 0f
        } else if (position <= 1) { // [-1,1]
            number!!.translationX = -position * 0.5f * page.width
            word!!.translationX = -position * 1.0f * page.width
            github!!.translationX = -position * 2.0f * page.width
            code!!.translationX = -position * 2.5f * page.width
            //            // The 0.5, 1.0, 2.0, 2.5 values you see here are what makes the view move in a different speed.
//            // The bigger the number, the faster the view will translate.
//            // The result float is preceded by a minus because the views travel in the opposite direction of the movement.
        } else { // (1,+Infinity]
            // This page is way off-screen to the right.
            page.alpha = 0f
        }
    }
}
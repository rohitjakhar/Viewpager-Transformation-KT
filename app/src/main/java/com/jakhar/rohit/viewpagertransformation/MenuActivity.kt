package com.jakhar.rohit.viewpagertransformation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jakhar.rohit.viewpagertransformation.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)
        floatingAction()
        handleClicks()
    }

    private fun floatingAction() {
        binding.fab.setOnClickListener {
            val url = "https://github.com/rohitjakhar/Viewpager-Transformation-KT"
            val intentGithub = Intent(Intent.ACTION_VIEW)
            intentGithub.setData(Uri.parse(url))
            startActivity(intentGithub)
        }
    }

    private fun handleClicks() = with(binding) {
        binding.slowTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.SLOW_TRANSFORMATION)
            startActivity(intent)
        }
        circularViewpagerTransformation.setOnClickListener {
            startActivity(
                Intent(
                    this@MenuActivity, CircularViewPager::class.java
                )
            )
        }
        simpleTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.SIMPLE_TRANSFORMATION)
            startActivity(intent)
        }

        depthTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.DEPTH_TRANSFORMATION)
            startActivity(intent)
        }

        zoomOutTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.ZOOM_OUT_TRANSFORMATION)
            startActivity(intent)
        }

        clockSpinTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CLOCK_SPIN_TRANSFORMATION)
            startActivity(intent)
        }

        antiClockSpinTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.ANTICLOCK_SPIN_TRANSFORMATION)
            startActivity(intent)
        }

        fidgetSpinTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.FIDGET_SPINNER_TRANSFORMATION)
            startActivity(intent)
        }

        verticalFlipTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.VERTICAL_FLIP_TRANSFORMATION)
            startActivity(intent)
        }

        horizontalFlipTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.HORIZONTAL_FLIP_TRANSFORMATION)
            startActivity(intent)
        }

        popTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.POP_TRANSFORMATION)
            startActivity(intent)
        }

        fadeOutTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.FADE_OUT_TRANSFORMATION)
            startActivity(intent)
        }

        cubeOutTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_TRANSFORMATION)
            startActivity(intent)
        }

        cubeInTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_TRANSFORMATION)
            startActivity(intent)
        }

        cubeOutScalingTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_SCALING_TRANSFORMATION)
            startActivity(intent)
        }

        cubeInScalingTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_SCALING_TRANSFORMATION)
            startActivity(intent)
        }

        cubeOutDepthTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_DEPTH_TRANSFORMATION)
            startActivity(intent)
        }

        cubeInDepthTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_DEPTH_TRANSFORMATION)
            startActivity(intent)
        }

        hingeTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.HINGE_TRANSFORMATION)
            startActivity(intent)
        }

        gateTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.GATE_TRANSFORMATION)
            startActivity(intent)
        }

        tossTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.TOSS_TRANSFORMATION)
            startActivity(intent)
        }

        fanTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.FAN_TRANSFORMATION)
            startActivity(intent)
        }

        spinnerTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.SPINNER_TRANSFORMATION)
            startActivity(intent)
        }

        verticalShutTransformation.setOnClickListener {
            val startIntent = Intent(this@MenuActivity, TransformationActivity::class.java)
            startIntent .putExtra(Constant.TRANSFORMATION, Constant.VERTICAL_SHUT_TRANSFORMATION)
            startActivity(intent)
        }
    }
}

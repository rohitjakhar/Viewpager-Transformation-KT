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
        slowTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.SLOW_TRANSFORMATION
                )
            )
        }
        circularViewpagerTransformation.setOnClickListener {
            startActivity(
                Intent(
                    this@MenuActivity, CircularViewPager::class.java
                )
            )
        }
        simpleTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.SIMPLE_TRANSFORMATION
                )
            )
        }

        depthTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.DEPTH_TRANSFORMATION
                )
            )
        }

        zoomOutTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.ZOOM_OUT_TRANSFORMATION
                )
            )
        }

        clockSpinTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CLOCK_SPIN_TRANSFORMATION
                )
            )
        }

        antiClockSpinTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.ANTICLOCK_SPIN_TRANSFORMATION
                )
            )
        }

        fidgetSpinTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.FIDGET_SPINNER_TRANSFORMATION
                )
            )
        }

        verticalFlipTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.VERTICAL_FLIP_TRANSFORMATION
                )
            )
        }

        horizontalFlipTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.HORIZONTAL_FLIP_TRANSFORMATION
                )
            )
        }

        popTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.POP_TRANSFORMATION
                )
            )
        }

        fadeOutTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.FADE_OUT_TRANSFORMATION
                )
            )
        }

        cubeOutTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_OUT_TRANSFORMATION
                )
            )
        }

        cubeInTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_IN_TRANSFORMATION
                )
            )
        }

        cubeOutScalingTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_OUT_SCALING_TRANSFORMATION
                )
            )
        }

        cubeInScalingTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_IN_SCALING_TRANSFORMATION
                )
            )
        }

        cubeOutDepthTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_OUT_DEPTH_TRANSFORMATION
                )
            )
        }

        cubeInDepthTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.CUBE_IN_DEPTH_TRANSFORMATION
                )
            )
        }

        hingeTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.HINGE_TRANSFORMATION
                )
            )
        }

        gateTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.GATE_TRANSFORMATION
                )
            )
        }

        tossTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.TOSS_TRANSFORMATION
                )
            )
        }

        fanTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.FAN_TRANSFORMATION
                )
            )
        }

        spinnerTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.SPINNER_TRANSFORMATION
                )
            )
        }

        verticalShutTransformation.setOnClickListener {
            startActivity(
                TransformationActivity.getIntent(
                    this@MenuActivity,
                    Constant.VERTICAL_SHUT_TRANSFORMATION
                )
            )
        }
    }
}

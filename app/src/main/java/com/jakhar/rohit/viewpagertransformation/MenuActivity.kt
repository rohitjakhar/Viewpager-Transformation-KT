package com.jakhar.rohit.viewpagertransformation

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MenuActivity : AppCompatActivity(), View.OnClickListener {
    var simple: Button? = null
    var depth: Button? = null
    var zoomOut: Button? = null
    var clock_Spin: Button? = null
    var antiClock_Spin: Button? = null
    var fidgetSpinner: Button? = null
    var vertical_Flip: Button? = null
    var horizontal_Flip: Button? = null
    var pop: Button? = null
    var fadeOut: Button? = null
    var cubeOut: Button? = null
    var cubeIn: Button? = null
    var cubeOutScale: Button? = null
    var cubeInScale: Button? = null
    var cubeOutDepth: Button? = null
    var cubeInDepth: Button? = null
    var hinge: Button? = null
    var gate: Button? = null
    var toss: Button? = null
    var fan: Button? = null
    var spinner: Button? = null
    var vertical_Shut: Button? = null
    var slow: Button? = null
    var circular: Button? = null
    var floatingActionButton: FloatingActionButton? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        floatingActionButton = findViewById(R.id.fab) as FloatingActionButton?
        floatingActionButton?.setOnClickListener {
            val url = "https://github.com/dipanshukr/ViewPagerTransformations"
            val intentGithub = Intent(Intent.ACTION_VIEW)
            intentGithub.setData(Uri.parse(url))
            startActivity(intentGithub)
        }

        //method where we initialise buttons
        intialiseButtons()

        //method where listner is attached to ezch buttons
        attachListner()
    }

    private fun intialiseButtons() {
        slow = findViewById(R.id.slowTransformation) as Button?
        circular = findViewById(R.id.circularViewpagerTransformation) as Button?
        simple = findViewById(R.id.simpleTransformation) as Button?
        depth = findViewById(R.id.depthTransformation) as Button?
        zoomOut = findViewById(R.id.zoomOutTransformation) as Button?
        clock_Spin = findViewById(R.id.clockSpinTransformation) as Button?
        antiClock_Spin = findViewById(R.id.antiClockSpinTransformation) as Button?
        fidgetSpinner = findViewById(R.id.fidgetSpinTransformation) as Button?
        vertical_Flip = findViewById(R.id.verticalFlipTransformation) as Button?
        horizontal_Flip = findViewById(R.id.horizontalFlipTransformation) as Button?
        pop = findViewById(R.id.popTransformation) as Button?
        fadeOut = findViewById(R.id.fadeOutTransformation) as Button?
        cubeOut = findViewById(R.id.cubeOutTransformation) as Button?
        cubeIn = findViewById(R.id.cubeInTransformation) as Button?
        cubeOutScale = findViewById(R.id.cubeOutScalingTransformation) as Button?
        cubeInScale = findViewById(R.id.cubeInScalingTransformation) as Button?
        cubeOutDepth = findViewById(R.id.cubeOutDepthTransformation) as Button?
        cubeInDepth = findViewById(R.id.cubeInDepthTransformation) as Button?
        hinge = findViewById(R.id.hingeTransformation) as Button?
        gate = findViewById(R.id.gateTransformation) as Button?
        toss = findViewById(R.id.tossTransformation) as Button?
        fan = findViewById(R.id.fanTransformation) as Button?
        spinner = findViewById(R.id.spinnerTransformation) as Button?
        vertical_Shut = findViewById(R.id.verticalShutTransformation) as Button?
    }

    private fun attachListner() {
        slow!!.setOnClickListener(this)
        circular!!.setOnClickListener(this)
        simple!!.setOnClickListener(this)
        depth!!.setOnClickListener(this)
        zoomOut!!.setOnClickListener(this)
        clock_Spin!!.setOnClickListener(this)
        antiClock_Spin!!.setOnClickListener(this)
        fidgetSpinner!!.setOnClickListener(this)
        vertical_Flip!!.setOnClickListener(this)
        horizontal_Flip!!.setOnClickListener(this)
        pop!!.setOnClickListener(this)
        fadeOut!!.setOnClickListener(this)
        cubeOut!!.setOnClickListener(this)
        cubeIn!!.setOnClickListener(this)
        cubeOutScale!!.setOnClickListener(this)
        cubeInScale!!.setOnClickListener(this)
        cubeOutDepth!!.setOnClickListener(this)
        cubeInDepth!!.setOnClickListener(this)
        hinge!!.setOnClickListener(this)
        gate!!.setOnClickListener(this)
        toss!!.setOnClickListener(this)
        fan!!.setOnClickListener(this)
        spinner!!.setOnClickListener(this)
        vertical_Shut!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.slowTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.SLOW_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.circularViewpagerTransformation -> startActivity(
                Intent(
                    this@MenuActivity,
                    CircularViewPager::class.java
                )
            )

            R.id.simpleTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.SIMPLE_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.depthTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.DEPTH_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.zoomOutTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.ZOOM_OUT_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.clockSpinTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CLOCK_SPIN_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.antiClockSpinTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.ANTICLOCK_SPIN_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.fidgetSpinTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.FIDGET_SPINNER_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.verticalFlipTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.VERTICAL_FLIP_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.horizontalFlipTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.HORIZONTAL_FLIP_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.popTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.POP_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.fadeOutTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.FADE_OUT_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeOutTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeInTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeOutScalingTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_SCALING_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeInScalingTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_SCALING_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeOutDepthTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_OUT_DEPTH_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.cubeInDepthTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.CUBE_IN_DEPTH_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.hingeTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.HINGE_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.gateTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.GATE_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.tossTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.TOSS_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.fanTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.FAN_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.spinnerTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.SPINNER_TRANSFORMATION)
                startActivity(intent)
            }

            R.id.verticalShutTransformation -> {
                intent = Intent(this@MenuActivity, TransformationActivity::class.java)
                intent!!.putExtra(Constant.TRANSFORMATION, Constant.VERTICAL_SHUT_TRANSFORMATION)
                startActivity(intent)
            }
        }
    }
}

package com.jakhar.rohit.viewpagertransformation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.jakhar.rohit.viewpagertransformation.Fragments.EighthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FifthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FirstFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.FourthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.NinthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SecondFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SeventhFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.SixthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.TenthFragment
import com.jakhar.rohit.viewpagertransformation.Fragments.ThirdFragment
import com.jakhar.rohit.viewpagertransformation.Transformations.AntiClockSpinTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.Clock_SpinTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeInDepthTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeInRotationTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeInScalingTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeOutDepthTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeOutRotationTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.CubeOutScalingTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.DepthTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.FadeOutTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.FanTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.FidgetSpinTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.GateTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.HingeTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.HorizontalFlipTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.PopTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.SimpleTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.SlowTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.SpinnerTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.TossTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.VerticalFlipTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.VerticalShutTransformation
import com.jakhar.rohit.viewpagertransformation.Transformations.ZoomOutTransformation

class TransformationActivity : AppCompatActivity() {
    lateinit var viewPager: ViewPager2
    var pagerAdapter: MyPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformation)
        viewPager = findViewById<ViewPager2>(R.id.viewPager)
        pagerAdapter = MyPagerAdapter(supportFragmentManager, this.lifecycle)
        addingFragmentsTOpagerAdapter()
        viewPager.adapter = pagerAdapter
        val slowTransformation = SlowTransformation()
        val simpleTransformation = SimpleTransformation()
        val depthTransformation = DepthTransformation()
        val zoomOutTransformation = ZoomOutTransformation()
        val clockSpinTransformation = Clock_SpinTransformation()
        val antiClockSpinTransformation = AntiClockSpinTransformation()
        val fidgetSpinTransformation = FidgetSpinTransformation()
        val verticalFlipTransformation = VerticalFlipTransformation()
        val horizontalFlipTransformation = HorizontalFlipTransformation()
        val popTransformation = PopTransformation()
        val fadeOutTransformation = FadeOutTransformation()
        val cubeOutRotationTransformation = CubeOutRotationTransformation()
        val cubeInRotationTransformation = CubeInRotationTransformation()
        val cubeOutScalingTransformation = CubeOutScalingTransformation()
        val cubeInScalingTransformation = CubeInScalingTransformation()
        val cubeOutDepthTransformation = CubeOutDepthTransformation()
        val cubeInDepthTransformation = CubeInDepthTransformation()
        val hingeTransformation = HingeTransformation()
        val gateTransformation = GateTransformation()
        val tossTransformation = TossTransformation()
        val fanTransformation = FanTransformation()
        val spinnerTransformation = SpinnerTransformation()
        val verticalShutTransformation = VerticalShutTransformation()
        val transformation = getIntent().getStringExtra(Constant.TRANSFORMATION)
        when (transformation) {
            Constant.SLOW_TRANSFORMATION -> viewPager.setPageTransformer(slowTransformation)
            Constant.SIMPLE_TRANSFORMATION -> viewPager.setPageTransformer(simpleTransformation)

            Constant.DEPTH_TRANSFORMATION -> viewPager.setPageTransformer(depthTransformation)
            Constant.ZOOM_OUT_TRANSFORMATION -> viewPager.setPageTransformer(zoomOutTransformation
            )

            Constant.CLOCK_SPIN_TRANSFORMATION -> viewPager.setPageTransformer(
                clockSpinTransformation
            )

            Constant.ANTICLOCK_SPIN_TRANSFORMATION -> viewPager.setPageTransformer(
                antiClockSpinTransformation
            )

            Constant.FIDGET_SPINNER_TRANSFORMATION -> viewPager.setPageTransformer(
                fidgetSpinTransformation
            )

            Constant.VERTICAL_FLIP_TRANSFORMATION -> viewPager.setPageTransformer(
                verticalFlipTransformation
            )

            Constant.HORIZONTAL_FLIP_TRANSFORMATION -> viewPager.setPageTransformer(
               horizontalFlipTransformation
            )

            Constant.POP_TRANSFORMATION -> viewPager.setPageTransformer(popTransformation)
            Constant.FADE_OUT_TRANSFORMATION -> viewPager.setPageTransformer(
                fadeOutTransformation
            )

            Constant.CUBE_OUT_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeOutRotationTransformation
            )

            Constant.CUBE_IN_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeInRotationTransformation
            )

            Constant.CUBE_OUT_SCALING_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeOutScalingTransformation
            )

            Constant.CUBE_IN_SCALING_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeInScalingTransformation
            )

            Constant.CUBE_OUT_DEPTH_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeOutDepthTransformation
            )

            Constant.CUBE_IN_DEPTH_TRANSFORMATION -> viewPager.setPageTransformer(
                cubeInDepthTransformation
            )

            Constant.HINGE_TRANSFORMATION -> viewPager.setPageTransformer(hingeTransformation)
            Constant.GATE_TRANSFORMATION -> viewPager.setPageTransformer(gateTransformation)
            Constant.TOSS_TRANSFORMATION -> viewPager.setPageTransformer(tossTransformation)
            Constant.FAN_TRANSFORMATION -> viewPager.setPageTransformer(fanTransformation)
            Constant.SPINNER_TRANSFORMATION -> viewPager.setPageTransformer(
                spinnerTransformation
            )

            Constant.VERTICAL_SHUT_TRANSFORMATION -> viewPager.setPageTransformer(verticalShutTransformation)
        }
    }

    private fun addingFragmentsTOpagerAdapter() {
        pagerAdapter!!.addFragments(FirstFragment())
        pagerAdapter!!.addFragments(SecondFragment())
        pagerAdapter!!.addFragments(ThirdFragment())
        pagerAdapter!!.addFragments(FourthFragment())
        pagerAdapter!!.addFragments(FifthFragment())
        pagerAdapter!!.addFragments(SixthFragment())
        pagerAdapter!!.addFragments(SeventhFragment())
        pagerAdapter!!.addFragments(EighthFragment())
        pagerAdapter!!.addFragments(NinthFragment())
        pagerAdapter!!.addFragments(TenthFragment())
    }
}
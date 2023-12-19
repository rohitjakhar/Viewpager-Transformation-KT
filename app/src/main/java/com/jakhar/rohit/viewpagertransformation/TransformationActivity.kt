package com.jakhar.rohit.viewpagertransformation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
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
import com.jakhar.rohit.viewpagertransformation.databinding.ActivityTransformationBinding

class TransformationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTransformationBinding
    private val pagerAdapter: MyPagerAdapter by lazy {
        MyPagerAdapter(
            supportFragmentManager,
            lifecycle,
            getFragmentList()
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransformationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleTransformation()
    }

    private fun handleTransformation() {
        binding.viewPager.adapter = pagerAdapter
        binding.viewPager.setPageTransformer(
            when (intent.getStringExtra(transformationType)) {
                Constant.SLOW_TRANSFORMATION -> SlowTransformation()
                Constant.SIMPLE_TRANSFORMATION -> SimpleTransformation()
                Constant.DEPTH_TRANSFORMATION -> DepthTransformation()
                Constant.ZOOM_OUT_TRANSFORMATION -> ZoomOutTransformation()
                Constant.CLOCK_SPIN_TRANSFORMATION -> Clock_SpinTransformation()
                Constant.ANTICLOCK_SPIN_TRANSFORMATION -> AntiClockSpinTransformation()
                Constant.FIDGET_SPINNER_TRANSFORMATION -> FidgetSpinTransformation()
                Constant.VERTICAL_FLIP_TRANSFORMATION -> VerticalFlipTransformation()
                Constant.HORIZONTAL_FLIP_TRANSFORMATION -> HorizontalFlipTransformation()
                Constant.POP_TRANSFORMATION -> PopTransformation()
                Constant.FADE_OUT_TRANSFORMATION -> FadeOutTransformation()
                Constant.CUBE_OUT_TRANSFORMATION -> CubeOutRotationTransformation()
                Constant.CUBE_IN_TRANSFORMATION -> CubeInRotationTransformation()
                Constant.CUBE_OUT_SCALING_TRANSFORMATION -> CubeOutScalingTransformation()
                Constant.CUBE_IN_SCALING_TRANSFORMATION -> CubeInScalingTransformation()
                Constant.CUBE_OUT_DEPTH_TRANSFORMATION -> CubeOutDepthTransformation()
                Constant.CUBE_IN_DEPTH_TRANSFORMATION -> CubeInDepthTransformation()
                Constant.HINGE_TRANSFORMATION -> HingeTransformation()
                Constant.GATE_TRANSFORMATION -> GateTransformation()
                Constant.TOSS_TRANSFORMATION -> TossTransformation()
                Constant.FAN_TRANSFORMATION -> FanTransformation()
                Constant.SPINNER_TRANSFORMATION -> SpinnerTransformation()
                Constant.VERTICAL_SHUT_TRANSFORMATION -> VerticalShutTransformation()
                else -> {
                    ViewPager2.PageTransformer { _, _ -> }
                }
            }
        )
    }

    private fun getFragmentList(): List<Fragment> {
        return listOf(
            FirstFragment(),
            SecondFragment(),
            ThirdFragment(),
            FourthFragment(),
            FifthFragment(),
            SixthFragment(),
            SeventhFragment(),
            EighthFragment(),
            NinthFragment(),
            TenthFragment(),
        )
    }

    companion object {
        private const val transformationType = Constant.TRANSFORMATION
        fun getIntent(context: Context, transformation: String): Intent {
            return Intent(context, TransformationActivity::class.java).apply {
                putExtra(transformationType, transformation)
            }
        }
    }
}
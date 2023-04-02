package com.geco.rambulalulintas.rambu

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.Fragment
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentRambuLaranganBinding


class RambuLaranganFragment : Fragment() {
    private var _binding: FragmentRambuLaranganBinding? = null
    private val binding get() = _binding!!
    private var mediaPlayer: MediaPlayer? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuLaranganBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            i4a.setOnClickListener{
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4a)
                mediaPlayer?.run { start() }
                tvi4a.visibility = View.VISIBLE
            }
            i4b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4b)
                mediaPlayer?.run { start() }
                tvi4b.visibility = View.VISIBLE
            }
            i4c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4c)
                mediaPlayer?.run { start() }
                tvi4c.visibility = View.VISIBLE
            }
            i4d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4d)
                mediaPlayer?.run { start() }
                tvi4d.visibility = View.VISIBLE
            }
            i4e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4e)
                mediaPlayer?.run { start() }
                tvi4e.visibility = View.VISIBLE
            }
            i4f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4f)
                mediaPlayer?.run { start() }
                tvi4f.visibility = View.VISIBLE
            }
            i4g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4g)
                mediaPlayer?.run { start() }
                tvi4g.visibility = View.VISIBLE
            }
            i4h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4h)
                mediaPlayer?.run { start() }
                tvi4h.visibility = View.VISIBLE
            }
            i4i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4i)
                mediaPlayer?.run { start() }
                tvi4i.visibility = View.VISIBLE
            }
            i4j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4j)
                mediaPlayer?.run { start() }
                tvi4j.visibility = View.VISIBLE
            }
            i4k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4k)
                mediaPlayer?.run { start() }
                tvi4k.visibility = View.VISIBLE
            }
            i4l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4l)
                mediaPlayer?.run { start() }
                tvi4l.visibility = View.VISIBLE
            }
            i4m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4m)
                mediaPlayer?.run { start() }
                tvi4m.visibility = View.VISIBLE
            }
            i4n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4n)
                mediaPlayer?.run { start() }
                tvi4n.visibility = View.VISIBLE
            }

            iii1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1a)
                mediaPlayer?.run { start() }
                tviii1a.visibility = View.VISIBLE
            }
            iii1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1b)
                mediaPlayer?.run { start() }
                tviii1b.visibility = View.VISIBLE
            }
            iii1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1c)
                mediaPlayer?.run { start() }
                tviii1c.visibility = View.VISIBLE
            }
            iii1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1d)
                mediaPlayer?.run { start() }
                tviii1d.visibility = View.VISIBLE
            }
            iii1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1e)
                mediaPlayer?.run { start() }
                tviii1e.visibility = View.VISIBLE
            }
            iii1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1f)
                mediaPlayer?.run { start() }
                tviii1f.visibility = View.VISIBLE
            }

            iii2a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2a1)
                mediaPlayer?.run { start() }
                tviii2a1.visibility = View.VISIBLE
            }
            iii2a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2a2)
                mediaPlayer?.run { start() }
                tviii2a2.visibility = View.VISIBLE
            }

            iii2b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b1)
                mediaPlayer?.run { start() }
                tviii2b1.visibility = View.VISIBLE
            }
            iii2b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b2)
                mediaPlayer?.run { start() }
                tviii2b2.visibility = View.VISIBLE
            }
            iii2b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b3)
                mediaPlayer?.run { start() }
                tviii2b3.visibility = View.VISIBLE
            }
            iii2b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b4)
                mediaPlayer?.run { start() }
                tviii2b4.visibility = View.VISIBLE
            }
            iii2b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b5)
                mediaPlayer?.run { start() }
                tviii2b5.visibility = View.VISIBLE
            }
            iii2b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b6)
                mediaPlayer?.run { start() }
                tviii2b6.visibility = View.VISIBLE
            }
            iii2b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b7)
                mediaPlayer?.run { start() }
                tviii2b7.visibility = View.VISIBLE
            }
            iii2b8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b8)
                mediaPlayer?.run { start() }
                tviii2b8.visibility = View.VISIBLE
            }
            iii2b9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b9)
                mediaPlayer?.run { start() }
                tviii2b9.visibility = View.VISIBLE
            }
            iii2b10.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b10)
                mediaPlayer?.run { start() }
                tviii2b10.visibility = View.VISIBLE
            }
            iii2b11.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b11)
                mediaPlayer?.run { start() }
                tviii2b11.visibility = View.VISIBLE
            }
            iii2b12.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b12)
                mediaPlayer?.run { start() }
                tviii2b12.visibility = View.VISIBLE
            }
            iii2b13.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b13)
                mediaPlayer?.run { start() }
                tviii2b13.visibility = View.VISIBLE
            }

            iii2c1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c1)
                mediaPlayer?.run { start() }
                tviii2c1.visibility = View.VISIBLE
            }
            iii2c2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c2)
                mediaPlayer?.run { start() }
                tviii2c2.visibility = View.VISIBLE
            }
            iii2c3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c3)
                mediaPlayer?.run { start() }
                tviii2c3.visibility = View.VISIBLE
            }
            iii2c4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c4)
                mediaPlayer?.run { start() }
                tviii2c4.visibility = View.VISIBLE
            }
            iii2c5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c5)
                mediaPlayer?.run { start() }
                tviii2c5.visibility = View.VISIBLE
            }
            iii2c6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c6)
                mediaPlayer?.run { start() }
                tviii2c6.visibility = View.VISIBLE
            }
            iii2c7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c7)
                mediaPlayer?.run { start() }
                tviii2c7.visibility = View.VISIBLE
            }
            iii2c8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c8)
                mediaPlayer?.run { start() }
                tviii2c8.visibility = View.VISIBLE
            }
            iii2c9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c9)
                mediaPlayer?.run { start() }
                tviii2c9.visibility = View.VISIBLE
            }

            iii2d1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d1)
                mediaPlayer?.run { start() }
                tviii2d1.visibility = View.VISIBLE
            }
            iii2d2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d2)
                mediaPlayer?.run { start() }
                tviii2d2.visibility = View.VISIBLE
            }
            iii2d3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d3)
                mediaPlayer?.run { start() }
                tviii2d3.visibility = View.VISIBLE
            }
            iii2d4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d4)
                mediaPlayer?.run { start() }
                tviii2d4.visibility = View.VISIBLE
            }
            iii2d5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d5)
                mediaPlayer?.run { start() }
                tviii2d5.visibility = View.VISIBLE
            }
            iii2d6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d6)
                mediaPlayer?.run { start() }
                tviii2d6.visibility = View.VISIBLE
            }
            iii2d7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d7)
                mediaPlayer?.run { start() }
                tviii2d7.visibility = View.VISIBLE
            }
            iii2d8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d8)
                mediaPlayer?.run { start() }
                tviii2d8.visibility = View.VISIBLE
            }
            iii2d9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d9)
                mediaPlayer?.run { start() }
                tviii2d9.visibility = View.VISIBLE
            }
            iii2d10.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d10)
                mediaPlayer?.run { start() }
                tviii2d10.visibility = View.VISIBLE
            }
            iii2d11.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d11)
                mediaPlayer?.run { start() }
                tviii2d11.visibility = View.VISIBLE
            }
            iii2d12.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d12)
                mediaPlayer?.run { start() }
                tviii2d12.visibility = View.VISIBLE
            }

            iii3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii3a)
                mediaPlayer?.run { start() }
                tviii3a.visibility = View.VISIBLE
            }
            iii3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii3b)
                mediaPlayer?.run { start() }
                tviii3b.visibility = View.VISIBLE
            }

            iii4a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4a)
                mediaPlayer?.run { start() }
                tviii4a.visibility = View.VISIBLE
            }
            iii4b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4b)
                mediaPlayer?.run { start() }
                tviii4b.visibility = View.VISIBLE
            }
            iii4c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4c)
                mediaPlayer?.run { start() }
                tviii4c.visibility = View.VISIBLE
            }
            iii4d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4d)
                mediaPlayer?.run { start() }
                tviii4d.visibility = View.VISIBLE
            }
            iii4e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4e)
                mediaPlayer?.run { start() }
                tviii4e.visibility = View.VISIBLE
            }
            iii4f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4f)
                mediaPlayer?.run { start() }
                tviii4f.visibility = View.VISIBLE
            }
            iii4g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4g)
                mediaPlayer?.run { start() }
                tviii4g.visibility = View.VISIBLE
            }
            iii4h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4h)
                mediaPlayer?.run { start() }
                tviii4h.visibility = View.VISIBLE
            }

            iii5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii5)
                mediaPlayer?.run { start() }
                tviii5.visibility = View.VISIBLE
            }
            iii6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii6)
                mediaPlayer?.run { start() }
                tviii6.visibility = View.VISIBLE
            }

        }

        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                // in here you can do logic when backPress is clicked
                stopPlayer()
                isEnabled = false
                activity?.onBackPressed()
            }
        })
    }

    private fun stopPlayer(){
        if (mediaPlayer != null){
            mediaPlayer?.stop()
        }
    }
}
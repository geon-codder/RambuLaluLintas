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
                hilangkanText()
                tvi4a.visibility = View.VISIBLE

            }
            i4b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4b.visibility = View.VISIBLE
            }
            i4c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4c.visibility = View.VISIBLE
            }
            i4d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4d.visibility = View.VISIBLE
            }
            i4e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4e.visibility = View.VISIBLE
            }
            i4f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4f.visibility = View.VISIBLE
            }
            i4g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4g.visibility = View.VISIBLE
            }
            i4h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4h.visibility = View.VISIBLE
            }
            i4i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4i)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4i.visibility = View.VISIBLE
            }
            i4j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4j)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4j.visibility = View.VISIBLE
            }
            i4k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4k)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4k.visibility = View.VISIBLE
            }
            i4l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4l)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4l.visibility = View.VISIBLE
            }
            i4m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4m)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4m.visibility = View.VISIBLE
            }
            i4n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i4n)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi4n.visibility = View.VISIBLE
            }

            iii1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1a.visibility = View.VISIBLE
            }
            iii1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1b.visibility = View.VISIBLE
            }
            iii1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1c.visibility = View.VISIBLE
            }
            iii1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1d.visibility = View.VISIBLE
            }
            iii1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1e.visibility = View.VISIBLE
            }
            iii1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii1f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii1f.visibility = View.VISIBLE
            }

            iii2a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2a1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2a1.visibility = View.VISIBLE
            }
            iii2a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2a2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2a2.visibility = View.VISIBLE
            }

            iii2b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b1.visibility = View.VISIBLE
            }
            iii2b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b2.visibility = View.VISIBLE
            }
            iii2b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b3)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b3.visibility = View.VISIBLE
            }
            iii2b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b4)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b4.visibility = View.VISIBLE
            }
            iii2b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b5)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b5.visibility = View.VISIBLE
            }
            iii2b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b6)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b6.visibility = View.VISIBLE
            }
            iii2b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b7)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b7.visibility = View.VISIBLE
            }
            iii2b8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b8)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b8.visibility = View.VISIBLE
            }
            iii2b9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b9)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b9.visibility = View.VISIBLE
            }
            iii2b10.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b10)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b10.visibility = View.VISIBLE
            }
            iii2b11.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b11)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b11.visibility = View.VISIBLE
            }
            iii2b12.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b12)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b12.visibility = View.VISIBLE
            }
            iii2b13.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2b13)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2b13.visibility = View.VISIBLE
            }

            iii2c1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c1.visibility = View.VISIBLE
            }
            iii2c2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c2.visibility = View.VISIBLE
            }
            iii2c3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c3)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c3.visibility = View.VISIBLE
            }
            iii2c4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c4)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c4.visibility = View.VISIBLE
            }
            iii2c5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c5)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c5.visibility = View.VISIBLE
            }
            iii2c6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c6)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c6.visibility = View.VISIBLE
            }
            iii2c7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c7)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c7.visibility = View.VISIBLE
            }
            iii2c8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c8)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c8.visibility = View.VISIBLE
            }
            iii2c9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c9)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2c9.visibility = View.VISIBLE
            }

            iii2d1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d1.visibility = View.VISIBLE
            }
            iii2d2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d2.visibility = View.VISIBLE
            }
            iii2d3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d3)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d3.visibility = View.VISIBLE
            }
            iii2d4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d4)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d4.visibility = View.VISIBLE
            }
            iii2d5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d5)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d5.visibility = View.VISIBLE
            }
            iii2d6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d6)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d6.visibility = View.VISIBLE
            }
            iii2d7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d7)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d7.visibility = View.VISIBLE
            }
            iii2d8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d8)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d8.visibility = View.VISIBLE
            }
            iii2d9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d9)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d9.visibility = View.VISIBLE
            }
            iii2d10.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d10)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d10.visibility = View.VISIBLE
            }
            iii2d11.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d11)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d11.visibility = View.VISIBLE
            }
            iii2d12.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii2d12)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii2d12.visibility = View.VISIBLE
            }

            iii3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii3a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii3a.visibility = View.VISIBLE
            }
            iii3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii3b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii3b.visibility = View.VISIBLE
            }

            iii4a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4a.visibility = View.VISIBLE
            }
            iii4b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4b.visibility = View.VISIBLE
            }
            iii4c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4c.visibility = View.VISIBLE
            }
            iii4d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4d.visibility = View.VISIBLE
            }
            iii4e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4e.visibility = View.VISIBLE
            }
            iii4f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4f.visibility = View.VISIBLE
            }
            iii4g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4g.visibility = View.VISIBLE
            }
            iii4h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii4h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii4h.visibility = View.VISIBLE
            }

            iii5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii5)
                mediaPlayer?.run { start() }
                hilangkanText()
                tviii5.visibility = View.VISIBLE
            }
            iii6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iii6)
                mediaPlayer?.run { start() }
                hilangkanText()
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

    private fun hilangkanText(){
        binding.tvi4b.visibility = View.GONE
        binding.tvi4c.visibility = View.GONE
        binding.tvi4d.visibility = View.GONE
        binding.tvi4e.visibility = View.GONE
        binding.tvi4f.visibility = View.GONE
        binding.tvi4g.visibility = View.GONE
        binding.tvi4h.visibility = View.GONE
        binding.tvi4i.visibility = View.GONE
        binding.tvi4j.visibility = View.GONE
        binding.tvi4k.visibility = View.GONE
        binding.tvi4l.visibility = View.GONE
        binding.tvi4m.visibility = View.GONE
        binding.tvi4n.visibility = View.GONE
        binding.tviii1a.visibility = View.GONE
        binding.tviii1b.visibility = View.GONE
        binding.tviii1c.visibility = View.GONE
        binding.tviii1d.visibility = View.GONE
        binding.tviii1e.visibility = View.GONE
        binding.tviii1f.visibility = View.GONE
        binding.tviii2a1.visibility = View.GONE
        binding.tviii2a2.visibility = View.GONE
        binding.tviii2b1.visibility = View.GONE
        binding.tviii2b2.visibility = View.GONE
        binding.tviii2b3.visibility = View.GONE
        binding.tviii2b4.visibility = View.GONE
        binding.tviii2b5.visibility = View.GONE
        binding.tviii2b6.visibility = View.GONE
        binding.tviii2b7.visibility = View.GONE
        binding.tviii2b8.visibility = View.GONE
        binding.tviii2b9.visibility = View.GONE
        binding.tviii2b10.visibility = View.GONE
        binding.tviii2b11.visibility = View.GONE
        binding.tviii2b12.visibility = View.GONE
        binding.tviii2b13.visibility = View.GONE
        binding.tviii2c1.visibility = View.GONE
        binding.tviii2c2.visibility = View.GONE
        binding.tviii2c3.visibility = View.GONE
        binding.tviii2c4.visibility = View.GONE
        binding.tviii2c5.visibility = View.GONE
        binding.tviii2c6.visibility = View.GONE
        binding.tviii2c7.visibility = View.GONE
        binding.tviii2c8.visibility = View.GONE
        binding.tviii2c9.visibility = View.GONE
        binding.tviii2d1.visibility = View.GONE
        binding.tviii2d2.visibility = View.GONE
        binding.tviii2d3.visibility = View.GONE
        binding.tviii2d4.visibility = View.GONE
        binding.tviii2d5.visibility = View.GONE
        binding.tviii2d6.visibility = View.GONE
        binding.tviii2d7.visibility = View.GONE
        binding.tviii2d8.visibility = View.GONE
        binding.tviii2d9.visibility = View.GONE
        binding.tviii2d10.visibility = View.GONE
        binding.tviii2d11.visibility = View.GONE
        binding.tviii2d12.visibility = View.GONE
        binding.tviii3a.visibility = View.GONE
        binding.tviii3b.visibility = View.GONE
        binding.tviii4a.visibility = View.GONE
        binding.tviii4b.visibility = View.GONE
        binding.tviii4c.visibility = View.GONE
        binding.tviii4d.visibility = View.GONE
        binding.tviii4e.visibility = View.GONE
        binding.tviii4f.visibility = View.GONE
        binding.tviii4g.visibility = View.GONE
        binding.tviii4h.visibility = View.GONE
        binding.tviii5.visibility = View.GONE
        binding.tviii6.visibility = View.GONE
    }

    private fun stopPlayer(){
        if (mediaPlayer != null){
            mediaPlayer?.stop()
        }
    }
}
package com.geco.rambulalulintas.rambu

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentRambuPerintahBinding
import com.geco.rambulalulintas.databinding.FragmentRambuPetunjukBinding


class RambuPetunjukFragment : Fragment() {
    private var _binding: FragmentRambuPetunjukBinding? = null
    private val binding get() = _binding!!
    private var mediaPlayer: MediaPlayer? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuPetunjukBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            v10a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v10a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv10a.visibility = View.VISIBLE
            }
            v10b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v10b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv10b.visibility = View.VISIBLE
            }
            v10c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v10c)
                mediaPlayer?.run { start() }
                hilangText()
                tvv10c.visibility = View.VISIBLE
            }
            v10d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v10d)
                mediaPlayer?.run { start() }
                hilangText()
                tvv10d.visibility = View.VISIBLE
            }
            v10e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v10e)
                mediaPlayer?.run { start() }
                hilangText()
                tvv10e.visibility = View.VISIBLE
            }

            v1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1a.visibility = View.VISIBLE
            }
            v1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1b.visibility = View.VISIBLE
            }
            v1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1c)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1c.visibility = View.VISIBLE
            }
            v1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1d)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1d.visibility = View.VISIBLE
            }
            v1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1e)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1e.visibility = View.VISIBLE
            }
            v1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v1f)
                mediaPlayer?.run { start() }
                hilangText()
                tvv1f.visibility = View.VISIBLE
            }

            v2a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v2a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv2a.visibility = View.VISIBLE
            }
            v2b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v2b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv2b.visibility = View.VISIBLE
            }

            v3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v3a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv3a.visibility = View.VISIBLE
            }
            v3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v3b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv3b.visibility = View.VISIBLE
            }

            v4a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v4a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv4a.visibility = View.VISIBLE
            }
            v4b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v4b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv4b.visibility = View.VISIBLE
            }
            v4c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v4c)
                mediaPlayer?.run { start() }
                hilangText()
                tvv4c.visibility = View.VISIBLE
            }
            v4d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v4d)
                mediaPlayer?.run { start() }
                hilangText()
                tvv4d.visibility = View.VISIBLE
            }

            v5a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5a1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5a1.visibility = View.VISIBLE
            }
            v5a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5a2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5a2.visibility = View.VISIBLE
            }
            v5a3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5a3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5a3.visibility = View.VISIBLE
            }
            v5a4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5a4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5a4.visibility = View.VISIBLE
            }

            v5b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5b1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5b1.visibility = View.VISIBLE
            }
            v5b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5b2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5b2.visibility = View.VISIBLE
            }
            v5c1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5c1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5c1.visibility = View.VISIBLE
            }
            v5c2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5c2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5c2.visibility = View.VISIBLE
            }

            v5d1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5d1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5d1.visibility = View.VISIBLE
            }
            v5d2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5d2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5d2.visibility = View.VISIBLE
            }
            v5d3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5d3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5d3.visibility = View.VISIBLE
            }

            v5e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5e)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5e.visibility = View.VISIBLE
            }

            v5f1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5f1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5f1.visibility = View.VISIBLE
            }
            v5f2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5f2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5f2.visibility = View.VISIBLE
            }

            v5g1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5g1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5g1.visibility = View.VISIBLE
            }
            v5g2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5g2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5g2.visibility = View.VISIBLE
            }

            v5h1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h1.visibility = View.VISIBLE
            }
            v5h2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h2.visibility = View.VISIBLE
            }
            v5h3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h3.visibility = View.VISIBLE
            }
            v5h4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h4.visibility = View.VISIBLE
            }
            v5h5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h5)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h5.visibility = View.VISIBLE
            }
            v5h6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v5h6)
                mediaPlayer?.run { start() }
                hilangText()
                tvv5h6.visibility = View.VISIBLE
            }

            v6a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6a1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6a1.visibility = View.VISIBLE
            }
            v6a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6a2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6a2.visibility = View.VISIBLE
            }
            v6a3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6a3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6a3.visibility = View.VISIBLE
            }
            v6a4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6a4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6a4.visibility = View.VISIBLE
            }

            v6b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b1.visibility = View.VISIBLE
            }
            v6b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b2.visibility = View.VISIBLE
            }
            v6b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b3.visibility = View.VISIBLE
            }
            v6b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b4.visibility = View.VISIBLE
            }
            v6b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b5)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b5.visibility = View.VISIBLE
            }
            v6b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b6)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b6.visibility = View.VISIBLE
            }
            v6b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b7)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b7.visibility = View.VISIBLE
            }
            v6b8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6b8)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6b8.visibility = View.VISIBLE
            }

            v6c1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6c1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6c1.visibility = View.VISIBLE
            }
            v6c2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6c2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6c2.visibility = View.VISIBLE
            }
            v6c3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6c3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6c3.visibility = View.VISIBLE
            }
            v6c4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6c4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6c4.visibility = View.VISIBLE
            }
            v6c5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6c5)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6c5.visibility = View.VISIBLE
            }

            v6d1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d1.visibility = View.VISIBLE
            }
            v6d2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d2.visibility = View.VISIBLE
            }
            v6d3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d3.visibility = View.VISIBLE
            }
            v6d4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d4.visibility = View.VISIBLE
            }
            v6d5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d5)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d5.visibility = View.VISIBLE
            }
            v6d6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d6)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d6.visibility = View.VISIBLE
            }
            v6d7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6d7)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6d7.visibility = View.VISIBLE
            }
            v6e1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6e1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6e1.visibility = View.VISIBLE
            }
            v6e2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6e2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6e2.visibility = View.VISIBLE
            }
            v6e3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6e3)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6e3.visibility = View.VISIBLE
            }
            v6e4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6e4)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6e4.visibility = View.VISIBLE
            }

            v6f1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6f1)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6f1.visibility = View.VISIBLE
            }
            v6f2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v6f2)
                mediaPlayer?.run { start() }
                hilangText()
                tvv6f2.visibility = View.VISIBLE
            }

            v7g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7g)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7g.visibility = View.VISIBLE
            }
            v7a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7a)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7a.visibility = View.VISIBLE
            }
            v7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7b)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7b.visibility = View.VISIBLE
            }
            v7c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7c)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7c.visibility = View.VISIBLE
            }
            v7d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7d)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7d.visibility = View.VISIBLE
            }
            v7e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7e)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7e.visibility = View.VISIBLE
            }
            v7f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7f)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7f.visibility = View.VISIBLE
            }
            v7h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7h)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7h.visibility = View.VISIBLE
            }
            v7i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v7i)
                mediaPlayer?.run { start() }
                hilangText()
                tvv7i.visibility = View.VISIBLE
            }

            v8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v8)
                mediaPlayer?.run { start() }
                hilangText()
                tvv8.visibility = View.VISIBLE
            }
            v9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.v9)
                mediaPlayer?.run { start() }
                hilangText()
                tvv9.visibility = View.VISIBLE
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

    private fun hilangText(){
        binding.apply {
            tvv10a.visibility = View.GONE
            tvv10b.visibility = View.GONE
            tvv10c.visibility = View.GONE
            tvv10d.visibility = View.GONE
            tvv10e.visibility = View.GONE
            tvv1a.visibility = View.GONE
            tvv1b.visibility = View.GONE
            tvv1c.visibility = View.GONE
            tvv1d.visibility = View.GONE
            tvv1e.visibility = View.GONE
            tvv1f.visibility = View.GONE
            tvv2a.visibility = View.GONE
            tvv2b.visibility = View.GONE
            tvv3a.visibility = View.GONE
            tvv3b.visibility = View.GONE
            tvv4a.visibility = View.GONE
            tvv4b.visibility = View.GONE
            tvv4c.visibility = View.GONE
            tvv4d.visibility = View.GONE
            tvv5a1.visibility = View.GONE
            tvv5a2.visibility = View.GONE
            tvv5a3.visibility = View.GONE
            tvv5a4.visibility = View.GONE
            tvv5b1.visibility = View.GONE
            tvv5b2.visibility = View.GONE
            tvv5c1.visibility = View.GONE
            tvv5c2.visibility = View.GONE
            tvv5d1.visibility = View.GONE
            tvv5d2.visibility = View.GONE
            tvv5d3.visibility = View.GONE
            tvv5e.visibility = View.GONE
            tvv5f1.visibility = View.GONE
            tvv5f2.visibility = View.GONE
            tvv5g1.visibility = View.GONE
            tvv5g2.visibility = View.GONE
            tvv5h1.visibility = View.GONE
            tvv5h2.visibility = View.GONE
            tvv5h3.visibility = View.GONE
            tvv5h4.visibility = View.GONE
            tvv5h5.visibility = View.GONE
            tvv5h6.visibility = View.GONE
            tvv6a1.visibility = View.GONE
            tvv6a2.visibility = View.GONE
            tvv6a3.visibility = View.GONE
            tvv6a4.visibility = View.GONE
            tvv6b1.visibility = View.GONE
            tvv6b2.visibility = View.GONE
            tvv6b3.visibility = View.GONE
            tvv6b4.visibility = View.GONE
            tvv6b5.visibility = View.GONE
            tvv6b6.visibility = View.GONE
            tvv6b7.visibility = View.GONE
            tvv6b8.visibility = View.GONE
            tvv6c1.visibility = View.GONE
            tvv6c2.visibility = View.GONE
            tvv6c3.visibility = View.GONE
            tvv6c4.visibility = View.GONE
            tvv6c5.visibility = View.GONE
            tvv6d1.visibility = View.GONE
            tvv6d2.visibility = View.GONE
            tvv6d3.visibility = View.GONE
            tvv6d4.visibility = View.GONE
            tvv6d5.visibility = View.GONE
            tvv6d6.visibility = View.GONE
            tvv6d7.visibility = View.GONE
            tvv6e1.visibility = View.GONE
            tvv6e2.visibility = View.GONE
            tvv6e3.visibility = View.GONE
            tvv6e4.visibility = View.GONE
            tvv6f1.visibility = View.GONE
            tvv6f2.visibility = View.GONE
            tvv7a.visibility = View.GONE
            tvv7b.visibility = View.GONE
            tvv7c.visibility = View.GONE
            tvv7d.visibility = View.GONE
            tvv7e.visibility = View.GONE
            tvv7f.visibility = View.GONE
            tvv7g.visibility = View.GONE
            tvv7h.visibility = View.GONE
            tvv7i.visibility = View.GONE
            tvv8.visibility = View.GONE
            tvv9.visibility = View.GONE
        }

    }

    private fun stopPlayer(){
        if (mediaPlayer != null){
            mediaPlayer?.stop()
        }
    }
}
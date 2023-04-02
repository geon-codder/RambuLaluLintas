package com.geco.rambulalulintas.rambu

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentRambuPeringatanBinding
import com.geco.rambulalulintas.databinding.FragmentRambuPerintahBinding


class RambuPerintahFragment : Fragment() {
    private var _binding: FragmentRambuPerintahBinding? = null
    private val binding get() = _binding!!
    private var mediaPlayer: MediaPlayer? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuPerintahBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply{
            i7a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7a)
                mediaPlayer?.run { start() }
                tvi7a.visibility = View.VISIBLE
            }
            i7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7b)
                mediaPlayer?.run { start() }
                tvi7b.visibility = View.VISIBLE
            }
            i7c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7c)
                mediaPlayer?.run { start() }
                tvi7c.visibility = View.VISIBLE
            }
            i7d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7d)
                mediaPlayer?.run { start() }
                tvi7d.visibility = View.VISIBLE
            }
            i7e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7e)
                mediaPlayer?.run { start() }
                tvi7e.visibility = View.VISIBLE
            }
            i7f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7f)
                mediaPlayer?.run { start() }
                tvi7f.visibility = View.VISIBLE
            }
            i7g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7g)
                mediaPlayer?.run { start() }
                tvi7g.visibility = View.VISIBLE
            }
            i7h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7h)
                mediaPlayer?.run { start() }
                tvi7h.visibility = View.VISIBLE
            }
            i7i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7i)
                mediaPlayer?.run { start() }
                tvi7i.visibility = View.VISIBLE
            }
            i7j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7j)
                mediaPlayer?.run { start() }
                tvi7j.visibility = View.VISIBLE
            }
            i7k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7k)
                mediaPlayer?.run { start() }
                tvi7k.visibility = View.VISIBLE
            }
            i7l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7l)
                mediaPlayer?.run { start() }
                tvi7l.visibility = View.VISIBLE
            }
            i7m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7m)
                mediaPlayer?.run { start() }
                tvi7m.visibility = View.VISIBLE
            }
            i7n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7n)
                mediaPlayer?.run { start() }
                tvi7n.visibility = View.VISIBLE
            }
            i7o.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7o)
                mediaPlayer?.run { start() }
                tvi7o.visibility = View.VISIBLE
            }
            i7p.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7p)
                mediaPlayer?.run { start() }
                tvi7p.visibility = View.VISIBLE
            }
            i7q.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7q)
                mediaPlayer?.run { start() }
                tvi7q.visibility = View.VISIBLE
            }
            i7r.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7r)
                mediaPlayer?.run { start() }
                tvi7r.visibility = View.VISIBLE
            }

            iv1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1a)
                mediaPlayer?.run { start() }
                tviv1a.visibility = View.VISIBLE
            }
            iv1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1b)
                mediaPlayer?.run { start() }
                tviv1b.visibility = View.VISIBLE
            }
            iv1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1c)
                mediaPlayer?.run { start() }
                tviv1c.visibility = View.VISIBLE
            }
            iv1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1d)
                mediaPlayer?.run { start() }
                tviv1d.visibility = View.VISIBLE
            }
            iv1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1e)
                mediaPlayer?.run { start() }
                tviv1e.visibility = View.VISIBLE
            }
            iv1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1f)
                mediaPlayer?.run { start() }
                tviv1f.visibility = View.VISIBLE
            }

            iv2a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv2a)
                mediaPlayer?.run { start() }
                tviv2a.visibility = View.VISIBLE
            }
            iv2b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv2b)
                mediaPlayer?.run { start() }
                tviv2b.visibility = View.VISIBLE
            }

            iv3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3a)
                mediaPlayer?.run { start() }
                tviv3a.visibility = View.VISIBLE
            }
            iv3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3b)
                mediaPlayer?.run { start() }
                tviv3b.visibility = View.VISIBLE
            }
            iv3c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3c)
                mediaPlayer?.run { start() }
                tviv3c.visibility = View.VISIBLE
            }

            iv4a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv4a)
                mediaPlayer?.run { start() }
                tviv4a.visibility = View.VISIBLE
            }

            iv5a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv5a)
                mediaPlayer?.run { start() }
                tviv5a.visibility = View.VISIBLE
            }

            iv6a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a1)
                mediaPlayer?.run { start() }
                tviv6a1.visibility = View.VISIBLE
            }
            iv6a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a2)
                mediaPlayer?.run { start() }
                tviv6a2.visibility = View.VISIBLE
            }
            iv6a3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a3)
                mediaPlayer?.run { start() }
                tviv6a3.visibility = View.VISIBLE
            }

            iv6b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b1)
                mediaPlayer?.run { start() }
                tviv6b1.visibility = View.VISIBLE
            }
            iv6b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b2)
                mediaPlayer?.run { start() }
                tviv6b2.visibility = View.VISIBLE
            }
            iv6b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b3)
                mediaPlayer?.run { start() }
                tviv6b3.visibility = View.VISIBLE
            }
            iv6b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b4)
                mediaPlayer?.run { start() }
                tviv6b4.visibility = View.VISIBLE
            }
            iv6b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b5)
                mediaPlayer?.run { start() }
                tviv6b5.visibility = View.VISIBLE
            }
            iv6b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b6)
                mediaPlayer?.run { start() }
                tviv6b6.visibility = View.VISIBLE
            }
            iv6b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b7)
                mediaPlayer?.run { start() }
                tviv6b7.visibility = View.VISIBLE
            }

            iv7a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv7a)
                mediaPlayer?.run { start() }
                tviv7a.visibility = View.VISIBLE
            }
            iv7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv7b)
                mediaPlayer?.run { start() }
                tviv7b.visibility = View.VISIBLE
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
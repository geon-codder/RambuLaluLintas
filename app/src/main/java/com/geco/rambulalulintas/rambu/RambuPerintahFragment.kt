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
                hilangText()
                tvi7a.visibility = View.VISIBLE
            }
            i7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7b)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7b.visibility = View.VISIBLE
            }
            i7c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7c)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7c.visibility = View.VISIBLE
            }
            i7d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7d)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7d.visibility = View.VISIBLE
            }
            i7e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7e)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7e.visibility = View.VISIBLE
            }
            i7f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7f)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7f.visibility = View.VISIBLE
            }
            i7g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7g)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7g.visibility = View.VISIBLE
            }
            i7h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7h)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7h.visibility = View.VISIBLE
            }
            i7i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7i)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7i.visibility = View.VISIBLE
            }
            i7j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7j)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7j.visibility = View.VISIBLE
            }
            i7k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7k)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7k.visibility = View.VISIBLE
            }
            i7l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7l)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7l.visibility = View.VISIBLE
            }
            i7m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7m)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7m.visibility = View.VISIBLE
            }
            i7n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7n)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7n.visibility = View.VISIBLE
            }
            i7o.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7o)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7o.visibility = View.VISIBLE
            }
            i7p.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7p)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7p.visibility = View.VISIBLE
            }
            i7q.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7q)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7q.visibility = View.VISIBLE
            }
            i7r.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i7r)
                mediaPlayer?.run { start() }
                hilangText()
                tvi7r.visibility = View.VISIBLE
            }

            iv1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1a.visibility = View.VISIBLE
            }
            iv1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1b)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1b.visibility = View.VISIBLE
            }
            iv1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1c)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1c.visibility = View.VISIBLE
            }
            iv1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1d)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1d.visibility = View.VISIBLE
            }
            iv1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1e)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1e.visibility = View.VISIBLE
            }
            iv1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv1f)
                mediaPlayer?.run { start() }
                hilangText()
                tviv1f.visibility = View.VISIBLE
            }

            iv2a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv2a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv2a.visibility = View.VISIBLE
            }
            iv2b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv2b)
                mediaPlayer?.run { start() }
                hilangText()
                tviv2b.visibility = View.VISIBLE
            }

            iv3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv3a.visibility = View.VISIBLE
            }
            iv3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3b)
                mediaPlayer?.run { start() }
                hilangText()
                tviv3b.visibility = View.VISIBLE
            }
            iv3c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv3c)
                mediaPlayer?.run { start() }
                hilangText()
                tviv3c.visibility = View.VISIBLE
            }

            iv4a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv4a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv4a.visibility = View.VISIBLE
            }

            iv5a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv5a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv5a.visibility = View.VISIBLE
            }

            iv6a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a1)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6a1.visibility = View.VISIBLE
            }
            iv6a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a2)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6a2.visibility = View.VISIBLE
            }
            iv6a3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6a3)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6a3.visibility = View.VISIBLE
            }

            iv6b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b1)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b1.visibility = View.VISIBLE
            }
            iv6b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b2)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b2.visibility = View.VISIBLE
            }
            iv6b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b3)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b3.visibility = View.VISIBLE
            }
            iv6b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b4)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b4.visibility = View.VISIBLE
            }
            iv6b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b5)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b5.visibility = View.VISIBLE
            }
            iv6b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b6)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b6.visibility = View.VISIBLE
            }
            iv6b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv6b7)
                mediaPlayer?.run { start() }
                hilangText()
                tviv6b7.visibility = View.VISIBLE
            }

            iv7a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv7a)
                mediaPlayer?.run { start() }
                hilangText()
                tviv7a.visibility = View.VISIBLE
            }
            iv7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.iv7b)
                mediaPlayer?.run { start() }
                hilangText()
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

    private fun hilangText(){
        binding.apply {
            tvi7a.visibility = View.GONE
            tvi7b.visibility = View.GONE
            tvi7c.visibility = View.GONE
            tvi7d.visibility = View.GONE
            tvi7e.visibility = View.GONE
            tvi7f.visibility = View.GONE
            tvi7g.visibility = View.GONE
            tvi7h.visibility = View.GONE
            tvi7i.visibility = View.GONE
            tvi7j.visibility = View.GONE
            tvi7k.visibility = View.GONE
            tvi7l.visibility = View.GONE
            tvi7m.visibility = View.GONE
            tvi7n.visibility = View.GONE
            tvi7o.visibility = View.GONE
            tvi7p.visibility = View.GONE
            tvi7q.visibility = View.GONE
            tvi7r.visibility = View.GONE
            tviv1a.visibility = View.GONE
            tviv1b.visibility = View.GONE
            tviv1c.visibility = View.GONE
            tviv1d.visibility = View.GONE
            tviv1e.visibility = View.GONE
            tviv1f.visibility = View.GONE
            tviv2a.visibility = View.GONE
            tviv2b.visibility = View.GONE
            tviv3a.visibility = View.GONE
            tviv3b.visibility = View.GONE
            tviv3c.visibility = View.GONE
            tviv4a.visibility = View.GONE
            tviv5a.visibility = View.GONE
            tviv6a1.visibility = View.GONE
            tviv6a2.visibility = View.GONE
            tviv6a3.visibility = View.GONE
            tviv6b1.visibility = View.GONE
            tviv6b2.visibility = View.GONE
            tviv6b3.visibility = View.GONE
            tviv6b4.visibility = View.GONE
            tviv6b5.visibility = View.GONE
            tviv6b6.visibility = View.GONE
            tviv6b7.visibility = View.GONE
            tviv7a.visibility = View.GONE
            tviv7b.visibility = View.GONE
        }
    }
    private fun stopPlayer(){
        if (mediaPlayer != null){
            mediaPlayer?.stop()
        }
    }
}
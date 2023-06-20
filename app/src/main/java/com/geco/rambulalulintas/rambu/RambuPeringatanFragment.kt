package com.geco.rambulalulintas.rambu

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import com.geco.rambulalulintas.R
import com.geco.rambulalulintas.databinding.FragmentRambuLaranganBinding
import com.geco.rambulalulintas.databinding.FragmentRambuPeringatanBinding


class RambuPeringatanFragment : Fragment() {
    private var _binding: FragmentRambuPeringatanBinding? = null
    private val binding get() = _binding!!
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRambuPeringatanBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            i1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1a.visibility = View.VISIBLE
            }
            i1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1b.visibility = View.VISIBLE
            }
            i1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1c.visibility = View.VISIBLE
            }
            i1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1d.visibility = View.VISIBLE
            }
            i1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1e.visibility = View.VISIBLE
            }
            i1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1f.visibility = View.VISIBLE
            }
            i1g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1g.visibility = View.VISIBLE
            }
            i1h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1h.visibility = View.VISIBLE
            }
            i1i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1i)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1i.visibility = View.VISIBLE
            }
            i1j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1j)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1j.visibility = View.VISIBLE
            }
            i1k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1k)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1k.visibility = View.VISIBLE
            }
            i1l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1l)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1l.visibility = View.VISIBLE
            }
            i1m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1m)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1m.visibility = View.VISIBLE
            }
            i1n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1n)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1n.visibility = View.VISIBLE
            }
            i1o.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1o)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1o.visibility = View.VISIBLE
            }
            i1p.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1p)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1p.visibility = View.VISIBLE
            }
            i1q.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1q)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1q.visibility = View.VISIBLE
            }
            i1r.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1r)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1r.visibility = View.VISIBLE
            }
            i1s.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1s)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1s.visibility = View.VISIBLE
            }
            i1t.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1t)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1t.visibility = View.VISIBLE
            }
            i1u.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1u)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1u.visibility = View.VISIBLE
            }
            i1aa.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1aa)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1aa.visibility = View.VISIBLE
            }
            i1ab.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1ab)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1ab.visibility = View.VISIBLE
            }
            i1ac.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.i1ac)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvi1ac.visibility = View.VISIBLE
            }

            ii10a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii10a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii10a.visibility = View.VISIBLE
            }
            ii10b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii10b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii10b.visibility = View.VISIBLE
            }
            ii10c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii10c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii10c.visibility = View.VISIBLE
            }

            ii11a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii11a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii11a.visibility = View.VISIBLE
            }
            ii11b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii11b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii11b.visibility = View.VISIBLE
            }
            ii11c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii11c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii11c.visibility = View.VISIBLE
            }
            ii11d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii11d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii11d.visibility = View.VISIBLE
            }
            ii11e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii11e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii11e.visibility = View.VISIBLE
            }

            ii1a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1a.visibility = View.VISIBLE
            }
            ii1b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1b.visibility = View.VISIBLE
            }
            ii1c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1c.visibility = View.VISIBLE
            }
            ii1d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1d.visibility = View.VISIBLE
            }
            ii1e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1e.visibility = View.VISIBLE
            }
            ii1f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1f.visibility = View.VISIBLE
            }
            ii1g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1g.visibility = View.VISIBLE
            }
            ii1h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1h.visibility = View.VISIBLE
            }
            ii1i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1i)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1i.visibility = View.VISIBLE
            }
            ii1j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1j)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1j.visibility = View.VISIBLE
            }
            ii1k.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1k)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1k.visibility = View.VISIBLE
            }
            ii1l.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1l)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1l.visibility = View.VISIBLE
            }
            ii1m.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1m)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1m.visibility = View.VISIBLE
            }
            ii1n.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1n)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1n.visibility = View.VISIBLE
            }
            ii1o.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1o)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1o.visibility = View.VISIBLE
            }
            ii1p.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1p)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1p.visibility = View.VISIBLE
            }
            ii1q.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1q)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1q.visibility = View.VISIBLE
            }
            ii1r.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1r)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1r.visibility = View.VISIBLE
            }
            ii1s.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1s)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1s.visibility = View.VISIBLE
            }
            ii1t.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1t)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1t.visibility = View.VISIBLE
            }
            ii1u.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1u)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1u.visibility = View.VISIBLE
            }
            ii1v.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1v)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1v.visibility = View.VISIBLE
            }
            ii1w.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii1w)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii1w.visibility = View.VISIBLE
            }

            ii2a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii2a.visibility = View.VISIBLE
            }
            ii2b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii2b.visibility = View.VISIBLE
            }
            ii2c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii2c.visibility = View.VISIBLE
            }
            ii2d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii2d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii2d.visibility = View.VISIBLE
            }
            ii3a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3a.visibility = View.VISIBLE
            }
            ii3b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3b.visibility = View.VISIBLE
            }
            ii3c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3c.visibility = View.VISIBLE
            }
            ii3d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3d.visibility = View.VISIBLE
            }
            ii3e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3e.visibility = View.VISIBLE
            }
            ii3f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3f.visibility = View.VISIBLE
            }
            ii3g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3g.visibility = View.VISIBLE
            }
            ii3h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3h.visibility = View.VISIBLE
            }
            ii3i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3i)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3i.visibility = View.VISIBLE
            }
            ii3j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii3j)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii3j.visibility = View.VISIBLE
            }

            ii4a1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4a1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4a1.visibility = View.VISIBLE
            }
            ii4a2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4a2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4a2.visibility = View.VISIBLE
            }

            ii4b1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b1.visibility = View.VISIBLE
            }
            ii4b2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b2.visibility = View.VISIBLE
            }
            ii4b3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b3)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b3.visibility = View.VISIBLE
            }
            ii4b4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b4)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b4.visibility = View.VISIBLE
            }
            ii4b5.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b5)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b5.visibility = View.VISIBLE
            }
            ii4b6.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b6)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b6.visibility = View.VISIBLE
            }
            ii4b7.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b7)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b7.visibility = View.VISIBLE
            }
            ii4b8.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b8)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b8.visibility = View.VISIBLE
            }
            ii4b9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b9)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b9.visibility = View.VISIBLE
            }
            ii4b10.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b10)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b10.visibility = View.VISIBLE
            }
            ii4b11.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b11)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b11.visibility = View.VISIBLE
            }
            ii4b12.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b12)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b12.visibility = View.VISIBLE
            }
            ii4b13.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b13)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b13.visibility = View.VISIBLE
            }
            ii4b14.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b14)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b14.visibility = View.VISIBLE
            }
            ii4b15.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b15)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b15.visibility = View.VISIBLE
            }
            ii4b16.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b16)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b16.visibility = View.VISIBLE
            }
            ii4b17.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b17)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b17.visibility = View.VISIBLE
            }
            ii4b18.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b18)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b18.visibility = View.VISIBLE
            }
            ii4b19.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4b19)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4b19.visibility = View.VISIBLE
            }

            ii4c1.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4c1)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4c1.visibility = View.VISIBLE
            }
            ii4c2.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4c2)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4c2.visibility = View.VISIBLE
            }
            ii4c3.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4c3)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4c3.visibility = View.VISIBLE
            }
            ii4c4.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii4c4)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii4c4.visibility = View.VISIBLE
            }

            ii5a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5a.visibility = View.VISIBLE
            }
            ii5b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5b.visibility = View.VISIBLE
            }
            ii5c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5c.visibility = View.VISIBLE
            }
            ii5d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5d.visibility = View.VISIBLE
            }
            ii5e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5e.visibility = View.VISIBLE
            }
            ii5f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii5f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii5f.visibility = View.VISIBLE
            }
            ii6a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6a.visibility = View.VISIBLE
            }
            ii6b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6b.visibility = View.VISIBLE
            }
            ii6c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6c.visibility = View.VISIBLE
            }
            ii6d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6d.visibility = View.VISIBLE
            }
            ii6e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6e.visibility = View.VISIBLE
            }
            ii6f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6f.visibility = View.VISIBLE
            }
            ii6g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii6g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii6g.visibility = View.VISIBLE
            }

            ii7a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii7a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii7a.visibility = View.VISIBLE
            }
            ii7b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii7b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii7b.visibility = View.VISIBLE
            }
            ii7c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii7c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii7c.visibility = View.VISIBLE
            }

            ii8a.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8a)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8a.visibility = View.VISIBLE
            }
            ii8b.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8b)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8b.visibility = View.VISIBLE
            }
            ii8c.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8c)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8c.visibility = View.VISIBLE
            }
            ii8d.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8d)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8d.visibility = View.VISIBLE
            }
            ii8e.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8e)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8e.visibility = View.VISIBLE
            }
            ii8f.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8f)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8f.visibility = View.VISIBLE
            }
            ii8g.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8g)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8g.visibility = View.VISIBLE
            }
            ii8h.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8h)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8h.visibility = View.VISIBLE
            }
            ii8i.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8i)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8i.visibility = View.VISIBLE
            }
            ii8j.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii8j)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii8j.visibility = View.VISIBLE
            }

            ii9.setOnClickListener {
                stopPlayer()
                mediaPlayer = MediaPlayer.create(context, R.raw.ii9)
                mediaPlayer?.run { start() }
                hilangkanText()
                tvii9.visibility = View.VISIBLE
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
        binding.apply {
            tvi1a.visibility = View.GONE
            tvi1b.visibility = View.GONE
            tvi1c.visibility = View.GONE
            tvi1d.visibility = View.GONE
            tvi1e.visibility = View.GONE
            tvi1f.visibility = View.GONE
            tvi1g.visibility = View.GONE
            tvi1h.visibility = View.GONE
            tvi1i.visibility = View.GONE
            tvi1j.visibility = View.GONE
            tvi1k.visibility = View.GONE
            tvi1l.visibility = View.GONE
            tvi1m.visibility = View.GONE
            tvi1n.visibility = View.GONE
            tvi1o.visibility = View.GONE
            tvi1p.visibility = View.GONE
            tvi1q.visibility = View.GONE
            tvi1r.visibility = View.GONE
            tvi1s.visibility = View.GONE
            tvi1t.visibility = View.GONE
            tvi1u.visibility = View.GONE
            tvi1aa.visibility = View.GONE
            tvi1ab.visibility = View.GONE
            tvi1ac.visibility = View.GONE
            tvii10a.visibility = View.GONE
            tvii10b.visibility = View.GONE
            tvii10c.visibility = View.GONE
            tvii11a.visibility = View.GONE
            tvii11b.visibility = View.GONE
            tvii11c.visibility = View.GONE
            tvii11d.visibility = View.GONE
            tvii11e.visibility = View.GONE
            tvii1a.visibility = View.GONE
            tvii1b.visibility = View.GONE
            tvii1c.visibility = View.GONE
            tvii1d.visibility = View.GONE
            tvii1e.visibility = View.GONE
            tvii1f.visibility = View.GONE
            tvii1g.visibility = View.GONE
            tvii1h.visibility = View.GONE
            tvii1i.visibility = View.GONE
            tvii1j.visibility = View.GONE
            tvii1k.visibility = View.GONE
            tvii1l.visibility = View.GONE
            tvii1m.visibility = View.GONE
            tvii1n.visibility = View.GONE
            tvii1o.visibility = View.GONE
            tvii1p.visibility = View.GONE
            tvii1q.visibility = View.GONE
            tvii1r.visibility = View.GONE
            tvii1s.visibility = View.GONE
            tvii1t.visibility = View.GONE
            tvii1u.visibility = View.GONE
            tvii1v.visibility = View.GONE
            tvii1w.visibility = View.GONE
            tvii2a.visibility = View.GONE
            tvii2b.visibility = View.GONE
            tvii2c.visibility = View.GONE
            tvii2d.visibility = View.GONE
            tvii3a.visibility = View.GONE
            tvii3b.visibility = View.GONE
            tvii3c.visibility = View.GONE
            tvii3d.visibility = View.GONE
            tvii3e.visibility = View.GONE
            tvii3f.visibility = View.GONE
            tvii3g.visibility = View.GONE
            tvii3h.visibility = View.GONE
            tvii3i.visibility = View.GONE
            tvii3j.visibility = View.GONE
            tvii4a1.visibility = View.GONE
            tvii4a2.visibility = View.GONE
            tvii4b1.visibility = View.GONE
            tvii4b2.visibility = View.GONE
            tvii4b3.visibility = View.GONE
            tvii4b4.visibility = View.GONE
            tvii4b5.visibility = View.GONE
            tvii4b6.visibility = View.GONE
            tvii4b7.visibility = View.GONE
            tvii4b8.visibility = View.GONE
            tvii4b9.visibility = View.GONE
            tvii4b10.visibility = View.GONE
            tvii4b11.visibility = View.GONE
            tvii4b12.visibility = View.GONE
            tvii4b13.visibility = View.GONE
            tvii4b14.visibility = View.GONE
            tvii4b15.visibility = View.GONE
            tvii4b16.visibility = View.GONE
            tvii4b17.visibility = View.GONE
            tvii4b18.visibility = View.GONE
            tvii4b19.visibility = View.GONE
            tvii4c1.visibility = View.GONE
            tvii4c2.visibility = View.GONE
            tvii4c3.visibility = View.GONE
            tvii4c4.visibility = View.GONE
            tvii5a.visibility = View.GONE
            tvii5b.visibility = View.GONE
            tvii5c.visibility = View.GONE
            tvii5d.visibility = View.GONE
            tvii5e.visibility = View.GONE
            tvii5f.visibility = View.GONE
            tvii6a.visibility = View.GONE
            tvii6b.visibility = View.GONE
            tvii6c.visibility = View.GONE
            tvii6d.visibility = View.GONE
            tvii6e.visibility = View.GONE
            tvii6f.visibility = View.GONE
            tvii6g.visibility = View.GONE
            tvii7a.visibility = View.GONE
            tvii7b.visibility = View.GONE
            tvii7c.visibility = View.GONE
            tvii8a.visibility = View.GONE
            tvii8b.visibility = View.GONE
            tvii8c.visibility = View.GONE
            tvii8d.visibility = View.GONE
            tvii8e.visibility = View.GONE
            tvii8f.visibility = View.GONE
            tvii8g.visibility = View.GONE
            tvii8h.visibility = View.GONE
            tvii8i.visibility = View.GONE
            tvii8j.visibility = View.GONE
            tvii9.visibility = View.GONE
        }
    }

    private fun stopPlayer(){
        if (mediaPlayer != null){
            mediaPlayer?.stop()
        }
    }

}
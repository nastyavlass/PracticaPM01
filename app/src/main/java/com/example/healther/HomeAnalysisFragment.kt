package com.example.healther

import android.os.Bundle
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.MediaController
import com.example.healther.databinding.FragmentHomeAnalysisBinding

class HomeAnalysisFragment : Fragment() {
    lateinit var binding: FragmentHomeAnalysisBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeAnalysisBinding.inflate(inflater, container, false)
        val path = "android.resource://com.example.healther/" + R.raw.v_gif
        binding.videoView.setVideoURI(Uri.parse(path))
        binding.videoView.setOnPreparedListener{ mp ->
            mp.setOnVideoSizeChangedListener { mp, width, height ->
                val mc = MediaController(context)
                binding.videoView.setMediaController(mc)
                mc.setAnchorView(binding.videoView)
            }
        }
        binding.videoView.start()
        return binding.root
    }
}

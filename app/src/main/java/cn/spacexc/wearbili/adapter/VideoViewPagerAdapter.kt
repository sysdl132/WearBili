package cn.spacexc.wearbili.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import cn.spacexc.wearbili.fragment.CommentFragment
import cn.spacexc.wearbili.fragment.VideoInfoFragment
import cn.spacexc.wearbili.fragment.VideoPlayingFragment

/**
 * Created by XC-Qan on 2022/6/12.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

class VideoViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> VideoInfoFragment()
            1 -> VideoPlayingFragment()
            2 -> CommentFragment()
            else -> VideoInfoFragment()
        }
    }
}
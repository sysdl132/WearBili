package cn.spacexc.wearbili.activity.other

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.spacexc.wearbili.R
import cn.spacexc.wearbili.activity.MainActivity
import cn.spacexc.wearbili.activity.bangumi.BangumiTimeLineActivity
import cn.spacexc.wearbili.activity.search.SearchActivity
import cn.spacexc.wearbili.activity.video.VideoCacheActivity
import cn.spacexc.wearbili.activity.video.VideoRankingActivity
import cn.spacexc.wearbili.adapter.ButtonsAdapter
import cn.spacexc.wearbili.dataclass.RoundButtonData
import cn.spacexc.wearbili.listener.OnItemViewClickListener


class MenuActivity : AppCompatActivity() {
    private val buttonList = listOf(
        RoundButtonData(R.drawable.ic_outline_home_24, "首页", "首页"),
        RoundButtonData(R.drawable.ic_baseline_person_outline_24, "我的", "我的"),
        RoundButtonData(R.drawable.mode_fan, "动态", "动态"),
        RoundButtonData(R.drawable.ic_baseline_search_24, "搜索", "搜索"),
        RoundButtonData(R.drawable.cloud_download, "缓存", "缓存"),
        RoundButtonData(R.drawable.local_fire_department, "热门", "热门"),
        RoundButtonData(R.drawable.ic_baseline_movie_24, "番剧", "番剧"),
        RoundButtonData(R.drawable.ic_outline_info_24, "关于", "关于")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        //activity = intent.getParcelableExtra("this")
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2).also {
            it.orientation = GridLayoutManager.VERTICAL
        }
        recyclerView.adapter =
            ButtonsAdapter(false, object : OnItemViewClickListener {
                override fun onClick(buttonName: String, viewHolder: RecyclerView.ViewHolder) {
                    when (buttonName) {
                        "首页" -> {
                            MainActivity.currentPageId.value =
                                R.id.recommendFragment; finish(); overridePendingTransition(
                                R.anim.activity_in_y,
                                R.anim.activity_out_y
                            )
                        }
                        "动态" -> {
                            MainActivity.currentPageId.value =
                                R.id.dynamicFragment; finish(); overridePendingTransition(
                                R.anim.activity_in_y,
                                R.anim.activity_out_y
                            )
                        }
                        "我的" -> {
                            MainActivity.currentPageId.value =
                                R.id.profileFragment; finish(); overridePendingTransition(
                                R.anim.activity_in_y,
                                R.anim.activity_out_y
                            )
                        }
                        "番剧" -> {
                            Intent(this@MenuActivity, BangumiTimeLineActivity::class.java).apply {
                                startActivity(this)
                                finish()
                                overridePendingTransition(
                                    R.anim.activity_in_y,
                                    R.anim.activity_out_y
                                )
                            }
                        }
                        "搜索" -> {
                            val intent = Intent(
                                this@MenuActivity,
                                SearchActivity::class.java
                            ); overridePendingTransition(
                                R.anim.activity_in_y,
                                R.anim.activity_out_y
                            )
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                            finish()
                            overridePendingTransition(R.anim.activity_in_y, R.anim.activity_out_y)
                        }
                        "关于" -> {
                            val intent = Intent(this@MenuActivity, AboutActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                            finish()
                            overridePendingTransition(R.anim.activity_in_y, R.anim.activity_out_y)
                        }
                        "热门" -> {
                            val intent = Intent(this@MenuActivity, VideoRankingActivity::class.java)
                            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
                            startActivity(intent)
                            finish()
                            overridePendingTransition(R.anim.activity_in_y, R.anim.activity_out_y)
                        }
                        "缓存" -> {
                            val intent =
                                Intent(this@MenuActivity, VideoCacheActivity::class.java)
                            startActivity(intent)
                            finish()
                            overridePendingTransition(
                                R.anim.activity_in_y,
                                R.anim.activity_out_y
                            )
                        }
                        "测试" -> {
                            /*val data: Uri =
                                Uri.parse("bilibili://video/428340116?player_height=1080&player_rotate=0&player_width=1920")
                            val intent = Intent(Intent.ACTION_VIEW, data)
                            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                            try {
                                startActivity(intent)
                            } catch (e: Exception) {
                                e.printStackTrace()
                                ToastUtils.makeText(
                                    "没有匹配的APP，请下载安装"
                                ).show()
                            }*/
                            /*Intent(this@MenuActivity, BangumiActivity::class.java).apply {
                                putExtra("id", "835")
                                putExtra("idType", ID_TYPE_SSID)
                                startActivity(this)
                                finish()
                            }*/
                            //startActivity(Intent(this@MenuActivity, SubtitleTestActivity::class.java))
                        }
                    }
                }

                override fun onLongClick(buttonName: String, viewHolder: RecyclerView.ViewHolder) {

                }

            }).also {
                it.submitList(buttonList)
            }
        findViewById<TextView>(R.id.pageName).setOnClickListener {
            finish()
            overridePendingTransition(R.anim.activity_in_y, R.anim.activity_out_y)
        }

//        lifecycleScope.launch {
//            while (true) {
//                findViewById<TextView>(R.id.timeText).text = TimeUtils.getCurrentTime()
//                delay(500)
//            }
//        }
    }
}
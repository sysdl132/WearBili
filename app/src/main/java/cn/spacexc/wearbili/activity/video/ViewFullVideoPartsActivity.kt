package cn.spacexc.wearbili.activity.video

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cn.spacexc.wearbili.R
import cn.spacexc.wearbili.adapter.VideoPartsAdapter
import cn.spacexc.wearbili.dataclass.VideoPages
import cn.spacexc.wearbili.utils.TimeUtils
import com.google.gson.Gson
import kotlinx.coroutines.delay

class ViewFullVideoPartsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_full_video_parts)
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val pageName = findViewById<TextView>(R.id.pageName)
        val timeText = findViewById<TextView>(R.id.timeText)
        val data = Gson().fromJson(intent.getStringExtra("data"), VideoPages::class.java)
//        val data = intent.getParcelableExtra<VideoPages>("data")
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =
            VideoPartsAdapter(intent.getStringExtra("bvid")!!).also { it.submitList(data?.data?.toList()) }
        pageName.text = "查看全部 (${data?.data?.size})"
        pageName.setOnClickListener { finish() }
        lifecycleScope.launchWhenCreated {
            while (true) {
                timeText.text = TimeUtils.getCurrentTime()
                delay(500)
            }
        }
    }
}
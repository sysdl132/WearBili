package cn.spacexc.wearbili.dataclass.dynamic.dynamicepisode

data class EpisodeCard(
    val aid: Int,
    val apiSeasonInfo: ApiSeasonInfo,
    val bullet_count: Int,
    val cover: String,
    val episode_id: Int,
    val index: String,
    val index_title: String,
    val new_desc: String,
    val online_finish: Int,
    val play_count: Int,
    val reply_count: Int,
    val url: String
)
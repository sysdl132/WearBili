package cn.spacexc.wearbili.dataclass.watchlater

data class WatchLaterListObject(
    val add_at: Int,
    val aid: Int,
    val bvid: String,
    val cid: Int,
    val copyright: Int,
    val count: Int,
    val ctime: Int,
    val desc: String,
    val dimension: Dimension,
    val duration: Int,
    val `dynamic`: String,
    val first_frame: String?,
    val mission_id: Int?,
    val owner: Owner,
    val page: Page,
    val pic: String,
    val progress: Int,
    val pub_location: String?,
    val pubdate: Int,
    val rights: Rights,
    val season_id: Int?,
    val short_link_v2: String,
    val stat: Stat,
    val state: Int,
    val tid: Int,
    val title: String,
    val tname: String,
    val up_from_v2: Int?,
    val uri: String,
    val videos: Int,
    val viewed: Boolean
)
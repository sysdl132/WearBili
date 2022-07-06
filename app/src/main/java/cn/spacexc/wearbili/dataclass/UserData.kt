package cn.spacexc.wearbili.dataclass

data class UserData(
    val birthday: String,
    val coins: Int,
    val face: String,
    val face_nft: Int,
    val face_nft_type: Int,
    val fans_badge: Boolean,
    val fans_medal: UserFansMedal,
    val is_followed: Boolean,
    val is_senior_member: Int,
    val jointime: Int,
    val level: Int,
    val live_room: UserLiveRoom,
    val mcn_info: Any?,
    val mid: Long,
    val moral: Int,
    val name: String,
    val nameplate: UserNameplate,
    val official: UserOfficial,
    val pendant: UserPendant,
    val profession: UserProfession,
    val rank: Int,
    val school: Any?,
    val series: UserSeries,
    val sex: String,
    val sign: String,
    val silence: Int,
    val sys_notice: UserSysNotice,
    val tags: Any?,
    val theme: UserTheme,
    val top_photo: String,
    val user_honour_info: UserHonourInfo,
    val vip: UserVip
)
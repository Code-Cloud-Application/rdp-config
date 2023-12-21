package cloud.computer.enumeration;

/**
 * 确定连接是否会使用 RDP 高效多媒体流式处理进行视频播放。
 */
public enum VideoPlaybackMode {
    /**
     * 不使用 RDP 高效多媒体流进行视频播放。
     */
    NO_MEDIA_STREAM,
    /**
     * 使用 RDP 高效多媒体流进行视频播放。
     */
    USE_MEDIA_STREAM
}

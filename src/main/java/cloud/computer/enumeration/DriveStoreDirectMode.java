package cloud.computer.enumeration;

/**
 * 确定本地计算机上将被重定向并在远程会话中可用的磁盘驱动器。
 * @author 等陌上花开
 * @since 1.0.0
 */
public enum DriveStoreDirectMode {
    /**
     * 未指定值：不重定向任何驱动器。
     */
    NOT_SPECIFIED,
    /**
     * *：重定向所有磁盘驱动器，包括稍后连接的驱动器。
     */
    REDIRECT_ALL,
    /**
     * DynamicDrives：重定向稍后连接的所有驱动器。
     */
    REDIRECT_DYNAMIC,
    /**
     * 驱动器以及一个或多个驱动器的标签，例如 drivestoredirect:s:C\:;E\:;，重定向指定的驱动器。
     */
    SPECIFIC_DRIVES,
}

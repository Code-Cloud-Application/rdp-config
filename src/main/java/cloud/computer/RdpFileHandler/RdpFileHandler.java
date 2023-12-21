package cloud.computer.RdpFileHandler;

import cloud.computer.enumeration.*;

/**
 * RDP 文件配置实体
 * @author 等陌上花开
 * @version 1.0.0
 * @since 1.0.0
 */
public interface RdpFileHandler {
    /**
     * 加载配置文件
     */
    void load();

    /**
     * 获取 Windows 组合快捷键的应用选项
     * @return Windows 组合快捷键的应用选项
     */
    KeyboardHookedOption getKeyboardHookedOption();

    /**
     * 设置 Windows 组合快捷键的应用选项
     * @param keyboardHookedOption Windows 组合快捷键的应用选项
     */
    void setKeyboardHookedOption(KeyboardHookedOption keyboardHookedOption);

    /**
     * 取出默认远程会话的显示模式。
     * @return 远程会话显示模式
     */
    ScreenMode getScreenMode();
    /**
     * 设置默认远程会话的显示模式。
     * @param screenMode 远程会话显示模式
     */
    void setScreenMode(ScreenMode screenMode);
    /**
     * 获取是否使用多个监视器
     *
     * @return 如果使用多个监视器，则返回true；否则返回false
     */
    boolean getUseMultipleMonitors();

    /**
     * 设置是否使用多个监视器
     *
     * @param useMultipleMonitors 是否使用多个监视器的值
     */
    void setUseMultipleMonitors(boolean useMultipleMonitors);
    /**
     * 获取用户名
     *
     * @return 返回用户名
     */
    String getUsername();

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    void setUserName(String username);

    /**
     * 取出默认远程会话的显示宽度。
     * @return 远程会话显示宽度
     */
    int getDesktopWidth();
    /**
     * 设置默认远程会话的显示宽度。
     * @param width 远程会话显示宽度
     */
    void setDesktopWidth(int width);
    /**
     * 取出默认远程会话的显示高度。
     * @return 远程会话显示高度
     */
    int getDesktopHeight();
    /**
     * 设置默认远程会话的显示高度。
     * @param height 远程会话显示高度
     */
    void setDesktopHeight(int height);
    /**
     * 取出默认远程会话的显示颜色深度。
     * @return 远程会话显示颜色深度
     */
    ColorDepth getColorDepth();
    /**
     * 设置默认远程会话的显示颜色深度。
     * @param colorDepth 远程会话显示颜色深度
     */
    void setColorDepth(ColorDepth colorDepth);
    /**
     * 取出默认远程会话是否启用压缩。
     * @return 远程会话是否启用压缩
     */
    boolean getEnableCompression();
    /**
     * 设置默认远程会话是否启用压缩。
     * @param enableCompression 远程会话是否启用压缩
     */
    void setEnabledCompression(boolean enableCompression);

    /**
     * 设置远程音频录制模式
     * @return 远程音频录制模式
     */
    AudioCaptureMode getAudioCaptureMode();

    /**
     * 设置远程音频录制模式
     * @param audioCaptureMode 远程音频录制模式
     */
    void setAudioCaptureMode(AudioCaptureMode audioCaptureMode);

    /**
     * 取回远程视频播放模式
     * @return 远程视频播放模式
     */
    VideoPlaybackMode getVideoPlaybackMode();
    /**
     * 设置远程视频播放模式
     * @param videoPlaybackMode 远程视频播放模式
     */
    void setVideoPlaybackMode(VideoPlaybackMode videoPlaybackMode);

    /**
     * 取回连接质量（类型）选项
     * @return 连接质量（类型）选项
     */
    ConnectionType getConnectionType();

    /**
     * 设置连接质量（类型）选项
     * @param connectionType 连接质量（类型）选项
     */
    void setConnectionType(ConnectionType connectionType);

    /**
     * 取回是否自动检测网络连接的值。
     * @return 是否自动检测网络连接
     */
    boolean getEnableNetworkAutoDetect();

    /**
     * 设置是否自动检测网络连接的值
     * @param enableNetworkAutoDetect 是否自动检测网络连接
     */
    void setEnableNetworkAutoDetect(boolean enableNetworkAutoDetect);

    /**
     * 取回是否自动检测带宽的值
     * @return 是否自动检测带宽
     */
    boolean getEnableBandwidthAutoDetect();

    /**
     * 设置是否自动检测带宽的值
     * @param enableBandwidthAutoDetect 是否自动检测带宽
     */
    void setEnableBandwidthAutoDetect(boolean enableBandwidthAutoDetect);

    /**
     * 取回是否显示连接信息栏
     * @return 是否显示连接信息栏
     */
    boolean getDisplayConnectionBar();

    /**
     * 设置是否显示连接信息栏
     * @param displayConnectionBar 是否显示连接信息栏
     */
    void setDisplayConnectionBar(boolean displayConnectionBar);

    /**
     * 取回是否重新连接工作空间
     * @return 是否重新连接工作空间
     */
    boolean getEnableWorkspaceReconnect();

    /**
     * 设置是否重新连接工作空间
     * @param enableWorkspaceReconnect 是否重新连接工作空间
     */
    void setEnabledWorkspaceReconnect(boolean enableWorkspaceReconnect);

    /**
     * 获取是否启用壁纸
     *
     * @return 返回是否启用壁纸的状态
     */
    boolean getEnableWallpaper();

    /**
     * 设置是否启用壁纸
     *
     * @param enableWallpaper 是否启用壁纸
     */
    void setEnableWallpaper(boolean enableWallpaper);

    /**
     * 获取是否允许字体平滑处理
     *
     * @return 返回是否允许字体平滑处理的状态
     */
    boolean getAllowFontSmoothing();

    /**
     * 设置是否允许字体平滑处理
     *
     * @param allowFontSmoothing 是否允许字体平滑处理
     */
    /**
     * 设置是否允许字体平滑
     * @param allowFontSmoothing 是否允许字体平滑
     */
    void setAllowFontSmoothing(boolean allowFontSmoothing);

    /**
     * 获取是否允许桌面组合
     * @return 是否允许桌面组合
     */
    boolean getAllowDesktopComposition();

    /**
     * 设置是否允许全窗口拖拽
     * @param allowDesktopComposition 是否允许全窗口拖拽
     */
    void setAllowDesktopComposition(boolean allowDesktopComposition);

    /**
     * 获取是否允许菜单动画
     * @return 是否允许菜单动画
     */
    boolean getEnableFullWindowDrag();

    /**
     * 设置是否允许菜单动画
     * @param enableFullWindowDrag 是否允许菜单动画
     */
    void setEnableFullWindowDrag(boolean enableFullWindowDrag);

    /**
     * 获取是否允许主题动画
     * @return 是否允许主题动画
     */
    boolean getEnableMenuAnims();

    /**
     * 设置是否允许主题动画
     * @param enableMenuAnims 是否允许主题动画
     */
    void setEnableMenuAnims(boolean enableMenuAnims);

    /**
     * 获取是否允许使用主题
     * @return 是否允许使用主题
     */
    boolean getEnableThemes();

    /**
     * 设置是否允许使用主题
     * @param enableThemes 是否允许使用主题
     */
    void setEnableThemes(boolean enableThemes);

    /**
     * 获取是否允许使用光标设置
     * @return 是否允许使用光标设置
     */
    boolean getEnableCursorSettings();

    /**
     * 设置是否允许使用光标设置
     * @param enableCursorSettings 是否允许使用光标设置
     */
    void setEnableCursorSettings(boolean enableCursorSettings);

    /**
     * 获取是否允许位图缓存持久化
     * @return 是否允许位图缓存持久化
     */
    boolean getBitmapCachePersistenable();

    /**
     * 设置位图缓存是否可持久化
     * @param bitmapCachePersistenable 是否可持久化
     */
    void setBitmapCachePersistenable(boolean bitmapCachePersistenable);

    /**
     * 获取完整的远程给计算机地址
     * @return 完整的远程计算机地址
     */
    String getFullAddress();

    /**
     * 设置完整的远程计算机地址
     * @param fullAddress 完整的远程计算机地址
     */
    void setFullAddress(String fullAddress);

    /**
     * 获取远程音频播放模式
     * @return 远程音频播放模式
     */
    AudioMode getAudioMode();

    /**
     * 设置远程音频播放模式
     * @param audioMode 远程音频播放模式
     */
    void setAudioMode(AudioMode audioMode);

    /**
     * 获取是否启用重定向打印机
     * @return 是否启用重定向打印机
     */
    boolean getEnableRedirectPrinters();

    /**
     * 设置是否启用重定向打印机
     * @param enableRedirectPrinters 是否启用重定向打印机
     */
    void setEnableRedirectPrinters(boolean enableRedirectPrinters);

    /**
     * 获取是否启用重定向位置
     * @return 是否启用重定向位置
     */
    boolean getEnableRedirectLocations();

    /**
     * 设置是否启用重定向位置
     * @param enableRedirectLocations 是否启用重定向位置
     */
    void setEnableRedirectLocations(boolean enableRedirectLocations);

    /**
     * 获取是否启用重定向COM端口
     * @return 是否启用重定向COM端口
     */
    boolean getEnableRedirectCOMPorts();

    /**
     * 设置是否启用重定向COM端口
     * @param enableRedirectCOMPorts 是否启用重定向COM端口
     */
    void setEnableRedirectCOMPorts(boolean enableRedirectCOMPorts);

    /**
     * 获取是否启用重定向智能卡
     * @return 是否启用重定向智能卡
     */
    boolean getEnableRedirectSmartCards();

    /**
     * 设置是否启用重定向智能卡
     * @param enableRedirectSmartCards 是否启用重定向智能卡
     */
    void setEnableRedirectSmartCards(boolean enableRedirectSmartCards);

    /**
     * 获取是否启用重定向剪贴板
     * @return 是否启用重定向剪贴板
     */
    boolean getEnableRedirectClipboard();

    /**
     * 设置是否启用重定向剪贴板
     * @param enableRedirectClipboard 是否启用重定向剪贴板
     */
    void setEnableRedirectClipboard(boolean enableRedirectClipboard);

    /**
     * 获取是否启用重定向WebAuthn
     * @return 是否启用重定向WebAuthn
     */
    boolean getEnableRedirectWebAuthn();

    /**
     * 设置是否启用重定向WebAuthn
     * @param enableRedirectWebAuthn 是否启用重定向WebAuthn
     */
    void setEnableRedirectWebAuthn(boolean enableRedirectWebAuthn);

    /**
     * 获取是否启用重定向POS设备
     * @return 是否启用重定向POS设备
     */
    boolean getEnableRedirectPosDevices();

    /**
     * 设置是否启用重定向POS设备
     * @param enableRedirectPosDevices 是否启用重定向POS设备
     */
    void setEnableRedirectPosDevices(boolean enableRedirectPosDevices);

    /**
     * 获取是否启用自动重新连接
     * @return 是否启用自动重新连接
     */
    boolean getEnableAutoReconnection();

    /**
     * 设置是否启用自动重新连接
     * @param enableAutoReconnection 是否启用自动重新连接
     */
    void setEnableAutoReconnection(boolean enableAutoReconnection);

    /**
     * 获取身份验证级别
     * @return 身份验证级别
     */
    AuthenticationLevel getAuthenticationLevel();

    /**
     * 设置身份验证级别
     * @param authenticationLevel 身份验证级别
     */
    void setAuthenticationLevel(AuthenticationLevel authenticationLevel);

    /**
     * 获取远程应用程序模式
     * @return 远程应用程序模式
     */
    RemoteApplicationMode getRemoteApplicationMode();

    /**
     * 设置远程应用程序模式
     * @param remoteApplicationMode 远程应用程序模式
     */
    void setRemoteApplicationMode(RemoteApplicationMode remoteApplicationMode);

    /**
     * 获取网关主机名
     * @return 网关主机名
     */
    String getGatewayHostname();

    /**
     * 设置网关主机名
     * @param gatewayHostname 网关主机名
     */
    void setGatewayHostname(String gatewayHostname);

    /**
     * 获取网关使用方法
     * @return 网关使用方法
     */
    GatewayUsageMethod getGatewayUsageMethod();

    /**
     * 设置网关使用方法
     * @param gatewayUsageMethod 网关使用方法
     */
    void setGatewayUsageMethod(GatewayUsageMethod gatewayUsageMethod);

    /**
     * 取回是否保存用户的凭据并将其用于 RD 网关和远程计算机。
     * @return 是否保存用户的凭据并将其用于 RD 网关和远程计算机。如果返回 true，则表示
     * 远程会话将使用相同的凭据，否则表示远程会话不使用相同的凭据。
     */
    boolean getEnabledPromptCredentialOnce();
    /**
     * 设置是否保存用户的凭据并将其用于 RD 网关和远程计算机。
     * @param enabledPromptCredentialOnce 是否保存用户的凭据并将其用于 RD 网关和远程计算机。如果为 true，则表示
     * 远程会话将使用相同的凭据，否则表示远程会话不使用相同的凭据。
     */
    void setEnabledPromptCredentialOnce(boolean enabledPromptCredentialOnce);
    /**
     * 获取驱动器重定向模式
     * @return 驱动器重定向模式
     */
    DriveStoreDirectMode getDriveStoreDirectMode();

    /**
     * 获取被重定向的驱动器的列表
     *
     * @return 被重定向的驱动器的列表
     */
    String[] getRedirectedDrives();

    /**
     * 设置驱动器重定向模式并映射驱动器
     *
     * @param driveStoreDirectMode 驱动器重定向模式
     */
    void setDriveStoreDirectMode(DriveStoreDirectMode driveStoreDirectMode, String... drives);




}

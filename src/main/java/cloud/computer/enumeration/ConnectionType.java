package cloud.computer.enumeration;

/**
 * 连接类型。对应 RDP 中的“选择连接类型来优化性能”选项。
 */
public enum ConnectionType {
    /**
     * 调制解调器。
     */
    MODEM,
    /**
     * 低速宽带。
     */
    LOW_SPEED_BROADBAND,
    /**
     * 卫星。
     */
    SATELLITE,
    /**
     * 高速宽带。
     */
    HIGH_SPEED_BROADBAND,
    /**
     * WAN。
     */
    WAN,
    /**
     * LAN。
     */
    LAN,
    /**
     * 自动检测连接质量。
     */
    AUTO_DETECT
}

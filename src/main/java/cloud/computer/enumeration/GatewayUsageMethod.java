package cloud.computer.enumeration;

/**
 * 指定何时将 RD 网关用于连接。
 * @author 等陌上花开
 */
public enum GatewayUsageMethod {
    /**
     * 不使用 RD 网关。
。   */
    DISABLED,
    /**
     * 始终使用 RD 网关。
     */
    ALWAYS_ENABLED,
    /**
     * 在无法与 RD 会话主机建立直接连接的情况下使用 RD 网关。
     */
    USE_IF_NEEDED,
    /**
     * 使用默认 RD 网关设置。
     */
    USE_DEFAULT,
    /**
     * 不使用 RD 网关，绕过本地地址的网关。
     */
    BYPASS_LOCAL,
}

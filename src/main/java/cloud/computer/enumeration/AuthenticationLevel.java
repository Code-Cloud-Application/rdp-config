package cloud.computer.enumeration;

/**
 * 服务器身份验证级别设置。
 * @author 等陌上花开
 */
public enum AuthenticationLevel {
    /**
     * 如果服务器身份验证失败，在不显示警告的情况下连接到计算机
     */
    CONNECT_WITHOUT_WARNING,
    /**
     * 如果服务器身份验证失败，不要建立连接
     */
    REFUSE_CONNECTION,
    /**
     * 如果服务器身份验证失败，显示警告并选择进行连接或拒绝连接
     */
    PROMPT_USER,
    /**
     * 未指定身份验证要求
     */
    UNSPECIFIED;
}

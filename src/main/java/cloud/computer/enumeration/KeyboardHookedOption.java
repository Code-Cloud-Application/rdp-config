package cloud.computer.enumeration;

/**
 * Windows 组合键应用的位置
 */
public enum KeyboardHookedOption {
    /**
     * 仅在本地计算机上应用 Windows 组合键。
     * 当应用此选项时，在远程桌面运行时，使用 Windows 组合键只会在本地计算机上生效。
     */
    ON_LOCAL_COMPUTER,
    /**
     * 仅在远程计算机上应用 Windows 组合键。
     * 当应用此选项时，在远程桌面运行时，使用 Windows 组合键只会在远程计算机上生效。
     */
    ON_REMOVE_COMPUTER,
    /**
     * 仅在全屏模式下应用 Windows 组合键。
     * 当应用此选项时，在远程桌面运行时，使用 Windows 组合键只会在全屏模式下生效。
     */
    ONLY_FULL_SCREEN
}

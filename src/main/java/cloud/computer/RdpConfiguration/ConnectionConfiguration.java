package cloud.computer.RdpConfiguration;

import cloud.computer.enumeration.ColorDepth;
import cloud.computer.enumeration.ScreenMode;

/**
 * @author 等陌上花开
 */
public interface ConnectionConfiguration {
    default ScreenMode getScreenMode(){
        return ScreenMode.FULL_SCREEN;
    }
    default boolean getUseMultipleMonitor(){
        return false;
    }
    default int getDesktopWidth(){
        return 0;
    }
    default int getDesktopHeight(){
        return 0;
    }
    default ColorDepth getColorDepth(){
        return ColorDepth.HIGHEST_QUALITY;
    }

    default boolean getDisplayConnectionBar(){
        return true;
    }


}

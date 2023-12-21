package cloud.computer.RdpConfiguration;

import cloud.computer.enumeration.AudioCaptureMode;
import cloud.computer.enumeration.AudioMode;
import cloud.computer.enumeration.DriveStoreDirectMode;
import cloud.computer.enumeration.KeyboardHookedOption;

/**
 * @author 等陌上花开
 */
public interface LocalResourceConfiguration {
    default AudioMode getAudioMode(){
        return AudioMode.PLAY_ON_LOCAL_COMPUTER;
    }

    default AudioCaptureMode getAudioCaptureMode(){
        return AudioCaptureMode.CAPTURE_FROM_LOCAL_COMPUTER;
    }

    default KeyboardHookedOption getKeyboardHookedOption(){
        return KeyboardHookedOption.ONLY_FULL_SCREEN;
    }

    default boolean getEnableRedirectClipboard(){
        return true;
    }

    default boolean getEnableRedirectPrinters(){
        return true;
    }

    default boolean getEnableRedirectLocations(){
        return true;
    }

    default boolean getEnableRedirectCOMPorts(){
        return true;
    }

    default boolean getEnableRedirectSmartCards(){
        return true;
    }

    default boolean getEnableRedirectWebAuthn(){
        return true;
    }

    default DriveStoreDirectMode getDriveStoreDirectMode(){
        return DriveStoreDirectMode.NOT_SPECIFIED;
    }

    default String[] getRedirectedDrives(){
        return null;
    }

    default boolean getEnableRedirectPosDevices(){
        return true;
    }



}

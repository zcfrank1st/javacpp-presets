// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394.dc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * A structure containing all information about a feature.
 *
 * Some fields are only valid for some features (e.g. trigger, white balance,...)
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394feature_info_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394feature_info_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394feature_info_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394feature_info_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394feature_info_t position(long position) {
        return (dc1394feature_info_t)super.position(position);
    }

    public native @Cast("dc1394feature_t") int id(); public native dc1394feature_info_t id(int id);
    public native @Cast("dc1394bool_t") int available(); public native dc1394feature_info_t available(int available);
    public native @Cast("dc1394bool_t") int absolute_capable(); public native dc1394feature_info_t absolute_capable(int absolute_capable);
    public native @Cast("dc1394bool_t") int readout_capable(); public native dc1394feature_info_t readout_capable(int readout_capable);
    public native @Cast("dc1394bool_t") int on_off_capable(); public native dc1394feature_info_t on_off_capable(int on_off_capable);
    public native @Cast("dc1394bool_t") int polarity_capable(); public native dc1394feature_info_t polarity_capable(int polarity_capable);
    public native @Cast("dc1394switch_t") int is_on(); public native dc1394feature_info_t is_on(int is_on);
    public native @Cast("dc1394feature_mode_t") int current_mode(); public native dc1394feature_info_t current_mode(int current_mode);
    public native @ByRef dc1394feature_modes_t modes(); public native dc1394feature_info_t modes(dc1394feature_modes_t modes);
    public native @ByRef dc1394trigger_modes_t trigger_modes(); public native dc1394feature_info_t trigger_modes(dc1394trigger_modes_t trigger_modes);
    public native @Cast("dc1394trigger_mode_t") int trigger_mode(); public native dc1394feature_info_t trigger_mode(int trigger_mode);
    public native @Cast("dc1394trigger_polarity_t") int trigger_polarity(); public native dc1394feature_info_t trigger_polarity(int trigger_polarity);
    public native @ByRef dc1394trigger_sources_t trigger_sources(); public native dc1394feature_info_t trigger_sources(dc1394trigger_sources_t trigger_sources);
    public native @Cast("dc1394trigger_source_t") int trigger_source(); public native dc1394feature_info_t trigger_source(int trigger_source);
    public native @Cast("uint32_t") int min(); public native dc1394feature_info_t min(int min);
    public native @Cast("uint32_t") int max(); public native dc1394feature_info_t max(int max);
    public native @Cast("uint32_t") int value(); public native dc1394feature_info_t value(int value);
    public native @Cast("uint32_t") int BU_value(); public native dc1394feature_info_t BU_value(int BU_value);
    public native @Cast("uint32_t") int RV_value(); public native dc1394feature_info_t RV_value(int RV_value);
    public native @Cast("uint32_t") int B_value(); public native dc1394feature_info_t B_value(int B_value);
    public native @Cast("uint32_t") int R_value(); public native dc1394feature_info_t R_value(int R_value);
    public native @Cast("uint32_t") int G_value(); public native dc1394feature_info_t G_value(int G_value);
    public native @Cast("uint32_t") int target_value(); public native dc1394feature_info_t target_value(int target_value);

    public native @Cast("dc1394switch_t") int abs_control(); public native dc1394feature_info_t abs_control(int abs_control);
    public native float abs_value(); public native dc1394feature_info_t abs_value(float abs_value);
    public native float abs_max(); public native dc1394feature_info_t abs_max(float abs_max);
    public native float abs_min(); public native dc1394feature_info_t abs_min(float abs_min);

}
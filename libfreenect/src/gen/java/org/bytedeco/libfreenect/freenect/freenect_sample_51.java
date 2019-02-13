// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.libfreenect.freenect;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libfreenect.global.freenect.*;

// #endif

/** Structure to represent a single 16-bit signed little-endian PCM sample. */
@Properties(inherit = org.bytedeco.libfreenect.presets.freenect.class)
public class freenect_sample_51 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public freenect_sample_51() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public freenect_sample_51(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public freenect_sample_51(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public freenect_sample_51 position(long position) {
        return (freenect_sample_51)super.position(position);
    }

	public native short left(); public native freenect_sample_51 left(short left);
	public native short right(); public native freenect_sample_51 right(short right);
	public native short center(); public native freenect_sample_51 center(short center);
	public native short lfe(); public native freenect_sample_51 lfe(short lfe);
	public native short surround_left(); public native freenect_sample_51 surround_left(short surround_left);
	public native short surround_right(); public native freenect_sample_51 surround_right(short surround_right);
}
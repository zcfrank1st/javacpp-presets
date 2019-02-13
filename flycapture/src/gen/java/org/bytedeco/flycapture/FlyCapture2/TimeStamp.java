// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Timestamp information. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class TimeStamp extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public TimeStamp(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public TimeStamp(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public TimeStamp position(long position) {
            return (TimeStamp)super.position(position);
        }
    
        /** Seconds. */
        public native long seconds(); public native TimeStamp seconds(long seconds);
        /** Microseconds. */
        public native @Cast("unsigned int") int microSeconds(); public native TimeStamp microSeconds(int microSeconds);
        /** 1394 cycle time seconds. */
        public native @Cast("unsigned int") int cycleSeconds(); public native TimeStamp cycleSeconds(int cycleSeconds);
        /** 1394 cycle time count. */
        public native @Cast("unsigned int") int cycleCount(); public native TimeStamp cycleCount(int cycleCount);
        /** 1394 cycle time offset. */
        public native @Cast("unsigned int") int cycleOffset(); public native TimeStamp cycleOffset(int cycleOffset);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native TimeStamp reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public TimeStamp() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
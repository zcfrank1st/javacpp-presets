// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Properties of a single embedded image info property. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class EmbeddedImageInfoProperty extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EmbeddedImageInfoProperty(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public EmbeddedImageInfoProperty(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public EmbeddedImageInfoProperty position(long position) {
            return (EmbeddedImageInfoProperty)super.position(position);
        }
    
        /** Whether this property is available. */
        public native @Cast("bool") boolean available(); public native EmbeddedImageInfoProperty available(boolean available);
        /** Whether this property is on or off. */
        public native @Cast("bool") boolean onOff(); public native EmbeddedImageInfoProperty onOff(boolean onOff);

        public EmbeddedImageInfoProperty() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
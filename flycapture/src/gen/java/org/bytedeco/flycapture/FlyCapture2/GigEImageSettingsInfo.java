// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /** Format 7 information for a single mode. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class GigEImageSettingsInfo extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public GigEImageSettingsInfo(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public GigEImageSettingsInfo(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public GigEImageSettingsInfo position(long position) {
            return (GigEImageSettingsInfo)super.position(position);
        }
    
        /** Maximum image width. */
        public native @Cast("unsigned int") int maxWidth(); public native GigEImageSettingsInfo maxWidth(int maxWidth);
        /** Maximum image height. */
        public native @Cast("unsigned int") int maxHeight(); public native GigEImageSettingsInfo maxHeight(int maxHeight);
        /** Horizontal step size for the offset. */
        public native @Cast("unsigned int") int offsetHStepSize(); public native GigEImageSettingsInfo offsetHStepSize(int offsetHStepSize);
        /** Vertical step size for the offset. */
        public native @Cast("unsigned int") int offsetVStepSize(); public native GigEImageSettingsInfo offsetVStepSize(int offsetVStepSize);
        /** Horizontal step size for the image. */
        public native @Cast("unsigned int") int imageHStepSize(); public native GigEImageSettingsInfo imageHStepSize(int imageHStepSize);
        /** Vertical step size for the image. */
        public native @Cast("unsigned int") int imageVStepSize(); public native GigEImageSettingsInfo imageVStepSize(int imageVStepSize);
        /** Supported pixel formats in a bit field. */
        public native @Cast("unsigned int") int pixelFormatBitField(); public native GigEImageSettingsInfo pixelFormatBitField(int pixelFormatBitField);
        /** Vendor unique pixel formats in a bit field. */
        public native @Cast("unsigned int") int vendorPixelFormatBitField(); public native GigEImageSettingsInfo vendorPixelFormatBitField(int vendorPixelFormatBitField);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native GigEImageSettingsInfo reserved(int i, int reserved);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

        public GigEImageSettingsInfo() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
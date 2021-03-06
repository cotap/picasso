package com.squareup.picasso;

import android.graphics.Bitmap;

/** Image transformation Override */
public interface TransformationOverride {

  /**
   * Transform the source bitmap into a new bitmap. If you create a new bitmap instance, you must
   * call {@link android.graphics.Bitmap#recycle()} on {@code source}. You may return the original
   * if no transformation is required.
   */
  Bitmap transform(Request data, Bitmap bitmap, int exifRotation);

  /**
   * Returns a unique key for the transformation, used for caching purposes. If the transformation
   * has parameters (e.g. size, scale factor, etc) then these should be part of the key.
   */
  String key();

}

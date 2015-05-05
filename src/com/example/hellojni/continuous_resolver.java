/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.9
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.example.hellojni;

public class continuous_resolver {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected continuous_resolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(continuous_resolver obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lslAndroidJNI.delete_continuous_resolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public continuous_resolver(double forget_after) {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_0(forget_after), true);
  }

  public continuous_resolver() {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_1(), true);
  }

  public continuous_resolver(String prop, String value, double forget_after) {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_2(prop, value, forget_after), true);
  }

  public continuous_resolver(String prop, String value) {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_3(prop, value), true);
  }

  public continuous_resolver(String pred, double forget_after) {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_4(pred, forget_after), true);
  }

  public continuous_resolver(String pred) {
    this(lslAndroidJNI.new_continuous_resolver__SWIG_5(pred), true);
  }

  public vectorinfo results() {
    return new vectorinfo(lslAndroidJNI.continuous_resolver_results(swigCPtr, this), true);
  }

}

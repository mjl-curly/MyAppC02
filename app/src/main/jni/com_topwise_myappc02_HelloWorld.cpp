//
// Created by mojialiang on 2021/9/6.
//
#include "jni.h"
#include "com_topwise_myappc02_HelloWorld.h"

JNIEXPORT jstring JNICALL Java_com_topwise_myappc02_HelloWorld_sayHello
  (JNIEnv *env, jobject obj){

  return env->NewStringUTF("Hello World!");

}
















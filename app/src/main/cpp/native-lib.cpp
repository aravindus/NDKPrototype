#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_in_nic_nicprototype_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject SELF,
        char input) {
    std::string K1 = "c3e19d6d0393a93e";
    std::string NONE = "#m^&*#403954#m^&*039#454#m^&*#45";

    std::string init = "http://testing.spark.gov.in./servicetest/MobLeaveApp.ashx";//TEST


    std::string K2 = "14bfba49071c45d6";
    std::string V1 = "4271609d";
    std::string V2 = "9fd7f06d";
    std::string INK1 = "E08uwvblbcz5nYk";
    std::string INK2 = "wWWyA3Eb1dMupCwQX";
    std::string INV1 = "E08uwvblb";
    std::string INV2 = "cz5nYkw";


    if (input=='Y')
        return env->NewStringUTF((K1.append(K2)).c_str());
    else     if (input=='R')
        return env->NewStringUTF((V1.append(V2)).c_str());
    else  if (input=='I')
        return  env->NewStringUTF((init).c_str());

    else  if (input=='A')
        return env->NewStringUTF((INK1.append(INK2)).c_str());
    else  if (input=='B')
        return env->NewStringUTF((INV1.append(INV2)).c_str());

    else
        return env->NewStringUTF((NONE).c_str());
}

/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.sunos.templates
import org.lwjgl.generator.*
val dlfcn = "DynamicLinkLoader".nativeClass(Module.CORE_SUNOS, nativeSubPath = "sunos") {
    nativeImport("<dlfcn.h>")
    IntConstant("RTLD_LAZY"..0x00001, "RTLD_NOW"..0x00002, "RTLD_NOLOAD"..0x00004, "RTLD_GLOBAL"..0x00100, "RTLD_LOCAL"..0, "RTLD_PARENT"..0x00200, "RTLD_GROUP"..0x00400, "RTLD_WORLD"..0x00800, "RTLD_NODELETE"..0x01000, "RTLD_FIRST"..0x02000)
    opaque_p("dlopen", nullable..charUTF8.const.p("filename"), int("mode"))
    charUTF8.p("dlerror", void())
    opaque_p("dlsym", opaque_p("handle"), charASCII.const.p("name"))
    int("dlclose", opaque_p("handle"))
}

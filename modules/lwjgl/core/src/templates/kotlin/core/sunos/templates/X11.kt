/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
package core.sunos.templates
import org.lwjgl.generator.*
import core.sunos.*
val X11 = "X11".nativeClass(Module.CORE_SUNOS, nativeSubPath = "sunos", binding = simpleBinding(Module.CORE_SUNOS, "X11", libraryExpression = "null, \"libX11.so.6\", \"libX11.so\"")) {
    val DISPLAY = Display.p("display")
    Display.p("XOpenDisplay", nullable..charASCII.const.p("display_name"))
    void("XCloseDisplay", DISPLAY)
    int("XDefaultScreen", DISPLAY)
}

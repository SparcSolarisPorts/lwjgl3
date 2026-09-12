/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 */
#include <stddef.h>
#include <stdint.h>
#define DISABLE_WARNINGS() _Pragma("GCC diagnostic push") _Pragma("GCC diagnostic ignored \"-Wpedantic\"")
#define ENABLE_WARNINGS() _Pragma("GCC diagnostic pop")
#define JNIEXPORT_CRITICAL static
#define CRITICAL(function) _JavaCritical_##function

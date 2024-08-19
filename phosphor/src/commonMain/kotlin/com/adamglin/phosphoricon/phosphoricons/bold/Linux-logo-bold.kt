package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Linux-logo-bold`: ImageVector
    get() {
        if (`_linux-logo-bold` != null) {
            return `_linux-logo-bold`!!
        }
        `_linux-logo-bold` = Builder(name = "Linux-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.49f, 217.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.89f, -1.9f)
                curveTo(213.19f, 213.72f, 180.0f, 171.24f, 180.0f, 88.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, false, 76.0f, 88.0f)
                curveToRelative(0.0f, 83.24f, -33.21f, 125.72f, -34.62f, 127.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 22.6f, 200.53f)
                curveTo(23.0f, 200.0f, 52.0f, 162.06f, 52.0f, 88.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 152.0f, 0.0f)
                curveToRelative(0.0f, 74.19f, 29.1f, 112.16f, 29.4f, 112.54f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 231.49f, 217.38f)
                close()
                moveTo(104.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 120.0f)
                close()
                moveTo(168.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 168.0f, 104.0f)
                close()
                moveTo(95.26f, 155.0f)
                lineToRelative(28.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.45f, 0.0f)
                lineToRelative(28.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 151.26f, 133.0f)
                lineToRelative(-23.27f, 10.0f)
                lineToRelative(-23.27f, -10.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 95.26f, 155.0f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(57.12f, 57.12f, 0.0f, false, false, -38.66f, 15.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.23f, 17.69f)
                arcToRelative(32.86f, 32.86f, 0.0f, false, true, 44.85f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 16.23f, -17.69f)
                arcTo(57.1f, 57.1f, 0.0f, false, false, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return `_linux-logo-bold`!!
    }

private var `_linux-logo-bold`: ImageVector? = null

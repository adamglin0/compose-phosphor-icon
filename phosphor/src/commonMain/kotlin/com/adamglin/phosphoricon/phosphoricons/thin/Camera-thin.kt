package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Camera-thin`: ImageVector
    get() {
        if (`_camera-thin` != null) {
            return `_camera-thin`!!
        }
        `_camera-thin` = Builder(name = "Camera-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 60.0f)
                lineTo(178.13f, 60.0f)
                lineTo(163.32f, 37.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 36.0f)
                lineTo(96.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.32f, 1.78f)
                lineTo(77.85f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 80.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 60.0f)
                close()
                moveTo(220.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 68.0f)
                lineTo(80.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.33f, -1.78f)
                lineTo(98.13f, 44.0f)
                horizontalLineToRelative(59.72f)
                lineToRelative(14.82f, 22.22f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 176.0f, 68.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 40.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 128.0f, 92.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_camera-thin`!!
    }

private var `_camera-thin`: ImageVector? = null

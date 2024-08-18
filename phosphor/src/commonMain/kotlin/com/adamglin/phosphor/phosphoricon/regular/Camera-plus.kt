package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Camera-plus`: ImageVector
    get() {
        if (`_camera-plus` != null) {
            return `_camera-plus`!!
        }
        `_camera-plus` = Builder(name = "Camera-plus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(136.0f, 144.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 144.0f)
                lineTo(96.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(24.0f)
                lineTo(120.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 136.0f)
                close()
                moveTo(232.0f, 80.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(48.0f, 216.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(24.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 48.0f, 56.0f)
                lineTo(75.72f, 56.0f)
                lineTo(87.0f, 39.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.28f, 32.0f)
                horizontalLineToRelative(55.44f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 169.0f, 39.12f)
                lineTo(180.28f, 56.0f)
                lineTo(208.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 232.0f, 80.0f)
                close()
                moveTo(216.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(176.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.66f, -3.56f)
                lineTo(155.72f, 48.0f)
                lineTo(100.28f, 48.0f)
                lineTo(86.66f, 68.44f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 72.0f)
                lineTo(48.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(40.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(208.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_camera-plus`!!
    }

private var `_camera-plus`: ImageVector? = null

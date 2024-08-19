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

public val ThinGroup.`Camera-rotate-thin`: ImageVector
    get() {
        if (`_camera-rotate-thin` != null) {
            return `_camera-rotate-thin`!!
        }
        `_camera-rotate-thin` = Builder(name = "Camera-rotate-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(172.0f, 96.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(144.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(14.66f)
                lineToRelative(-5.27f, -5.52f)
                arcToRelative(36.12f, 36.12f, 0.0f, false, false, -47.0f, -3.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.8f, -6.39f)
                arcToRelative(44.17f, 44.17f, 0.0f, false, true, 57.51f, 4.09f)
                lineTo(164.0f, 110.0f)
                lineTo(164.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(155.2f, 157.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.8f, 5.6f)
                arcToRelative(44.15f, 44.15f, 0.0f, false, true, -57.51f, -4.09f)
                lineTo(92.0f, 154.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(84.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(97.34f, 148.0f)
                lineToRelative(5.27f, 5.52f)
                arcToRelative(36.12f, 36.12f, 0.0f, false, false, 47.0f, 3.29f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.2f, 157.6f)
                close()
            }
        }
        .build()
        return `_camera-rotate-thin`!!
    }

private var `_camera-rotate-thin`: ImageVector? = null

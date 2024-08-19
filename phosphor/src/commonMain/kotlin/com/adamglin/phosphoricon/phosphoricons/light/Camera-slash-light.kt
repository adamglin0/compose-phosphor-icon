package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Camera-slash-light`: ImageVector
    get() {
        if (`_camera-slash-light` != null) {
            return `_camera-slash-light`!!
        }
        `_camera-slash-light` = Builder(name = "Camera-slash-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(56.25f, 58.0f)
                lineTo(48.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 26.0f, 80.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(198.07f, 214.0f)
                lineToRelative(5.49f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(105.5f, 112.2f)
                lineTo(145.61f, 156.33f)
                arcTo(29.67f, 29.67f, 0.0f, false, true, 128.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -22.5f, -49.84f)
                close()
                moveTo(48.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(38.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 48.0f, 70.0f)
                lineTo(67.16f, 70.0f)
                lineToRelative(30.23f, 33.25f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 56.33f, 62.0f)
                lineTo(187.16f, 202.0f)
                close()
                moveTo(230.0f, 80.0f)
                lineTo(230.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(176.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, -2.67f)
                lineTo(156.78f, 46.0f)
                lineTo(99.21f, 46.0f)
                lineToRelative(-0.23f, 0.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, -6.65f)
                lineToRelative(2.0f, -3.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 96.0f, 34.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, 2.67f)
                lineTo(179.21f, 58.0f)
                lineTo(208.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 230.0f, 80.0f)
                close()
            }
        }
        .build()
        return `_camera-slash-light`!!
    }

private var `_camera-slash-light`: ImageVector? = null

package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 142.0f)
                horizontalLineTo(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(68.79f)
                lineTo(83.0f, 108.67f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.0f, 0.0f)
                lineToRelative(27.0f, 40.51f)
                lineToRelative(11.0f, -16.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 5.0f, -2.67f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(139.21f)
                lineTo(125.0f, 163.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.0f, 0.0f)
                lineTo(88.0f, 122.82f)
                lineTo(77.0f, 139.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 72.0f, 142.0f)
                close()
                moveTo(178.0f, 42.0f)
                curveToRelative(-21.0f, 0.0f, -39.26f, 9.47f, -50.0f, 25.34f)
                curveTo(117.26f, 51.47f, 99.0f, 42.0f, 78.0f, 42.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, 60.0f)
                quadToRelative(0.0f, 1.09f, 0.0f, 2.19f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, -0.38f)
                curveToRelative(0.0f, -0.6f, 0.0f, -1.21f, 0.0f, -1.81f)
                arcTo(48.05f, 48.05f, 0.0f, false, true, 78.0f, 54.0f)
                curveToRelative(20.28f, 0.0f, 37.31f, 10.83f, 44.45f, 28.27f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.1f, 0.0f)
                curveTo(140.69f, 64.83f, 157.72f, 54.0f, 178.0f, 54.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, true, 48.0f, 48.0f)
                curveToRelative(0.0f, 55.73f, -81.61f, 105.65f, -98.0f, 115.11f)
                curveToRelative(-9.84f, -5.66f, -43.09f, -25.82f, -68.16f, -53.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.84f, 8.1f)
                curveToRelative(30.94f, 33.77f, 72.41f, 56.29f, 74.16f, 57.23f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.68f, 0.0f)
                arcToRelative(334.68f, 334.68f, 0.0f, false, false, 53.06f, -37.0f)
                curveTo(219.8f, 161.59f, 238.0f, 131.2f, 238.0f, 102.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 178.0f, 42.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null

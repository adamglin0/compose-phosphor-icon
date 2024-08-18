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

public val RegularGroup.`Airplane-tilt`: ImageVector
    get() {
        if (`_airplane-tilt` != null) {
            return `_airplane-tilt`!!
        }
        `_airplane-tilt` = Builder(name = "Airplane-tilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.33f, 114.21f)
                lineToRelative(29.14f, -27.42f)
                lineToRelative(0.17f, -0.17f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, -45.26f)
                curveToRelative(0.0f, 0.06f, -0.11f, 0.11f, -0.17f, 0.17f)
                lineTo(141.79f, 70.67f)
                lineToRelative(-83.0f, -30.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.39f, 1.86f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.22f, 12.31f)
                lineToRelative(63.89f, 42.59f)
                lineTo(76.69f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.65f, 2.34f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 29.0f, 175.42f)
                lineToRelative(36.82f, 14.73f)
                lineToRelative(14.7f, 36.75f)
                lineToRelative(0.06f, 0.16f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.18f, 2.47f)
                lineToRelative(23.87f, -23.88f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 200.0f)
                lineTo(120.0f, 179.31f)
                lineToRelative(14.76f, -14.76f)
                lineToRelative(42.59f, 63.89f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.31f, 1.22f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.86f, -8.39f)
                close()
                moveTo(185.26f, 211.44f)
                lineTo(142.67f, 147.56f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.8f, 144.0f)
                curveToRelative(-0.27f, 0.0f, -0.53f, 0.0f, -0.79f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.35f)
                lineToRelative(-24.0f, 24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 176.0f)
                verticalLineToRelative(20.69f)
                lineTo(90.93f, 209.76f)
                lineTo(79.43f, 181.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 75.0f, 176.57f)
                lineToRelative(-28.74f, -11.5f)
                lineTo(59.32f, 152.0f)
                lineTo(80.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.66f, -2.34f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -1.22f, -12.32f)
                lineTo(44.56f, 70.74f)
                lineToRelative(13.5f, -13.49f)
                lineToRelative(83.22f, 30.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.56f, -2.0f)
                lineTo(180.78f, 52.6f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 203.4f, 75.23f)
                lineToRelative(-32.87f, 30.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.0f, 8.56f)
                lineToRelative(30.26f, 83.22f)
                close()
            }
        }
        .build()
        return `_airplane-tilt`!!
    }

private var `_airplane-tilt`: ImageVector? = null

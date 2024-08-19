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

public val ThinGroup.`Heartbeat-thin`: ImageVector
    get() {
        if (`_heartbeat-thin` != null) {
            return `_heartbeat-thin`!!
        }
        `_heartbeat-thin` = Builder(name = "Heartbeat-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 140.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(69.86f)
                lineToRelative(14.81f, -22.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.66f, 0.0f)
                lineToRelative(28.67f, 43.0f)
                lineToRelative(12.67f, -19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 132.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(138.14f)
                lineToRelative(-14.81f, 22.22f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.66f, 0.0f)
                lineTo(88.0f, 119.21f)
                lineToRelative(-12.67f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 140.0f)
                close()
                moveTo(178.0f, 44.0f)
                curveToRelative(-21.44f, 0.0f, -39.92f, 10.19f, -50.0f, 27.07f)
                curveTo(117.92f, 54.19f, 99.44f, 44.0f, 78.0f, 44.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                quadToRelative(0.0f, 1.06f, 0.0f, 2.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 8.0f, -0.26f)
                curveToRelative(0.0f, -0.62f, 0.0f, -1.24f, 0.0f, -1.87f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 78.0f, 52.0f)
                curveToRelative(21.11f, 0.0f, 38.85f, 11.31f, 46.3f, 29.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 0.0f)
                curveTo(139.15f, 63.31f, 156.89f, 52.0f, 178.0f, 52.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 50.0f, 50.0f)
                curveToRelative(0.0f, 58.0f, -86.0f, 109.46f, -100.0f, 117.42f)
                curveToRelative(-8.47f, -4.82f, -43.5f, -25.61f, -69.63f, -54.12f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.9f, 5.4f)
                curveToRelative(30.72f, 33.52f, 71.9f, 55.89f, 73.63f, 56.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, -36.73f)
                curveTo(218.0f, 160.47f, 236.0f, 130.59f, 236.0f, 102.0f)
                arcTo(58.07f, 58.07f, 0.0f, false, false, 178.0f, 44.0f)
                close()
            }
        }
        .build()
        return `_heartbeat-thin`!!
    }

private var `_heartbeat-thin`: ImageVector? = null

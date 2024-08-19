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

public val LightGroup.`Airplane-takeoff-light`: ImageVector
    get() {
        if (`_airplane-takeoff-light` != null) {
            return `_airplane-takeoff-light`!!
        }
        `_airplane-takeoff-light` = Builder(name = "Airplane-takeoff-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(168.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 216.0f)
                close()
                moveTo(245.9f, 92.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.82f, 4.0f)
                lineToRelative(-147.41f, 88.0f)
                arcToRelative(38.22f, 38.22f, 0.0f, false, true, -19.23f, 5.23f)
                arcToRelative(37.8f, 37.8f, 0.0f, false, true, -25.92f, -10.33f)
                lineToRelative(-0.1f, -0.09f)
                lineTo(14.37f, 144.36f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.0f, -23.0f)
                lineToRelative(3.0f, -1.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.56f, -0.29f)
                lineToRelative(29.15f, 9.83f)
                lineToRelative(23.17f, -14.0f)
                lineToRelative(-23.7f, -23.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 4.0f, -23.18f)
                lineToRelative(0.24f, -0.1f)
                lineToRelative(7.15f, -2.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.19f, 0.0f)
                lineToRelative(54.84f, 20.18f)
                lineToRelative(52.38f, -31.27f)
                arcTo(37.81f, 37.81f, 0.0f, false, true, 226.0f, 64.0f)
                lineToRelative(0.09f, 0.11f)
                lineTo(244.73f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 245.9f, 92.78f)
                close()
                moveTo(231.09f, 90.0f)
                lineTo(216.67f, 71.53f)
                arcToRelative(25.86f, 25.86f, 0.0f, false, false, -33.26f, -5.89f)
                lineTo(128.6f, 98.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.15f, 0.48f)
                lineTo(68.0f, 78.45f)
                lineToRelative(-4.9f, 1.85f)
                arcTo(1.91f, 1.91f, 0.0f, false, false, 62.0f, 81.77f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.63f, 1.82f)
                lineToRelative(0.17f, 0.15f)
                lineToRelative(29.35f, 28.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.07f, 9.44f)
                lineTo(58.89f, 141.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.0f, 0.55f)
                lineToRelative(-29.45f, -9.94f)
                lineToRelative(-0.93f, 0.46f)
                lineToRelative(-0.28f, 0.13f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.58f, 3.29f)
                lineToRelative(0.1f, 0.09f)
                lineToRelative(36.0f, 35.28f)
                arcToRelative(25.84f, 25.84f, 0.0f, false, false, 30.81f, 3.47f)
                close()
            }
        }
        .build()
        return `_airplane-takeoff-light`!!
    }

private var `_airplane-takeoff-light`: ImageVector? = null

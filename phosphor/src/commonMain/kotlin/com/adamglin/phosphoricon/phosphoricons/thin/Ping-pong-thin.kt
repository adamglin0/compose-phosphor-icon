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

public val ThinGroup.`Ping-pong-thin`: ImageVector
    get() {
        if (`_ping-pong-thin` != null) {
            return `_ping-pong-thin`!!
        }
        `_ping-pong-thin` = Builder(name = "Ping-pong-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 196.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.0f, -8.77f)
                lineTo(189.13f, 157.7f)
                lineToRelative(20.29f, -20.29f)
                arcToRelative(35.68f, 35.68f, 0.0f, false, false, 9.91f, -32.18f)
                arcToRelative(95.43f, 95.43f, 0.0f, false, false, -34.0f, -55.55f)
                arcTo(98.33f, 98.33f, 0.0f, false, false, 122.63f, 28.0f)
                arcTo(96.3f, 96.3f, 0.0f, false, false, 28.0f, 122.63f)
                arcToRelative(98.09f, 98.09f, 0.0f, false, false, 21.67f, 62.72f)
                arcToRelative(95.43f, 95.43f, 0.0f, false, false, 55.55f, 34.0f)
                arcToRelative(35.66f, 35.66f, 0.0f, false, false, 32.18f, -9.92f)
                lineToRelative(20.29f, -20.28f)
                lineTo(187.59f, 231.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.78f, 5.0f)
                curveToRelative(0.33f, 0.0f, 0.66f, 0.0f, 1.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.52f)
                lineToRelative(26.64f, -26.64f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.0f, 196.36f)
                close()
                moveTo(56.0f, 180.36f)
                arcTo(90.11f, 90.11f, 0.0f, false, true, 36.0f, 122.74f)
                arcTo(88.27f, 88.27f, 0.0f, false, true, 122.75f, 36.0f)
                arcToRelative(90.13f, 90.13f, 0.0f, false, true, 57.59f, 19.9f)
                arcToRelative(89.13f, 89.13f, 0.0f, false, true, 21.28f, 24.81f)
                lineTo(80.72f, 201.62f)
                arcTo(89.0f, 89.0f, 0.0f, false, true, 55.91f, 180.33f)
                close()
                moveTo(226.92f, 200.21f)
                lineTo(200.27f, 226.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 197.0f, 228.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -2.93f, -1.67f)
                lineToRelative(-32.64f, -45.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.92f, -1.66f)
                horizontalLineToRelative(-0.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 1.17f)
                lineToRelative(-23.63f, 23.63f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.66f, 27.66f, 0.0f, false, true, -25.0f, 7.72f)
                arcToRelative(84.36f, 84.36f, 0.0f, false, true, -18.6f, -6.0f)
                lineTo(205.47f, 88.18f)
                arcToRelative(84.36f, 84.36f, 0.0f, false, true, 6.0f, 18.6f)
                arcToRelative(27.69f, 27.69f, 0.0f, false, true, -7.72f, 25.0f)
                lineToRelative(-23.63f, 23.63f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.5f, 6.08f)
                lineToRelative(45.69f, 32.64f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.51f, 6.08f)
                close()
            }
        }
        .build()
        return `_ping-pong-thin`!!
    }

private var `_ping-pong-thin`: ImageVector? = null

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

public val LightGroup.`Ping-pong-light`: ImageVector
    get() {
        if (`_ping-pong-light` != null) {
            return `_ping-pong-light`!!
        }
        `_ping-pong-light` = Builder(name = "Ping-pong-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 196.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.14f, 186.0f)
                lineToRelative(-39.93f, -28.52f)
                lineToRelative(18.62f, -18.62f)
                arcToRelative(37.65f, 37.65f, 0.0f, false, false, 10.46f, -34.0f)
                arcTo(97.43f, 97.43f, 0.0f, false, false, 186.6f, 48.12f)
                arcToRelative(99.82f, 99.82f, 0.0f, false, false, -64.0f, -22.11f)
                arcTo(98.29f, 98.29f, 0.0f, false, false, 26.0f, 122.61f)
                arcToRelative(100.09f, 100.09f, 0.0f, false, false, 22.11f, 64.0f)
                arcToRelative(97.4f, 97.4f, 0.0f, false, false, 56.72f, 34.69f)
                arcToRelative(37.65f, 37.65f, 0.0f, false, false, 34.0f, -10.46f)
                lineToRelative(18.62f, -18.62f)
                lineTo(186.0f, 232.14f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 196.2f, 238.0f)
                curveToRelative(0.39f, 0.0f, 0.78f, 0.05f, 1.16f, 0.05f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 9.89f, -4.1f)
                lineToRelative(26.65f, -26.64f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 238.0f, 196.2f)
                close()
                moveTo(57.47f, 179.08f)
                arcTo(88.12f, 88.12f, 0.0f, false, true, 38.0f, 122.77f)
                arcTo(86.29f, 86.29f, 0.0f, false, true, 122.77f, 38.0f)
                arcToRelative(88.21f, 88.21f, 0.0f, false, true, 56.31f, 19.46f)
                arcToRelative(87.3f, 87.3f, 0.0f, false, true, 20.0f, 22.93f)
                lineTo(80.4f, 199.12f)
                arcTo(87.14f, 87.14f, 0.0f, false, true, 57.47f, 179.08f)
                close()
                moveTo(225.41f, 198.77f)
                lineTo(198.77f, 225.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.0f, -0.25f)
                lineToRelative(-32.64f, -45.69f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.7f, 177.0f)
                lineToRelative(-0.49f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.24f, 1.76f)
                lineToRelative(-23.63f, 23.62f)
                horizontalLineToRelative(0.0f)
                arcToRelative(25.69f, 25.69f, 0.0f, false, true, -23.17f, 7.17f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, -15.49f, -4.72f)
                lineTo(204.8f, 91.68f)
                arcToRelative(82.19f, 82.19f, 0.0f, false, true, 4.72f, 15.49f)
                arcToRelative(25.67f, 25.67f, 0.0f, false, true, -7.18f, 23.17f)
                lineTo(178.72f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.75f, 9.12f)
                lineToRelative(45.69f, 32.64f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.25f, 3.0f)
                close()
            }
        }
        .build()
        return `_ping-pong-light`!!
    }

private var `_ping-pong-light`: ImageVector? = null

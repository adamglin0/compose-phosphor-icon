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

public val LightGroup.`Pentagram-light`: ImageVector
    get() {
        if (`_pentagram-light` != null) {
            return `_pentagram-light`!!
        }
        `_pentagram-light` = Builder(name = "Pentagram-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.29f, 91.67f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 224.0f, 82.0f)
                lineTo(161.48f, 82.0f)
                lineTo(141.33f, 19.87f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, -26.64f, -0.05f)
                lineTo(94.51f, 82.0f)
                lineTo(32.0f, 82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -8.21f, 25.35f)
                lineToRelative(50.65f, 36.44f)
                lineTo(55.05f, 203.63f)
                arcToRelative(13.78f, 13.78f, 0.0f, false, false, 5.09f, 15.64f)
                arcToRelative(13.77f, 13.77f, 0.0f, false, false, 16.43f, 0.0f)
                lineToRelative(51.43f, -37.0f)
                lineToRelative(51.41f, 37.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 201.0f, 203.63f)
                lineToRelative(-19.42f, -59.85f)
                lineToRelative(50.67f, -36.46f)
                arcTo(13.79f, 13.79f, 0.0f, false, false, 237.29f, 91.67f)
                close()
                moveTo(126.11f, 23.49f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 3.79f, 0.0f)
                lineToRelative(19.0f, 58.46f)
                lineTo(107.13f, 81.95f)
                close()
                moveTo(30.85f, 97.61f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, -0.73f, -2.23f)
                arcTo(1.88f, 1.88f, 0.0f, false, true, 32.0f, 94.0f)
                lineTo(90.62f, 94.0f)
                lineToRelative(-12.26f, 37.8f)
                close()
                moveTo(69.54f, 209.61f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.08f, -2.24f)
                horizontalLineToRelative(0.0f)
                lineToRelative(18.23f, -56.2f)
                lineToRelative(33.0f, 23.77f)
                close()
                moveTo(88.54f, 139.19f)
                lineTo(103.24f, 94.0f)
                horizontalLineToRelative(49.52f)
                lineToRelative(14.65f, 45.16f)
                lineTo(128.0f, 167.51f)
                close()
                moveTo(189.49f, 207.37f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.1f, 2.22f)
                lineTo(138.27f, 174.9f)
                lineToRelative(33.0f, -23.77f)
                close()
                moveTo(225.17f, 97.59f)
                lineToRelative(-47.53f, 34.2f)
                lineTo(165.38f, 94.0f)
                lineTo(224.0f, 94.0f)
                arcToRelative(1.86f, 1.86f, 0.0f, false, true, 1.9f, 1.39f)
                arcTo(1.83f, 1.83f, 0.0f, false, true, 225.17f, 97.59f)
                close()
            }
        }
        .build()
        return `_pentagram-light`!!
    }

private var `_pentagram-light`: ImageVector? = null

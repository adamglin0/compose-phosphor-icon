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

public val LightGroup.`Paper-plane-tilt-light`: ImageVector
    get() {
        if (`_paper-plane-tilt-light` != null) {
            return `_paper-plane-tilt-light`!!
        }
        `_paper-plane-tilt-light` = Builder(name = "Paper-plane-tilt-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.88f, 30.12f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, false, -13.7f, -3.58f)
                lineToRelative(-0.11f, 0.0f)
                lineTo(20.14f, 84.77f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 110.85f)
                lineToRelative(85.56f, 41.64f)
                lineTo(145.12f, 238.0f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, 12.61f, 8.0f)
                curveToRelative(0.4f, 0.0f, 0.81f, 0.0f, 1.21f, -0.05f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 12.29f, -10.09f)
                lineToRelative(58.2f, -191.93f)
                lineToRelative(0.0f, -0.11f)
                arcTo(13.83f, 13.83f, 0.0f, false, false, 225.88f, 30.12f)
                close()
                moveTo(217.88f, 40.52f)
                lineTo(159.73f, 232.43f)
                lineToRelative(0.0f, 0.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.76f, 0.26f)
                lineToRelative(-40.68f, -83.58f)
                lineToRelative(49.0f, -49.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, -8.49f)
                lineToRelative(-49.0f, 49.0f)
                lineTo(23.15f, 100.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.31f, -3.74f)
                lineToRelative(0.11f, 0.0f)
                lineTo(215.48f, 38.08f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, true, 1.92f, 0.52f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.92f, 40.52f)
                close()
            }
        }
        .build()
        return `_paper-plane-tilt-light`!!
    }

private var `_paper-plane-tilt-light`: ImageVector? = null

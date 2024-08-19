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

public val ThinGroup.`Paper-plane-tilt-thin`: ImageVector
    get() {
        if (`_paper-plane-tilt-thin` != null) {
            return `_paper-plane-tilt-thin`!!
        }
        `_paper-plane-tilt-thin` = Builder(name = "Paper-plane-tilt-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.47f, 31.52f)
                arcToRelative(11.87f, 11.87f, 0.0f, false, false, -11.82f, -3.0f)
                lineTo(20.74f, 86.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.91f, 22.38f)
                lineTo(105.0f, 151.0f)
                lineToRelative(41.92f, 86.15f)
                arcTo(11.88f, 11.88f, 0.0f, false, false, 157.74f, 244.0f)
                curveToRelative(0.34f, 0.0f, 0.69f, 0.0f, 1.0f, 0.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 10.52f, -8.63f)
                lineToRelative(58.21f, -192.0f)
                lineToRelative(0.0f, -0.08f)
                arcTo(11.85f, 11.85f, 0.0f, false, false, 224.47f, 31.52f)
                close()
                moveTo(219.85f, 41.06f)
                lineTo(161.62f, 233.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.48f, 0.59f)
                lineToRelative(-41.3f, -84.86f)
                lineToRelative(50.0f, -50.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.66f, -5.66f)
                lineToRelative(-50.0f, 50.0f)
                lineToRelative(-84.9f, -41.31f)
                arcToRelative(3.88f, 3.88f, 0.0f, false, true, -2.27f, -4.0f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 3.0f, -3.54f)
                lineTo(214.9f, 36.16f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 216.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.79f, 1.19f)
                arcTo(3.93f, 3.93f, 0.0f, false, true, 219.85f, 41.06f)
                close()
            }
        }
        .build()
        return `_paper-plane-tilt-thin`!!
    }

private var `_paper-plane-tilt-thin`: ImageVector? = null

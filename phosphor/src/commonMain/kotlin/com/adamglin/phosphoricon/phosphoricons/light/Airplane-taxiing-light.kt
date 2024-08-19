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

public val LightGroup.`Airplane-taxiing-light`: ImageVector
    get() {
        if (`_airplane-taxiing-light` != null) {
            return `_airplane-taxiing-light`!!
        }
        `_airplane-taxiing-light` = Builder(name = "Airplane-taxiing-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 98.0f)
                lineTo(146.49f, 98.0f)
                lineTo(100.25f, 51.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 50.0f)
                lineTo(88.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.73f, 68.43f)
                lineTo(84.59f, 98.0f)
                lineTo(58.49f, 98.0f)
                lineTo(36.25f, 75.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 32.0f, 74.0f)
                lineTo(24.0f, 74.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.6f, 92.0f)
                lineToRelative(14.07f, 46.9f)
                arcTo(37.77f, 37.77f, 0.0f, false, false, 61.07f, 166.0f)
                lineTo(240.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(246.0f, 136.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 208.0f, 98.0f)
                close()
                moveTo(234.0f, 154.0f)
                lineTo(61.07f, 154.0f)
                arcToRelative(25.86f, 25.86f, 0.0f, false, true, -24.91f, -18.53f)
                lineTo(22.1f, 88.57f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, true, 0.31f, -1.76f)
                arcTo(1.93f, 1.93f, 0.0f, false, true, 24.0f, 86.0f)
                horizontalLineToRelative(5.51f)
                lineToRelative(22.24f, 22.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 56.0f, 110.0f)
                lineTo(92.91f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.69f, -7.9f)
                lineTo(86.11f, 64.63f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 88.0f, 62.0f)
                horizontalLineToRelative(5.51f)
                lineToRelative(46.24f, 46.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 144.0f, 110.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(222.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 200.0f)
                close()
                moveTo(126.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 126.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_airplane-taxiing-light`!!
    }

private var `_airplane-taxiing-light`: ImageVector? = null

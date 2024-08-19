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

public val LightGroup.`Scroll-light`: ImageVector
    get() {
        if (`_scroll-light` != null) {
            return `_scroll-light`!!
        }
        `_scroll-light` = Builder(name = "Scroll-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(104.0f, 142.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.0f, 136.0f)
                close()
                moveTo(104.0f, 110.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(104.0f, 98.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(230.0f, 192.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(88.0f, 222.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, -30.0f)
                lineTo(58.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                curveToRelative(0.0f, 6.76f, 5.58f, 11.19f, 5.64f, 11.23f)
                arcTo(6.0f, 6.0f, 0.0f, true, true, 20.4f, 84.8f)
                curveTo(20.0f, 84.48f, 10.0f, 76.85f, 10.0f, 64.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 40.0f, 34.0f)
                lineTo(176.0f, 34.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 30.0f, 30.0f)
                lineTo(206.0f, 170.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.6f, 1.2f)
                curveTo(220.0f, 171.52f, 230.0f, 179.15f, 230.0f, 192.0f)
                close()
                moveTo(106.0f, 192.0f)
                curveToRelative(0.0f, -6.76f, -5.59f, -11.19f, -5.64f, -11.23f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 104.0f, 170.0f)
                horizontalLineToRelative(90.0f)
                lineTo(194.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -18.0f, -18.0f)
                lineTo(64.0f, 46.0f)
                arcToRelative(29.82f, 29.82f, 0.0f, false, true, 6.0f, 18.0f)
                lineTo(70.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 36.0f, 0.0f)
                close()
                moveTo(218.0f, 192.0f)
                arcToRelative(14.94f, 14.94f, 0.0f, false, false, -4.34f, -10.0f)
                lineTo(115.88f, 182.0f)
                arcTo(24.83f, 24.83f, 0.0f, false, true, 118.0f, 192.0f)
                arcToRelative(29.87f, 29.87f, 0.0f, false, true, -6.0f, 18.0f)
                horizontalLineToRelative(88.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 218.0f, 192.0f)
                close()
            }
        }
        .build()
        return `_scroll-light`!!
    }

private var `_scroll-light`: ImageVector? = null

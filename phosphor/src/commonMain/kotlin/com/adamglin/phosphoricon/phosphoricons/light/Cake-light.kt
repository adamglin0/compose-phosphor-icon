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

public val LightGroup.`Cake-light`: ImageVector
    get() {
        if (`_cake-light` != null) {
            return `_cake-light`!!
        }
        `_cake-light` = Builder(name = "Cake-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 112.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(134.0f, 90.0f)
                lineTo(134.0f, 77.4f)
                arcTo(30.05f, 30.05f, 0.0f, false, false, 158.0f, 48.0f)
                curveToRelative(0.0f, -26.9f, -25.58f, -44.27f, -26.67f, -45.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.66f, 0.0f)
                curveTo(123.58f, 3.73f, 98.0f, 21.1f, 98.0f, 48.0f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, 24.0f, 29.4f)
                lineTo(122.0f, 90.0f)
                lineTo(48.0f, 90.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -22.0f, 22.0f)
                verticalLineToRelative(23.33f)
                arcToRelative(38.81f, 38.81f, 0.0f, false, false, 8.0f, 23.57f)
                lineTo(34.0f, 200.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(200.0f, 222.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(222.0f, 158.9f)
                arcToRelative(38.81f, 38.81f, 0.0f, false, false, 8.0f, -23.57f)
                close()
                moveTo(110.0f, 48.0f)
                curveToRelative(0.0f, -15.4f, 12.0f, -27.41f, 18.0f, -32.44f)
                curveToRelative(6.0f, 5.0f, 18.0f, 17.0f, 18.0f, 32.44f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                close()
                moveTo(38.0f, 112.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, -10.0f)
                lineTo(208.0f, 102.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                verticalLineToRelative(23.33f)
                curveToRelative(0.0f, 14.32f, -11.33f, 26.28f, -25.26f, 26.66f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 166.0f, 136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.74f, 26.0f)
                curveTo(49.33f, 161.61f, 38.0f, 149.65f, 38.0f, 135.33f)
                close()
                moveTo(200.0f, 210.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(46.0f, 169.31f)
                arcTo(36.8f, 36.8f, 0.0f, false, false, 62.94f, 174.0f)
                arcTo(37.82f, 37.82f, 0.0f, false, false, 90.5f, 163.24f)
                arcTo(38.83f, 38.83f, 0.0f, false, false, 96.0f, 156.5f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(38.83f, 38.83f, 0.0f, false, false, 5.52f, 6.74f)
                arcTo(37.73f, 37.73f, 0.0f, false, false, 192.0f, 174.0f)
                horizontalLineToRelative(1.07f)
                arcTo(36.8f, 36.8f, 0.0f, false, false, 210.0f, 169.31f)
                lineTo(210.0f, 200.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 200.0f, 210.0f)
                close()
            }
        }
        .build()
        return `_cake-light`!!
    }

private var `_cake-light`: ImageVector? = null

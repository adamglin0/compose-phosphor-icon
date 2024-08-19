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

public val LightGroup.`Drone-light`: ImageVector
    get() {
        if (`_drone-light` != null) {
            return `_drone-light`!!
        }
        `_drone-light` = Builder(name = "Drone-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.24f, 67.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 0.0f)
                lineTo(149.52f, 98.0f)
                horizontalLineToRelative(-43.0f)
                lineTo(76.24f, 67.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.48f, 8.48f)
                lineTo(98.0f, 106.48f)
                verticalLineToRelative(43.0f)
                lineTo(67.76f, 179.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, 8.48f)
                lineTo(106.48f, 158.0f)
                horizontalLineToRelative(43.0f)
                lineToRelative(30.24f, 30.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.48f, -8.48f)
                lineTo(158.0f, 149.52f)
                verticalLineToRelative(-43.0f)
                lineToRelative(30.24f, -30.24f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 188.24f, 67.76f)
                close()
                moveTo(110.0f, 110.0f)
                horizontalLineToRelative(36.0f)
                verticalLineToRelative(36.0f)
                lineTo(110.0f, 146.0f)
                close()
                moveTo(140.39f, 62.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 194.0f, 115.61f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.0f, 0.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.0f, -11.66f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 151.71f, 66.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.32f, -4.0f)
                close()
                moveTo(222.0f, 180.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -81.61f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.32f, -4.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 190.0f, 151.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.0f, -11.32f)
                arcTo(42.07f, 42.07f, 0.0f, false, true, 222.0f, 180.0f)
                close()
                moveTo(115.61f, 194.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 62.0f, 140.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 4.0f, 11.32f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 104.29f, 190.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.32f, 4.0f)
                close()
                moveTo(34.0f, 76.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 81.61f, -14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -11.32f, 4.0f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 66.0f, 104.29f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 64.0f, 116.0f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, true, -2.0f, -0.34f)
                arcTo(42.07f, 42.07f, 0.0f, false, true, 34.0f, 76.0f)
                close()
            }
        }
        .build()
        return `_drone-light`!!
    }

private var `_drone-light`: ImageVector? = null

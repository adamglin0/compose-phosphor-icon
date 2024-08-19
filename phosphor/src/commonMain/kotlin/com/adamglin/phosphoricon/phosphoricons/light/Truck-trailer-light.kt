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

public val LightGroup.`Truck-trailer-light`: ImageVector
    get() {
        if (`_truck-trailer-light` != null) {
            return `_truck-trailer-light`!!
        }
        `_truck-trailer-light` = Builder(name = "Truck-trailer-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 98.47f)
                lineTo(222.0f, 96.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                lineTo(146.0f, 178.0f)
                lineTo(126.0f, 178.0f)
                lineTo(126.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(16.0f, 66.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 2.0f, 80.0f)
                lineTo(2.0f, 184.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 54.0f, 18.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 53.4f, -12.0f)
                horizontalLineToRelative(85.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 59.4f, -6.0f)
                lineTo(254.0f, 136.0f)
                arcTo(38.07f, 38.07f, 0.0f, false, false, 222.0f, 98.47f)
                close()
                moveTo(158.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -47.4f, 18.0f)
                lineTo(158.0f, 178.0f)
                close()
                moveTo(16.0f, 78.0f)
                horizontalLineToRelative(98.0f)
                lineTo(114.0f, 178.0f)
                horizontalLineToRelative(-4.6f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 56.0f, 166.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.0f, -6.0f)
                lineTo(14.0f, 80.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 78.0f)
                close()
                moveTo(32.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 32.0f, 202.0f)
                close()
                moveTo(80.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 80.0f, 202.0f)
                close()
                moveTo(224.0f, 202.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 224.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_truck-trailer-light`!!
    }

private var `_truck-trailer-light`: ImageVector? = null

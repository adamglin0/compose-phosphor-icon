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

public val LightGroup.`Toilet-light`: ImageVector
    get() {
        if (`_toilet-light` != null) {
            return `_toilet-light`!!
        }
        `_toilet-light` = Builder(name = "Toilet-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 118.0f, 64.0f)
                close()
                moveTo(170.14f, 196.0f)
                lineTo(173.86f, 222.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 160.0f, 238.0f)
                lineTo(96.0f, 238.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -13.86f, -16.0f)
                lineToRelative(3.72f, -26.0f)
                arcTo(94.1f, 94.1f, 0.0f, false, true, 34.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(58.0f, 106.0f)
                lineTo(58.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 72.0f, 26.0f)
                lineTo(184.0f, 26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(66.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcTo(94.1f, 94.1f, 0.0f, false, true, 170.14f, 196.0f)
                close()
                moveTo(70.0f, 106.0f)
                lineTo(186.0f, 106.0f)
                lineTo(186.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(72.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(158.71f, 200.84f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, true, -61.42f, 0.0f)
                lineTo(94.0f, 223.72f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.47f, 1.59f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 96.0f, 226.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.51f, -0.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.47f, -1.59f)
                close()
                moveTo(209.78f, 118.0f)
                lineTo(46.22f, 118.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, false, 163.56f, 0.0f)
                close()
            }
        }
        .build()
        return `_toilet-light`!!
    }

private var `_toilet-light`: ImageVector? = null

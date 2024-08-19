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

public val LightGroup.`Stamp-light`: ImageVector
    get() {
        if (`_stamp-light` != null) {
            return `_stamp-light`!!
        }
        `_stamp-light` = Builder(name = "Stamp-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(40.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(216.0f, 218.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 224.0f)
                close()
                moveTo(222.0f, 144.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(48.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(34.0f, 144.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, -14.0f)
                horizontalLineToRelative(58.9f)
                lineTo(90.68f, 54.29f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 120.0f, 18.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 29.33f, 36.29f)
                lineTo(149.1f, 130.0f)
                lineTo(208.0f, 130.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 144.0f)
                close()
                moveTo(119.17f, 130.0f)
                horizontalLineToRelative(17.66f)
                lineToRelative(16.76f, -78.23f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 136.0f, 30.0f)
                lineTo(120.0f, 30.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -17.6f, 21.77f)
                close()
                moveTo(210.0f, 144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(48.0f, 142.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(208.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return `_stamp-light`!!
    }

private var `_stamp-light`: ImageVector? = null

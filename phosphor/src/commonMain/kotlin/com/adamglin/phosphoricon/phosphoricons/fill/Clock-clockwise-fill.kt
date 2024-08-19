package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Clock-clockwise-fill`: ImageVector
    get() {
        if (`_clock-clockwise-fill` != null) {
            return `_clock-clockwise-fill`!!
        }
        `_clock-clockwise-fill` = Builder(name = "Clock-clockwise-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 80.0f)
                verticalLineToRelative(43.47f)
                lineToRelative(36.12f, 21.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.24f, 13.72f)
                lineToRelative(-40.0f, -24.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 120.0f, 128.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(227.06f, 56.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(206.0f, 70.71f)
                curveToRelative(-3.23f, -3.51f, -6.56f, -7.0f, -10.1f, -10.59f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -2.0f, 137.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -11.64f)
                arcTo(80.0f, 80.0f, 0.0f, true, true, 184.54f, 71.4f)
                curveToRelative(3.54f, 3.58f, 6.87f, 7.1f, 10.11f, 10.63f)
                lineTo(178.34f, 98.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 112.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 227.06f, 56.61f)
                close()
            }
        }
        .build()
        return `_clock-clockwise-fill`!!
    }

private var `_clock-clockwise-fill`: ImageVector? = null

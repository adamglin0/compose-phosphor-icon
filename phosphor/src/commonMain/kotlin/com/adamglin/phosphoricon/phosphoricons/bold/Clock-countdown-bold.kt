package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Clock-countdown-bold`: ImageVector
    get() {
        if (`_clock-countdown-bold` != null) {
            return `_clock-countdown-bold`!!
        }
        `_clock-countdown-bold` = Builder(name = "Clock-countdown-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 137.0f)
                arcTo(108.13f, 108.13f, 0.0f, true, true, 119.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 121.0f, 44.0f)
                arcTo(84.12f, 84.12f, 0.0f, true, false, 212.0f, 135.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 236.0f, 137.0f)
                close()
                moveTo(116.0f, 76.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(140.0f, 116.0f)
                lineTo(140.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                close()
                moveTo(208.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 96.0f)
                close()
                moveTo(176.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 64.0f)
                close()
            }
        }
        .build()
        return `_clock-countdown-bold`!!
    }

private var `_clock-countdown-bold`: ImageVector? = null

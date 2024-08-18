package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Clock-countdown-fill`: ImageVector
    get() {
        if (`_clock-countdown-fill` != null) {
            return `_clock-countdown-fill`!!
        }
        `_clock-countdown-fill` = Builder(name = "Clock-countdown-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 96.0f)
                close()
                moveTo(196.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 72.0f)
                close()
                moveTo(224.66f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.63f, 7.31f)
                arcTo(88.12f, 88.12f, 0.0f, true, true, 120.66f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 119.34f, 24.0f)
                arcTo(104.12f, 104.12f, 0.0f, true, false, 232.0f, 136.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.66f, 128.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -72.0f, 72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 56.0f)
                close()
                moveTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 120.0f)
                lineTo(136.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                close()
                moveTo(160.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_clock-countdown-fill`!!
    }

private var `_clock-countdown-fill`: ImageVector? = null

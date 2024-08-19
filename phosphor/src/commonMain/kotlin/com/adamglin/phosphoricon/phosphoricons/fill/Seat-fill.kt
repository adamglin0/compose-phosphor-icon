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

public val FillGroup.`Seat-fill`: ImageVector
    get() {
        if (`_seat-fill` != null) {
            return `_seat-fill`!!
        }
        `_seat-fill` = Builder(name = "Seat-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(112.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 224.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 232.0f)
                close()
                moveTo(208.0f, 144.0f)
                lineTo(143.78f, 144.0f)
                lineTo(112.0f, 80.0f)
                lineToRelative(14.19f, -26.32f)
                arcToRelative(1.51f, 1.51f, 0.0f, false, false, 0.11f, -0.22f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 119.15f, 32.0f)
                lineToRelative(-0.47f, -0.22f)
                lineTo(85.0f, 17.57f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 63.8f, 24.84f)
                lineToRelative(-22.12f, 44.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, 14.32f)
                lineToRelative(58.11f, 116.0f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 114.11f, 208.0f)
                lineTo(208.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 144.0f)
                close()
            }
        }
        .build()
        return `_seat-fill`!!
    }

private var `_seat-fill`: ImageVector? = null

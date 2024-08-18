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

public val FillGroup.`Pulse-fill`: ImageVector
    get() {
        if (`_pulse-fill` != null) {
            return `_pulse-fill`!!
        }
        `_pulse-fill` = Builder(name = "Pulse-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(208.0f, 136.0f)
                lineTo(188.64f, 136.0f)
                lineTo(159.0f, 188.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.95f, 4.0f)
                horizontalLineToRelative(-0.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.89f, -4.84f)
                lineTo(103.0f, 89.92f)
                lineTo(79.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.0f, 4.0f)
                lineTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(67.36f, 120.0f)
                lineTo(97.05f, 68.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.3f, 0.82f)
                lineTo(153.0f, 166.08f)
                lineToRelative(24.0f, -42.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.95f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_pulse-fill`!!
    }

private var `_pulse-fill`: ImageVector? = null

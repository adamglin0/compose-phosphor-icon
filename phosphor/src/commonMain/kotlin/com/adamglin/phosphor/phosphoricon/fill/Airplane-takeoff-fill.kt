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

public val FillGroup.`Airplane-takeoff-fill`: ImageVector
    get() {
        if (`_airplane-takeoff-fill` != null) {
            return `_airplane-takeoff-fill`!!
        }
        `_airplane-takeoff-fill` = Builder(name = "Airplane-takeoff-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineTo(168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 216.0f)
                close()
                moveTo(246.31f, 86.76f)
                lineTo(227.67f, 62.87f)
                lineToRelative(-0.12f, -0.15f)
                arcToRelative(39.82f, 39.82f, 0.0f, false, false, -51.28f, -9.12f)
                lineTo(124.7f, 84.38f)
                lineTo(70.76f, 64.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.59f, 0.0f)
                lineTo(58.0f, 67.27f)
                lineToRelative(-0.32f, 0.13f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -4.53f, 26.47f)
                lineTo(75.0f, 115.06f)
                lineToRelative(-20.17f, 12.2f)
                lineToRelative(-28.26f, -9.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.08f, 0.4f)
                lineToRelative(-3.0f, 1.47f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 13.0f, 145.8f)
                lineToRelative(36.0f, 35.27f)
                lineToRelative(0.12f, 0.12f)
                arcToRelative(39.78f, 39.78f, 0.0f, false, false, 27.28f, 10.87f)
                arcToRelative(40.18f, 40.18f, 0.0f, false, false, 20.26f, -5.52f)
                lineToRelative(147.41f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.21f, -11.78f)
                close()
            }
        }
        .build()
        return `_airplane-takeoff-fill`!!
    }

private var `_airplane-takeoff-fill`: ImageVector? = null

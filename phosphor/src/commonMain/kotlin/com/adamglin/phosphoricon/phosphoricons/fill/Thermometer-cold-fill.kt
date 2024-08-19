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

public val FillGroup.`Thermometer-cold-fill`: ImageVector
    get() {
        if (`_thermometer-cold-fill` != null) {
            return `_thermometer-cold-fill`!!
        }
        `_thermometer-cold-fill` = Builder(name = "Thermometer-cold-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.91f, 77.72f)
                lineToRelative(-20.0f, 6.49f)
                lineToRelative(12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -12.94f, 9.4f)
                lineTo(216.0f, 93.61f)
                lineToRelative(-12.34f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.94f, -9.4f)
                lineToRelative(12.34f, -17.0f)
                lineToRelative(-20.0f, -6.49f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 62.5f)
                lineTo(208.0f, 69.0f)
                lineTo(208.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(224.0f, 69.0f)
                lineToRelative(20.0f, -6.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.95f, 15.22f)
                close()
                moveTo(176.0f, 192.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -88.0f, -46.0f)
                lineTo(88.0f, 40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                lineTo(152.0f, 146.0f)
                arcTo(56.23f, 56.23f, 0.0f, false, true, 176.0f, 192.0f)
                close()
                moveTo(80.82f, 184.0f)
                horizontalLineToRelative(78.36f)
                arcTo(40.16f, 40.16f, 0.0f, false, false, 140.0f, 157.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, -6.93f)
                lineTo(136.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -32.0f, 0.0f)
                lineTo(104.0f, 150.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.0f, 6.93f)
                arcTo(40.16f, 40.16f, 0.0f, false, false, 80.82f, 184.0f)
                close()
            }
        }
        .build()
        return `_thermometer-cold-fill`!!
    }

private var `_thermometer-cold-fill`: ImageVector? = null

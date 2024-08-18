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

public val FillGroup.`Battery-charging-fill`: ImageVector
    get() {
        if (`_battery-charging-fill` != null) {
            return `_battery-charging-fill`!!
        }
        `_battery-charging-fill` = Builder(name = "Battery-charging-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(240.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(32.0f, 200.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 8.0f, 176.0f)
                lineTo(8.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 32.0f, 56.0f)
                lineTo(200.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 224.0f, 80.0f)
                close()
                moveTo(138.81f, 123.79f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 132.0f, 120.0f)
                lineTo(112.94f, 120.0f)
                lineToRelative(10.22f, -20.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -14.32f, -7.16f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 136.0f)
                horizontalLineToRelative(19.06f)
                lineToRelative(-10.22f, 20.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.32f, 7.16f)
                lineToRelative(16.0f, -32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 138.81f, 123.79f)
                close()
            }
        }
        .build()
        return `_battery-charging-fill`!!
    }

private var `_battery-charging-fill`: ImageVector? = null

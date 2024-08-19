package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Battery-charging-vertical`: ImageVector
    get() {
        if (`_battery-charging-vertical` != null) {
            return `_battery-charging-vertical`!!
        }
        `_battery-charging-vertical` = Builder(name = "Battery-charging-vertical", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.81f, 131.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.35f, 7.79f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, -7.16f)
                lineTo(131.06f, 144.0f)
                lineTo(112.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -11.58f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.32f, 7.16f)
                lineTo(124.94f, 128.0f)
                lineTo(144.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 150.81f, 131.79f)
                close()
                moveTo(96.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(96.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(200.0f, 56.0f)
                lineTo(200.0f, 224.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(80.0f, 248.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(56.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 80.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 200.0f, 56.0f)
                close()
                moveTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(72.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                close()
            }
        }
        .build()
        return `_battery-charging-vertical`!!
    }

private var `_battery-charging-vertical`: ImageVector? = null

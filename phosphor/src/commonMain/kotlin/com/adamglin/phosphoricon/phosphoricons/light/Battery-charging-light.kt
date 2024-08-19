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

public val LightGroup.`Battery-charging-light`: ImageVector
    get() {
        if (`_battery-charging-light` != null) {
            return `_battery-charging-light`!!
        }
        `_battery-charging-light` = Builder(name = "Battery-charging-light", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 58.0f)
                lineTo(32.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 10.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, 22.0f)
                lineTo(200.0f, 198.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(222.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 200.0f, 58.0f)
                close()
                moveTo(210.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(32.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, -10.0f)
                lineTo(22.0f, 80.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 32.0f, 70.0f)
                lineTo(200.0f, 70.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(254.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(242.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(137.1f, 124.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.27f, 5.83f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f)
                lineTo(122.29f, 134.0f)
                lineTo(100.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.37f, -8.68f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.36f)
                lineTo(109.71f, 122.0f)
                lineTo(132.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 137.1f, 124.85f)
                close()
            }
        }
        .build()
        return `_battery-charging-light`!!
    }

private var `_battery-charging-light`: ImageVector? = null

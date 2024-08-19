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

public val LightGroup.`Battery-charging-vertical-light`: ImageVector
    get() {
        if (`_battery-charging-vertical-light` != null) {
            return `_battery-charging-vertical-light`!!
        }
        `_battery-charging-vertical-light` = Builder(name = "Battery-charging-vertical-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(149.1f, 132.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.27f, 5.83f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.74f, -5.36f)
                lineTo(134.29f, 142.0f)
                lineTo(112.0f, 142.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.37f, -8.68f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.74f, 5.36f)
                lineTo(121.71f, 130.0f)
                lineTo(144.0f, 130.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 149.1f, 132.85f)
                close()
                moveTo(96.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(96.0f, 2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(198.0f, 56.0f)
                lineTo(198.0f, 224.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(80.0f, 246.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(58.0f, 56.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 80.0f, 34.0f)
                horizontalLineToRelative(96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 198.0f, 56.0f)
                close()
                moveTo(186.0f, 56.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(80.0f, 46.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 70.0f, 56.0f)
                lineTo(70.0f, 224.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
            }
        }
        .build()
        return `_battery-charging-vertical-light`!!
    }

private var `_battery-charging-vertical-light`: ImageVector? = null

package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Battery-charging-thin`: ImageVector
    get() {
        if (`_battery-charging-thin` != null) {
            return `_battery-charging-thin`!!
        }
        `_battery-charging-thin` = Builder(name = "Battery-charging-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 60.0f)
                lineTo(32.0f, 60.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 200.0f, 60.0f)
                close()
                moveTo(212.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(20.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 32.0f, 68.0f)
                lineTo(200.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(252.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(244.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(135.4f, 125.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.18f, 3.89f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 116.0f, 164.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, -5.37f)
                lineTo(125.53f, 132.0f)
                lineTo(100.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -5.79f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f)
                lineTo(106.47f, 124.0f)
                lineTo(132.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 135.4f, 125.9f)
                close()
            }
        }
        .build()
        return `_battery-charging-thin`!!
    }

private var `_battery-charging-thin`: ImageVector? = null

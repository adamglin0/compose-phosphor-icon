package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Battery-charging-vertical-bold`: ImageVector
    get() {
        if (`_battery-charging-vertical-bold` != null) {
            return `_battery-charging-vertical-bold`!!
        }
        `_battery-charging-vertical-bold` = Builder(name = "Battery-charging-vertical-bold",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.21f, 133.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.52f, 11.68f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.46f, -10.74f)
                lineTo(124.58f, 152.0f)
                lineTo(112.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.73f, -17.37f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.46f, 10.74f)
                lineTo(131.42f, 128.0f)
                lineTo(144.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 154.21f, 133.69f)
                close()
                moveTo(104.0f, 24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(204.0f, 60.0f)
                lineTo(204.0f, 228.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(80.0f, 256.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(52.0f, 60.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 80.0f, 32.0f)
                horizontalLineToRelative(96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 204.0f, 60.0f)
                close()
                moveTo(180.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(80.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(76.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return `_battery-charging-vertical-bold`!!
    }

private var `_battery-charging-vertical-bold`: ImageVector? = null

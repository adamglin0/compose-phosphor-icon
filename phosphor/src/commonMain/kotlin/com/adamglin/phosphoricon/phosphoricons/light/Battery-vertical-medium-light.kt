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

public val LightGroup.`Battery-vertical-medium-light`: ImageVector
    get() {
        if (`_battery-vertical-medium-light` != null) {
            return `_battery-vertical-medium-light`!!
        }
        `_battery-vertical-medium-light` = Builder(name = "Battery-vertical-medium-light",
                defaultWidth = 256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f,
                viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(90.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(96.0f, 14.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 90.0f, 8.0f)
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
                moveTo(160.0f, 154.0f)
                lineTo(96.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(160.0f, 194.0f)
                lineTo(96.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return `_battery-vertical-medium-light`!!
    }

private var `_battery-vertical-medium-light`: ImageVector? = null

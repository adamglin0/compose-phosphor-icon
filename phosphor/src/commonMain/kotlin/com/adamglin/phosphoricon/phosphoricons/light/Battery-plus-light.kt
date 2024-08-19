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

public val LightGroup.`Battery-plus-light`: ImageVector
    get() {
        if (`_battery-plus-light` != null) {
            return `_battery-plus-light`!!
        }
        `_battery-plus-light` = Builder(name = "Battery-plus-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(122.0f, 134.0f)
                verticalLineToRelative(22.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(110.0f, 134.0f)
                lineTo(88.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(22.0f)
                lineTo(110.0f, 100.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(22.0f)
                horizontalLineToRelative(22.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 150.0f, 128.0f)
                close()
                moveTo(222.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, 22.0f)
                lineTo(32.0f, 198.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -22.0f, -22.0f)
                lineTo(10.0f, 80.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 32.0f, 58.0f)
                lineTo(200.0f, 58.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 222.0f, 80.0f)
                close()
                moveTo(210.0f, 80.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                lineTo(32.0f, 70.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                lineTo(200.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                close()
                moveTo(248.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(254.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 90.0f)
                close()
            }
        }
        .build()
        return `_battery-plus-light`!!
    }

private var `_battery-plus-light`: ImageVector? = null

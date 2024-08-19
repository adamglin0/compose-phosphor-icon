package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Batterylow: ImageVector
    get() {
        if (_batterylow != null) {
            return _batterylow!!
        }
        _batterylow = Builder(name = "Batterylow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(62.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(50.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(254.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(242.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _batterylow!!
    }

private var _batterylow: ImageVector? = null

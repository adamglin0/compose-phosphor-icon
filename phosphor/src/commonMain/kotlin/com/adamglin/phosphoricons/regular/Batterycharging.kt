package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 56.0f)
                lineTo(32.0f, 56.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 8.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                lineTo(200.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(224.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 200.0f, 56.0f)
                close()
                moveTo(208.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(32.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(24.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                lineTo(200.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(256.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(240.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(138.81f, 123.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.35f, 7.79f)
                lineToRelative(-16.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.32f, -7.16f)
                lineTo(119.06f, 136.0f)
                lineTo(100.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, -11.58f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.32f, 7.16f)
                lineTo(112.94f, 120.0f)
                lineTo(132.0f, 120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 138.81f, 123.79f)
                close()
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null

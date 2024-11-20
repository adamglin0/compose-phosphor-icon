package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.BatteryCharging: ImageVector
    get() {
        if (_batteryCharging != null) {
            return _batteryCharging!!
        }
        _batteryCharging = Builder(name = "BatteryCharging", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(196.0f, 52.0f)
                lineTo(28.0f, 52.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 0.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(196.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(224.0f, 80.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 196.0f, 52.0f)
                close()
                moveTo(200.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(28.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(24.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(196.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(232.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(142.38f, 122.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineToRelative(-16.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -20.84f, -11.9f)
                lineTo(111.32f, 140.0f)
                lineTo(100.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.42f, -18.0f)
                lineToRelative(16.0f, -28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 126.42f, 106.0f)
                lineToRelative(-5.74f, 10.0f)
                lineTo(132.0f, 116.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 142.38f, 122.0f)
                close()
            }
        }
        .build()
        return _batteryCharging!!
    }

private var _batteryCharging: ImageVector? = null

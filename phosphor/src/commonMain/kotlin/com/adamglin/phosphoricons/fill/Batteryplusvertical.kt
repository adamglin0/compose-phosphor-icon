package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.BatteryPlusVertical: ImageVector
    get() {
        if (_batteryPlusVertical != null) {
            return _batteryPlusVertical!!
        }
        _batteryPlusVertical = Builder(name = "BatteryPlusVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(96.0f, 16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 8.0f)
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
                moveTo(164.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(136.0f, 132.0f)
                lineTo(136.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(20.0f)
                lineTo(100.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 148.0f)
                horizontalLineToRelative(20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 140.0f)
                close()
            }
        }
        .build()
        return _batteryPlusVertical!!
    }

private var _batteryPlusVertical: ImageVector? = null

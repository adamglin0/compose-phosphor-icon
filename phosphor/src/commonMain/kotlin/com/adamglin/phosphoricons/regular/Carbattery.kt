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

public val RegularGroup.CarBattery: ImageVector
    get() {
        if (_carBattery != null) {
            return _carBattery!!
        }
        _carBattery = Builder(name = "CarBattery", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 192.0f, 136.0f)
                close()
                moveTo(104.0f, 128.0f)
                lineTo(72.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(240.0f, 88.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 72.0f)
                lineTo(48.0f, 72.0f)
                lineTo(48.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 40.0f)
                lineTo(96.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(112.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                lineTo(144.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                lineTo(208.0f, 72.0f)
                horizontalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 240.0f, 88.0f)
                close()
                moveTo(160.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                lineTo(192.0f, 56.0f)
                lineTo(160.0f, 56.0f)
                close()
                moveTo(64.0f, 72.0f)
                lineTo(96.0f, 72.0f)
                lineTo(96.0f, 56.0f)
                lineTo(64.0f, 56.0f)
                close()
                moveTo(224.0f, 184.0f)
                lineTo(224.0f, 88.0f)
                lineTo(32.0f, 88.0f)
                verticalLineToRelative(96.0f)
                lineTo(224.0f, 184.0f)
                close()
            }
        }
        .build()
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null

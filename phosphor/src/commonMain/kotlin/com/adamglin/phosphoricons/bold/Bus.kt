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

public val BoldGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 64.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(84.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(104.0f, 192.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(60.0f, 168.0f)
                lineTo(60.0f, 112.0f)
                lineTo(196.0f, 112.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(72.0f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                lineTo(196.0f, 88.0f)
                lineTo(60.0f, 88.0f)
                lineTo(60.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 72.0f, 52.0f)
                close()
                moveTo(80.0f, 204.0f)
                lineTo(60.0f, 204.0f)
                lineTo(60.0f, 192.0f)
                lineTo(80.0f, 192.0f)
                close()
                moveTo(176.0f, 204.0f)
                lineTo(176.0f, 192.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                close()
                moveTo(108.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 108.0f, 140.0f)
                close()
                moveTo(180.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 140.0f)
                close()
                moveTo(256.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(232.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(24.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(0.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null

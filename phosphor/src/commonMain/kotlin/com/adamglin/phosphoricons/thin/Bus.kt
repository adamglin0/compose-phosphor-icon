package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 64.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(92.0f, 188.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 64.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(52.0f, 180.0f)
                lineTo(52.0f, 116.0f)
                lineTo(204.0f, 116.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(204.0f, 108.0f)
                lineTo(52.0f, 108.0f)
                lineTo(52.0f, 76.0f)
                lineTo(204.0f, 76.0f)
                close()
                moveTo(84.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 188.0f)
                lineTo(84.0f, 188.0f)
                close()
                moveTo(200.0f, 212.0f)
                lineTo(176.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(172.0f, 188.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(20.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 212.0f)
                close()
                moveTo(204.0f, 68.0f)
                lineTo(52.0f, 68.0f)
                lineTo(52.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 44.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(100.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 148.0f)
                close()
                moveTo(172.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 172.0f, 148.0f)
                close()
                moveTo(244.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(236.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(20.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(12.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null

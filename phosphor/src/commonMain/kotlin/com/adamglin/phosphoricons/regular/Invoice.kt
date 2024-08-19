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

public val RegularGroup.Invoice: ImageVector
    get() {
        if (_invoice != null) {
            return _invoice!!
        }
        _invoice = Builder(name = "Invoice", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(56.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 96.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(40.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(56.0f, 80.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(232.0f, 56.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(40.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(24.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                lineTo(160.0f, 192.0f)
                lineTo(160.0f, 160.0f)
                lineTo(80.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                lineTo(160.0f, 112.0f)
                lineTo(104.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(216.0f, 96.0f)
                lineTo(216.0f, 64.0f)
                lineTo(96.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(176.0f, 144.0f)
                horizontalLineToRelative(40.0f)
                lineTo(216.0f, 112.0f)
                lineTo(176.0f, 112.0f)
                close()
                moveTo(216.0f, 192.0f)
                lineTo(216.0f, 160.0f)
                lineTo(176.0f, 160.0f)
                verticalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _invoice!!
    }

private var _invoice: ImageVector? = null

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

public val BoldGroup.Pipe: ImageVector
    get() {
        if (_pipe != null) {
            return _pipe!!
        }
        _pipe = Builder(name = "Pipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 100.0f)
                lineTo(216.0f, 100.0f)
                lineTo(216.0f, 60.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(212.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, -8.0f)
                lineTo(172.0f, 28.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -16.0f, 8.0f)
                lineTo(144.0f, 36.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 36.0f, 144.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, 16.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.0f, 16.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 216.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(124.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 8.0f, -16.0f)
                lineTo(132.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -8.0f, -16.0f)
                lineTo(124.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, -20.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 16.0f, -8.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(108.0f, 176.0f)
                verticalLineToRelative(16.0f)
                lineTo(52.0f, 192.0f)
                lineTo(52.0f, 176.0f)
                close()
                moveTo(100.0f, 144.0f)
                verticalLineToRelative(8.0f)
                lineTo(60.0f, 152.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, true, 84.0f, -84.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(-8.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 100.0f, 144.0f)
                close()
                moveTo(176.0f, 52.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(56.0f)
                lineTo(176.0f, 108.0f)
                close()
            }
        }
        .build()
        return _pipe!!
    }

private var _pipe: ImageVector? = null

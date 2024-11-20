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

public val ThinGroup.Pipe: ImageVector
    get() {
        if (_pipe != null) {
            return _pipe!!
        }
        _pipe = Builder(name = "Pipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 108.0f)
                lineTo(204.0f, 108.0f)
                lineTo(204.0f, 52.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(203.3f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 36.0f)
                lineTo(176.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.3f, 8.0f)
                lineTo(144.0f, 44.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 44.0f, 144.0f)
                verticalLineToRelative(20.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 176.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, 11.3f)
                lineTo(44.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 204.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(116.0f, 203.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, -11.3f)
                lineTo(124.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.0f, -11.3f)
                lineTo(116.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(20.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.3f, -8.0f)
                lineTo(232.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(116.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(108.0f, 144.0f)
                verticalLineToRelative(20.0f)
                lineTo(52.0f, 164.0f)
                lineTo(52.0f, 144.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, true, 92.0f, -92.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(56.0f)
                lineTo(144.0f, 108.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 108.0f, 144.0f)
                close()
                moveTo(192.0f, 116.0f)
                lineTo(176.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(172.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 192.0f, 116.0f)
                close()
            }
        }
        .build()
        return _pipe!!
    }

private var _pipe: ImageVector? = null

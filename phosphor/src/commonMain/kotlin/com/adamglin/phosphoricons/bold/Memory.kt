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

public val BoldGroup.Memory: ImageVector
    get() {
        if (_memory != null) {
            return _memory!!
        }
        _memory = Builder(name = "Memory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 72.0f)
                lineTo(4.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(28.0f, 188.0f)
                lineTo(48.0f, 188.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(72.0f, 188.0f)
                lineTo(92.0f, 188.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 188.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(164.0f, 188.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(208.0f, 188.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(252.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(28.0f, 76.0f)
                lineTo(228.0f, 76.0f)
                verticalLineToRelative(88.0f)
                lineTo(28.0f, 164.0f)
                close()
                moveTo(120.0f, 140.0f)
                lineTo(120.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 140.0f)
                close()
                moveTo(96.0f, 128.0f)
                lineTo(68.0f, 128.0f)
                lineTo(68.0f, 112.0f)
                lineTo(96.0f, 112.0f)
                close()
                moveTo(148.0f, 152.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 148.0f, 152.0f)
                close()
                moveTo(160.0f, 112.0f)
                horizontalLineToRelative(28.0f)
                verticalLineToRelative(16.0f)
                lineTo(160.0f, 128.0f)
                close()
            }
        }
        .build()
        return _memory!!
    }

private var _memory: ImageVector? = null

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

public val RegularGroup.Cubefocus: ImageVector
    get() {
        if (_cubefocus != null) {
            return _cubefocus!!
        }
        _cubefocus = Builder(name = "Cubefocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(232.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(216.0f, 56.0f)
                lineTo(184.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 232.0f, 48.0f)
                close()
                moveTo(72.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(72.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(224.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                lineTo(184.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 160.0f)
                close()
                moveTo(32.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(40.0f, 56.0f)
                lineTo(72.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(32.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(24.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 96.0f)
                close()
                moveTo(188.0f, 167.0f)
                lineToRelative(-56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.94f, 0.0f)
                lineTo(68.0f, 167.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 160.0f)
                lineTo(64.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, -7.0f)
                lineToRelative(56.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.94f, 0.0f)
                lineToRelative(56.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.0f, 7.0f)
                verticalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 167.0f)
                close()
                moveTo(88.12f, 96.0f)
                lineTo(128.0f, 118.79f)
                lineTo(167.88f, 96.0f)
                lineTo(128.0f, 73.21f)
                close()
                moveTo(80.0f, 155.36f)
                lineToRelative(40.0f, 22.85f)
                lineTo(120.0f, 132.64f)
                lineTo(80.0f, 109.79f)
                close()
                moveTo(176.0f, 155.36f)
                lineTo(176.0f, 109.79f)
                lineToRelative(-40.0f, 22.85f)
                verticalLineToRelative(45.57f)
                close()
            }
        }
        .build()
        return _cubefocus!!
    }

private var _cubefocus: ImageVector? = null

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

public val RegularGroup.RectangleDashed: ImageVector
    get() {
        if (_rectangleDashed != null) {
            return _rectangleDashed!!
        }
        _rectangleDashed = Builder(name = "RectangleDashed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(40.0f, 56.0f)
                lineTo(40.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                lineTo(72.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 80.0f, 48.0f)
                close()
                moveTo(32.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(40.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 152.0f)
                close()
                moveTo(72.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(72.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 200.0f)
                lineTo(112.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(224.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                lineTo(184.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 184.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 176.0f)
                close()
                moveTo(224.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 112.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 104.0f)
                close()
                moveTo(216.0f, 40.0f)
                lineTo(184.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(144.0f, 40.0f)
                lineTo(112.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _rectangleDashed!!
    }

private var _rectangleDashed: ImageVector? = null

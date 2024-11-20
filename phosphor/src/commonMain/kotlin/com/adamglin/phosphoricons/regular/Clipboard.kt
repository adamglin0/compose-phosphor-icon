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

public val RegularGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 32.0f)
                lineTo(163.74f, 32.0f)
                arcToRelative(47.92f, 47.92f, 0.0f, false, false, -71.48f, 0.0f)
                lineTo(56.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 48.0f)
                lineTo(40.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 32.0f)
                close()
                moveTo(128.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                lineTo(96.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 128.0f, 32.0f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(56.0f, 216.0f)
                lineTo(56.0f, 48.0f)
                lineTo(82.75f, 48.0f)
                arcTo(47.93f, 47.93f, 0.0f, false, false, 80.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(47.93f, 47.93f, 0.0f, false, false, -2.75f, -16.0f)
                lineTo(200.0f, 48.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null

package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 34.0f)
                lineTo(162.83f, 34.0f)
                arcToRelative(45.91f, 45.91f, 0.0f, false, false, -69.66f, 0.0f)
                lineTo(56.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 48.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(200.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(214.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 34.0f)
                close()
                moveTo(128.0f, 30.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 34.0f, 34.0f)
                verticalLineToRelative(2.0f)
                lineTo(94.0f, 66.0f)
                lineTo(94.0f, 64.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 128.0f, 30.0f)
                close()
                moveTo(202.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(85.67f, 46.0f)
                arcTo(45.77f, 45.77f, 0.0f, false, false, 82.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(174.0f, 64.0f)
                arcToRelative(45.77f, 45.77f, 0.0f, false, false, -3.67f, -18.0f)
                lineTo(200.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null

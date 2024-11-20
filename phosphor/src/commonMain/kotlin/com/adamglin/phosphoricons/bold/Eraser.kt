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

public val BoldGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 204.0f)
                horizontalLineTo(141.0f)
                lineToRelative(86.84f, -86.84f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineTo(186.43f, 36.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(28.19f, 154.82f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(30.06f, 30.07f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 66.74f, 228.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(163.8f, 53.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(41.38f, 41.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.65f)
                lineTo(160.0f, 151.0f)
                lineToRelative(-47.0f, -47.0f)
                close()
                moveTo(71.71f, 204.0f)
                lineTo(45.16f, 177.45f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.65f)
                lineTo(96.0f, 121.0f)
                lineToRelative(47.0f, 47.0f)
                lineToRelative(-36.0f, 36.0f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null

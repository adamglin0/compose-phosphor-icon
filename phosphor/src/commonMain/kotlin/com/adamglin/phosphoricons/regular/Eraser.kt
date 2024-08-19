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

public val RegularGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.0f, 80.4f)
                lineTo(183.6f, 39.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -33.94f, 0.0f)
                lineTo(31.0f, 157.66f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineToRelative(30.06f, 30.06f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 66.74f, 224.0f)
                lineTo(216.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-84.7f)
                lineTo(225.0f, 114.34f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 225.0f, 80.4f)
                close()
                moveTo(108.68f, 208.0f)
                lineTo(70.05f, 208.0f)
                lineTo(42.33f, 180.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(96.0f, 115.31f)
                lineTo(148.69f, 168.0f)
                close()
                moveTo(213.68f, 103.0f)
                lineTo(160.0f, 156.69f)
                lineTo(107.31f, 104.0f)
                lineTo(161.0f, 50.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(41.38f, 41.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 11.31f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null

package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Treeevergreen: ImageVector
    get() {
        if (_treeevergreen != null) {
            return _treeevergreen!!
        }
        _treeevergreen = Builder(name = "Treeevergreen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.19f, 195.51f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 224.0f, 200.0f)
                horizontalLineTo(136.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineTo(200.0f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.31f, -12.91f)
                lineToRelative(46.0f, -59.09f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.34f, -12.88f)
                lineToRelative(80.0f, -104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.68f, 0.0f)
                lineToRelative(80.0f, 104.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 128.0f)
                horizontalLineTo(184.36f)
                lineToRelative(45.95f, 59.09f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 231.19f, 195.51f)
                close()
            }
        }
        .build()
        return _treeevergreen!!
    }

private var _treeevergreen: ImageVector? = null

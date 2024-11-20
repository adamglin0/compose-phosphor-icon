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

public val BoldGroup.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) {
            return _treeEvergreen!!
        }
        _treeEvergreen = Builder(name = "TreeEvergreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.47f, 184.63f)
                lineTo(192.54f, 132.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.51f, -19.32f)
                lineToRelative(-80.0f, -104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -19.0f, 0.0f)
                lineToRelative(-80.0f, 104.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 132.0f)
                horizontalLineTo(63.46f)
                lineTo(22.53f, 184.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 32.0f, 204.0f)
                horizontalLineToRelative(84.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(204.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.47f, -19.37f)
                close()
                moveTo(56.54f, 180.0f)
                lineToRelative(40.93f, -52.63f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 108.0f)
                horizontalLineTo(72.37f)
                lineTo(128.0f, 35.68f)
                lineTo(183.63f, 108.0f)
                horizontalLineTo(168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.47f, 19.37f)
                lineTo(199.46f, 180.0f)
                close()
            }
        }
        .build()
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null

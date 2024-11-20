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

public val BoldGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.23f, 112.31f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 104.0f)
                horizontalLineTo(220.0f)
                verticalLineTo(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(132.0f)
                lineTo(105.34f, 48.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, false, -12.0f, -4.0f)
                horizontalLineTo(40.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 64.0f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(211.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.33f, -8.0f)
                lineToRelative(28.49f, -81.47f)
                lineToRelative(0.06f, -0.17f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 248.23f, 112.31f)
                close()
                moveTo(92.0f, 68.0f)
                lineToRelative(28.8f, 21.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 92.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(69.77f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -18.94f, 13.58f)
                lineTo(44.0f, 137.15f)
                verticalLineTo(68.0f)
                close()
                moveTo(202.59f, 196.0f)
                horizontalLineTo(48.89f)
                lineToRelative(23.72f, -68.0f)
                horizontalLineTo(226.37f)
                close()
            }
        }
        .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null

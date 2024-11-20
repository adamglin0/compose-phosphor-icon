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

public val LightGroup.Tray: ImageVector
    get() {
        if (_tray != null) {
            return _tray!!
        }
        _tray = Builder(name = "Tray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 34.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 208.0f, 34.0f)
                close()
                moveTo(48.0f, 46.0f)
                horizontalLineTo(208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineTo(154.0f)
                horizontalLineTo(179.31f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, 4.1f)
                lineTo(150.1f, 177.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f)
                horizontalLineTo(107.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.58f)
                lineTo(86.59f, 158.1f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, -9.9f, -4.1f)
                horizontalLineTo(46.0f)
                verticalLineTo(48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 48.0f, 46.0f)
                close()
                moveTo(208.0f, 210.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(166.0f)
                horizontalLineTo(76.69f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.58f)
                lineTo(97.41f, 185.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(41.38f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(19.31f, -19.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.59f)
                horizontalLineTo(210.0f)
                verticalLineToRelative(42.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
            }
        }
        .build()
        return _tray!!
    }

private var _tray: ImageVector? = null

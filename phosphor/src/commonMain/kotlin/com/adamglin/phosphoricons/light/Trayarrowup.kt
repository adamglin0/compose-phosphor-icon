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

public val LightGroup.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) {
            return _trayArrowUp!!
        }
        _trayArrowUp = Builder(name = "TrayArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -9.89f, 4.1f)
                lineTo(150.1f, 177.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, 0.59f)
                horizontalLineTo(107.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.41f, -0.59f)
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
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, 0.59f)
                lineTo(97.41f, 185.9f)
                arcToRelative(13.94f, 13.94f, 0.0f, false, false, 9.9f, 4.1f)
                horizontalLineToRelative(41.38f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.89f, -4.1f)
                lineToRelative(19.32f, -19.31f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.41f, -0.59f)
                horizontalLineTo(210.0f)
                verticalLineToRelative(42.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 210.0f)
                close()
                moveTo(91.76f, 108.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -8.48f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.48f, 8.48f)
                lineTo(134.0f, 86.49f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(86.49f)
                lineToRelative(-21.76f, 21.75f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 91.76f, 108.24f)
                close()
            }
        }
        .build()
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null

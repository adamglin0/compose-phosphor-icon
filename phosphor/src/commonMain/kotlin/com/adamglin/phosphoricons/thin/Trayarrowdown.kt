package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.TrayArrowDown: ImageVector
    get() {
        if (_trayArrowDown != null) {
            return _trayArrowDown!!
        }
        _trayArrowDown = Builder(name = "TrayArrowDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                horizontalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(48.0f, 44.0f)
                horizontalLineTo(208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(156.0f)
                horizontalLineTo(179.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 3.51f)
                lineToRelative(-19.32f, 19.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, 1.17f)
                horizontalLineTo(107.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -1.17f)
                lineTo(85.17f, 159.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.69f, 156.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                close()
                moveTo(208.0f, 212.0f)
                horizontalLineTo(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(164.0f)
                horizontalLineTo(76.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineToRelative(19.32f, 19.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, 3.51f)
                horizontalLineToRelative(41.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.48f, -3.51f)
                lineToRelative(19.32f, -19.32f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, -1.17f)
                horizontalLineTo(212.0f)
                verticalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(93.17f, 122.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                lineTo(124.0f, 142.34f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(70.34f)
                lineToRelative(25.17f, -25.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.66f, 5.66f)
                lineToRelative(-32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 0.0f)
                close()
            }
        }
        .build()
        return _trayArrowDown!!
    }

private var _trayArrowDown: ImageVector? = null

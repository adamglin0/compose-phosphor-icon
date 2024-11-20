package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.TrayArrowUp: ImageVector
    get() {
        if (_trayArrowUp != null) {
            return _trayArrowUp!!
        }
        _trayArrowUp = Builder(name = "TrayArrowUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 48.0f)
                verticalLineTo(160.0f)
                horizontalLineTo(179.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineToRelative(-19.31f, 19.32f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, 2.34f)
                horizontalLineTo(107.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -2.34f)
                lineTo(82.34f, 162.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 76.68f, 160.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 32.0f)
                close()
                moveTo(208.0f, 48.0f)
                lineTo(208.0f, 152.0f)
                horizontalLineToRelative(-28.7f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 168.0f, 156.69f)
                lineTo(148.69f, 176.0f)
                lineTo(107.31f, 176.0f)
                lineTo(88.0f, 156.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 76.69f, 152.0f)
                lineTo(48.0f, 152.0f)
                lineTo(48.0f, 48.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 168.0f)
                lineTo(76.69f, 168.0f)
                lineTo(96.0f, 187.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 107.31f, 192.0f)
                horizontalLineToRelative(41.38f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 160.0f, 187.31f)
                lineTo(179.31f, 168.0f)
                lineTo(208.0f, 168.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(90.34f, 109.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.32f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(136.0f, 91.31f)
                lineTo(136.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 90.34f, 109.66f)
                close()
            }
        }
        .build()
        return _trayArrowUp!!
    }

private var _trayArrowUp: ImageVector? = null

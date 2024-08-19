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

public val DuotoneGroup.Floppydisk: ImageVector
    get() {
        if (_floppydisk != null) {
            return _floppydisk!!
        }
        _floppydisk = Builder(name = "Floppydisk", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 83.31f)
                verticalLineTo(208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(176.0f)
                verticalLineTo(152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineTo(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineTo(172.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.65f, 2.34f)
                lineToRelative(35.32f, 35.32f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 83.31f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.31f, 72.0f)
                lineTo(184.0f, 36.69f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 172.69f, 32.0f)
                lineTo(48.0f, 32.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 48.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(208.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 83.31f)
                arcTo(15.86f, 15.86f, 0.0f, false, false, 219.31f, 72.0f)
                close()
                moveTo(168.0f, 208.0f)
                lineTo(88.0f, 208.0f)
                lineTo(88.0f, 152.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(184.0f, 208.0f)
                lineTo(184.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(88.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 48.0f)
                lineTo(172.69f, 48.0f)
                lineTo(208.0f, 83.31f)
                close()
                moveTo(160.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.0f, 72.0f)
                close()
            }
        }
        .build()
        return _floppydisk!!
    }

private var _floppydisk: ImageVector? = null

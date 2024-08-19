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

public val DuotoneGroup.Cellsignalx: ImageVector
    get() {
        if (_cellsignalx != null) {
            return _cellsignalx!!
        }
        _cellsignalx = Builder(name = "Cellsignalx", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                verticalLineTo(160.0f)
                lineToRelative(-45.66f, 45.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.65f, 2.34f)
                horizontalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineToRelative(160.0f, -160.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 40.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.66f, 194.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(184.0f, 187.31f)
                lineToRelative(-18.35f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.31f, -11.32f)
                lineTo(172.68f, 176.0f)
                lineToRelative(-18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.31f, -11.31f)
                lineTo(184.0f, 164.68f)
                lineToRelative(18.34f, -18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.31f)
                lineTo(195.31f, 176.0f)
                close()
                moveTo(120.0f, 200.0f)
                horizontalLineTo(32.0f)
                lineTo(192.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.31f, -11.32f)
                lineToRelative(-160.0f, 160.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 216.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _cellsignalx!!
    }

private var _cellsignalx: ImageVector? = null

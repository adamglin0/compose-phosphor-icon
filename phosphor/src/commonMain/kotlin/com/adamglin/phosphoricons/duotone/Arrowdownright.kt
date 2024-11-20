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

public val DuotoneGroup.ArrowDownRight: ImageVector
    get() {
        if (_arrowDownRight != null) {
            return _arrowDownRight!!
        }
        _arrowDownRight = Builder(name = "ArrowDownRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(192.0f, 88.0f)
                verticalLineTo(192.0f)
                horizontalLineTo(88.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.06f, 80.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineTo(140.0f, 128.69f)
                lineTo(69.66f, 58.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 58.34f, 69.66f)
                lineTo(128.69f, 140.0f)
                lineTo(82.34f, 186.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 200.0f)
                horizontalLineTo(192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 195.06f, 80.61f)
                close()
                moveTo(184.0f, 184.0f)
                horizontalLineTo(107.31f)
                lineToRelative(38.34f, -38.34f)
                horizontalLineToRelative(0.0f)
                lineTo(184.0f, 107.31f)
                close()
            }
        }
        .build()
        return _arrowDownRight!!
    }

private var _arrowDownRight: ImageVector? = null

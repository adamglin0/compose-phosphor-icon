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

public val DuotoneGroup.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) {
            return _arrowBendUpRight!!
        }
        _arrowBendUpRight = Builder(name = "ArrowBendUpRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 104.0f)
                lineToRelative(-48.0f, 48.0f)
                verticalLineTo(56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.66f, 98.34f)
                lineToRelative(-48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 56.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 24.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, -88.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.66f, 98.34f)
                close()
                moveTo(184.0f, 132.69f)
                verticalLineTo(75.31f)
                lineTo(212.69f, 104.0f)
                close()
            }
        }
        .build()
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null

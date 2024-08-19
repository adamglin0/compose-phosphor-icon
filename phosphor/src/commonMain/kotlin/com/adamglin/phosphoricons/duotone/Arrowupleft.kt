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

public val DuotoneGroup.Arrowupleft: ImageVector
    get() {
        if (_arrowupleft != null) {
            return _arrowupleft!!
        }
        _arrowupleft = Builder(name = "Arrowupleft", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(168.0f, 64.0f)
                lineTo(64.0f, 168.0f)
                verticalLineTo(64.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.66f, 186.34f)
                lineTo(127.31f, 116.0f)
                lineToRelative(46.35f, -46.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 56.0f)
                horizontalLineTo(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.66f, 5.66f)
                lineTo(116.0f, 127.31f)
                lineToRelative(70.34f, 70.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(72.0f, 72.0f)
                horizontalLineToRelative(76.69f)
                lineToRelative(-38.34f, 38.34f)
                horizontalLineToRelative(0.0f)
                lineTo(72.0f, 148.69f)
                close()
            }
        }
        .build()
        return _arrowupleft!!
    }

private var _arrowupleft: ImageVector? = null

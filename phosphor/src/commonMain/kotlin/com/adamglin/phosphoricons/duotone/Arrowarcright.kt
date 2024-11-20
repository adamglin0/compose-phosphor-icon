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

public val DuotoneGroup.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) {
            return _arrowArcRight!!
        }
        _arrowArcRight = Builder(name = "ArrowArcRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(168.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.06f, 80.61f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.72f, 1.73f)
                lineToRelative(-26.48f, 26.49f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 24.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 148.53f, -63.84f)
                lineToRelative(-26.19f, 26.18f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 168.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.06f, 80.61f)
                close()
                moveTo(224.0f, 144.0f)
                horizontalLineTo(187.31f)
                lineTo(224.0f, 107.31f)
                close()
            }
        }
        .build()
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null

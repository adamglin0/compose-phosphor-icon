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

public val DuotoneGroup.Arrowuleftdown: ImageVector
    get() {
        if (_arrowuleftdown != null) {
            return _arrowuleftdown!!
        }
        _arrowuleftdown = Builder(name = "Arrowuleftdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(136.0f, 176.0f)
                lineTo(88.0f, 224.0f)
                lineTo(40.0f, 176.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 24.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 80.0f, 88.0f)
                verticalLineToRelative(80.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 168.0f)
                horizontalLineTo(96.0f)
                verticalLineTo(88.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(88.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 144.0f, 24.0f)
                close()
                moveTo(88.0f, 212.69f)
                lineTo(59.31f, 184.0f)
                horizontalLineToRelative(57.38f)
                close()
            }
        }
        .build()
        return _arrowuleftdown!!
    }

private var _arrowuleftdown: ImageVector? = null

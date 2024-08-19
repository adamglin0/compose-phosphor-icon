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

public val LightGroup.Arrowbendrightup: ImageVector
    get() {
        if (_arrowbendrightup != null) {
            return _arrowbendrightup!!
        }
        _arrowbendrightup = Builder(name = "Arrowbendrightup", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.24f, 84.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineTo(158.0f, 46.49f)
                verticalLineTo(128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 56.0f, 230.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                arcToRelative(90.1f, 90.1f, 0.0f, false, false, 90.0f, -90.0f)
                verticalLineTo(46.49f)
                lineTo(108.24f, 84.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 204.24f, 84.24f)
                close()
            }
        }
        .build()
        return _arrowbendrightup!!
    }

private var _arrowbendrightup: ImageVector? = null

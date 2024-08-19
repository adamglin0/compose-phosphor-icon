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

public val LightGroup.Arrowurightup: ImageVector
    get() {
        if (_arrowurightup != null) {
            return _arrowurightup!!
        }
        _arrowurightup = Builder(name = "Arrowurightup", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.24f, 84.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, 0.0f)
                lineTo(174.0f, 46.49f)
                verticalLineTo(168.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, -124.0f, 0.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, false, 100.0f, 0.0f)
                verticalLineTo(46.49f)
                lineTo(124.24f, 84.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.48f, -8.48f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.48f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 220.24f, 84.24f)
                close()
            }
        }
        .build()
        return _arrowurightup!!
    }

private var _arrowurightup: ImageVector? = null

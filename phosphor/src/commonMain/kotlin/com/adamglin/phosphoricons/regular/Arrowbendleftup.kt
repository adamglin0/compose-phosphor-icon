package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Arrowbendleftup: ImageVector
    get() {
        if (_arrowbendleftup != null) {
            return _arrowbendleftup!!
        }
        _arrowbendleftup = Builder(name = "Arrowbendleftup", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 96.0f, 128.0f)
                verticalLineTo(51.31f)
                lineTo(61.66f, 85.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 50.34f, 74.34f)
                lineToRelative(48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 0.0f)
                lineToRelative(48.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(112.0f, 51.31f)
                verticalLineTo(128.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 88.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 224.0f)
                close()
            }
        }
        .build()
        return _arrowbendleftup!!
    }

private var _arrowbendleftup: ImageVector? = null

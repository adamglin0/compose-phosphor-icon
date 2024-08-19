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

public val LightGroup.Numbertwo: ImageVector
    get() {
        if (_numbertwo != null) {
            return _numbertwo!!
        }
        _numbertwo = Builder(name = "Numbertwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.8f, -9.6f)
                lineToRelative(72.0f, -95.92f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -31.88f, -54.14f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 96.83f, 74.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.0f, -4.81f)
                arcToRelative(46.47f, 46.47f, 0.0f, false, true, 5.43f, -9.28f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, 73.48f, 55.37f)
                lineTo(100.0f, 202.0f)
                horizontalLineToRelative(68.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 208.0f)
                close()
            }
        }
        .build()
        return _numbertwo!!
    }

private var _numbertwo: ImageVector? = null

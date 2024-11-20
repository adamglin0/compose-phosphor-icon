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

public val LightGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.62f, 119.45f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, -47.24f, 0.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, true, false, 47.24f, 0.0f)
                close()
                moveTo(94.0f, 80.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 80.0f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, true, true, 42.0f, -42.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 210.0f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null

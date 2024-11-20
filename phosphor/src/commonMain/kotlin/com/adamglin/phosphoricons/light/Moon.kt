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

public val LightGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.13f, 143.64f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -1.49f)
                arcTo(90.07f, 90.07f, 0.0f, false, true, 113.86f, 29.85f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.49f, -7.48f)
                arcTo(102.88f, 102.88f, 0.0f, false, false, 54.48f, 58.68f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 197.32f, 201.52f)
                arcToRelative(102.88f, 102.88f, 0.0f, false, false, 36.31f, -51.89f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.13f, 143.64f)
                close()
                moveTo(190.13f, 191.93f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -126.0f, -126.0f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 99.65f, 37.66f)
                arcTo(102.06f, 102.06f, 0.0f, false, false, 218.34f, 156.35f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 190.1f, 191.93f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

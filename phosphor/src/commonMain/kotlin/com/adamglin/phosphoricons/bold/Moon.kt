package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.37f, 139.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -3.0f)
                arcTo(84.07f, 84.07f, 0.0f, false, true, 119.6f, 31.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.0f, -15.0f)
                arcTo(108.86f, 108.86f, 0.0f, false, false, 49.69f, 55.07f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 136.0f, 228.0f)
                arcToRelative(107.09f, 107.09f, 0.0f, false, false, 64.93f, -21.69f)
                arcToRelative(108.86f, 108.86f, 0.0f, false, false, 38.44f, -54.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 236.37f, 139.4f)
                close()
                moveTo(186.49f, 187.14f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 68.86f, 69.51f)
                arcTo(84.93f, 84.93f, 0.0f, false, true, 92.27f, 48.29f)
                quadTo(92.0f, 52.13f, 92.0f, 56.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 200.0f, 164.0f)
                quadToRelative(3.87f, 0.0f, 7.71f, -0.27f)
                arcTo(84.79f, 84.79f, 0.0f, false, true, 186.49f, 187.14f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null

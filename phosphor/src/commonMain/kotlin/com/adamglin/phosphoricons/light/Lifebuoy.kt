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

public val LightGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(164.47f, 156.0f)
                arcToRelative(45.87f, 45.87f, 0.0f, false, false, 0.0f, -56.0f)
                lineToRelative(31.24f, -31.23f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, true, 0.0f, 118.44f)
                close()
                moveTo(94.0f, 128.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, 34.0f, 34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 94.0f, 128.0f)
                close()
                moveTo(187.22f, 60.29f)
                lineTo(156.0f, 91.53f)
                arcToRelative(45.87f, 45.87f, 0.0f, false, false, -56.0f, 0.0f)
                lineTo(68.78f, 60.29f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, true, 118.44f, 0.0f)
                close()
                moveTo(60.29f, 68.78f)
                lineTo(91.53f, 100.0f)
                arcToRelative(45.87f, 45.87f, 0.0f, false, false, 0.0f, 56.0f)
                lineTo(60.29f, 187.22f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, true, 0.0f, -118.44f)
                close()
                moveTo(68.78f, 195.71f)
                lineTo(100.0f, 164.47f)
                arcToRelative(45.87f, 45.87f, 0.0f, false, false, 56.0f, 0.0f)
                lineToRelative(31.23f, 31.24f)
                arcToRelative(89.81f, 89.81f, 0.0f, false, true, -118.44f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null

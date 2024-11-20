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

public val LightGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.43f, 130.55f)
                curveTo(215.84f, 176.57f, 197.0f, 198.0f, 178.0f, 198.0f)
                curveToRelative(-23.83f, 0.0f, -39.2f, -32.76f, -55.47f, -67.45f)
                curveTo(109.26f, 102.17f, 94.17f, 70.0f, 78.0f, 70.0f)
                curveToRelative(-9.18f, 0.0f, -25.0f, 10.5f, -48.53f, 60.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -10.86f, -5.1f)
                curveTo(40.16f, 79.43f, 59.0f, 58.0f, 78.0f, 58.0f)
                curveToRelative(23.83f, 0.0f, 39.2f, 32.76f, 55.47f, 67.45f)
                curveTo(146.74f, 153.83f, 161.83f, 186.0f, 178.0f, 186.0f)
                curveToRelative(9.18f, 0.0f, 25.05f, -10.5f, 48.53f, -60.55f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.86f, 5.1f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null

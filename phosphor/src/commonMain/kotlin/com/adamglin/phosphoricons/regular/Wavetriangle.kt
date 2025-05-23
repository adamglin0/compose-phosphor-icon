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

public val RegularGroup.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) {
            return _waveTriangle!!
        }
        _waveTriangle = Builder(name = "WaveTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.48f, 132.68f)
                lineToRelative(-52.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.0f, 0.0f)
                lineTo(76.0f, 69.66f)
                lineToRelative(-45.51f, 63.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -13.0f, -9.36f)
                lineToRelative(52.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.0f, 0.0f)
                lineToRelative(97.51f, 135.0f)
                lineToRelative(45.51f, -63.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.0f, 9.36f)
                close()
            }
        }
        .build()
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null

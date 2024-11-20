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

public val LightGroup.WaveSawtooth: ImageVector
    get() {
        if (_waveSawtooth != null) {
            return _waveSawtooth!!
        }
        _waveSawtooth = Builder(name = "WaveSawtooth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.14f, 133.11f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 122.0f, 192.0f)
                verticalLineTo(74.74f)
                lineTo(27.15f, 133.11f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.29f, -10.22f)
                lineToRelative(104.0f, -64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 134.0f, 64.0f)
                verticalLineTo(181.26f)
                lineToRelative(94.85f, -58.37f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 6.29f, 10.22f)
                close()
            }
        }
        .build()
        return _waveSawtooth!!
    }

private var _waveSawtooth: ImageVector? = null

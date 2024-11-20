package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 40.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 56.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 40.0f)
                close()
                moveTo(211.22f, 131.44f)
                curveToRelative(-16.68f, 35.0f, -31.06f, 50.56f, -46.65f, 50.56f)
                curveToRelative(-19.68f, 0.0f, -31.39f, -24.56f, -43.79f, -50.56f)
                curveTo(112.0f, 113.0f, 101.0f, 90.0f, 91.43f, 90.0f)
                curveToRelative(-3.74f, 0.0f, -14.37f, 4.0f, -32.21f, 41.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.44f, -6.88f)
                curveTo(61.46f, 89.59f, 75.84f, 74.0f, 91.43f, 74.0f)
                curveToRelative(19.68f, 0.0f, 31.39f, 24.56f, 43.79f, 50.56f)
                curveTo(144.0f, 143.0f, 155.0f, 166.0f, 164.57f, 166.0f)
                curveToRelative(3.74f, 0.0f, 14.37f, -4.0f, 32.21f, -41.44f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 14.44f, 6.88f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null

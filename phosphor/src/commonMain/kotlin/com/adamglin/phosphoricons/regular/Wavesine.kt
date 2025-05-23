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

public val RegularGroup.WaveSine: ImageVector
    get() {
        if (_waveSine != null) {
            return _waveSine!!
        }
        _waveSine = Builder(name = "WaveSine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.24f, 131.4f)
                curveToRelative(-22.0f, 46.8f, -41.4f, 68.6f, -61.2f, 68.6f)
                curveToRelative(-25.1f, 0.0f, -40.73f, -33.32f, -57.28f, -68.6f)
                curveTo(107.7f, 103.56f, 92.9f, 72.0f, 78.0f, 72.0f)
                curveToRelative(-16.4f, 0.0f, -36.31f, 37.21f, -46.72f, 59.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -14.48f, -6.8f)
                curveTo(38.71f, 77.8f, 58.16f, 56.0f, 78.0f, 56.0f)
                curveToRelative(25.1f, 0.0f, 40.73f, 33.32f, 57.28f, 68.6f)
                curveTo(148.3f, 152.44f, 163.1f, 184.0f, 178.0f, 184.0f)
                curveToRelative(16.4f, 0.0f, 36.31f, -37.21f, 46.72f, -59.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.48f, 6.8f)
                close()
            }
        }
        .build()
        return _waveSine!!
    }

private var _waveSine: ImageVector? = null

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

public val BoldGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(163.27f, 77.0f)
                lineToRelative(-56.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -6.3f, 6.3f)
                lineToRelative(-24.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.73f, 179.0f)
                lineToRelative(56.0f, -24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.3f, -6.3f)
                lineToRelative(24.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 163.27f, 77.0f)
                close()
                moveTo(134.86f, 134.89f)
                lineTo(110.86f, 145.18f)
                lineTo(121.15f, 121.18f)
                lineTo(145.15f, 110.89f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null

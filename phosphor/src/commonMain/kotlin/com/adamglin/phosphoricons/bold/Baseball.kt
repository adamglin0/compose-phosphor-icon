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

public val BoldGroup.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(77.0f, 194.66f)
                arcTo(108.9f, 108.9f, 0.0f, false, false, 85.54f, 182.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.77f, -12.0f)
                arcTo(83.28f, 83.28f, 0.0f, false, true, 60.0f, 177.27f)
                arcToRelative(83.73f, 83.73f, 0.0f, false, true, 0.0f, -98.54f)
                arcTo(83.28f, 83.28f, 0.0f, false, true, 64.77f, 86.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 85.54f, 74.0f)
                arcTo(108.9f, 108.9f, 0.0f, false, false, 77.0f, 61.34f)
                arcToRelative(83.76f, 83.76f, 0.0f, false, true, 102.06f, 0.0f)
                arcTo(108.9f, 108.9f, 0.0f, false, false, 170.46f, 74.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 20.77f, 12.0f)
                arcTo(83.28f, 83.28f, 0.0f, false, true, 196.0f, 78.73f)
                arcToRelative(83.73f, 83.73f, 0.0f, false, true, 0.0f, 98.54f)
                arcToRelative(83.28f, 83.28f, 0.0f, false, true, -4.74f, -7.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -20.77f, 12.0f)
                arcTo(108.9f, 108.9f, 0.0f, false, false, 179.0f, 194.66f)
                arcToRelative(83.76f, 83.76f, 0.0f, false, true, -102.06f, 0.0f)
                close()
                moveTo(99.2f, 114.52f)
                arcTo(110.0f, 110.0f, 0.0f, false, true, 100.0f, 128.0f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, true, -0.83f, 13.48f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 87.27f, 152.0f)
                arcToRelative(12.83f, 12.83f, 0.0f, false, true, -1.5f, -0.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.42f, -13.39f)
                arcTo(85.75f, 85.75f, 0.0f, false, false, 76.0f, 128.0f)
                arcToRelative(85.75f, 85.75f, 0.0f, false, false, -0.65f, -10.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.82f, -3.0f)
                close()
                moveTo(170.26f, 151.91f)
                arcToRelative(12.83f, 12.83f, 0.0f, false, true, -1.5f, 0.09f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, -10.52f)
                arcToRelative(109.88f, 109.88f, 0.0f, false, true, 0.0f, -27.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.82f, 3.0f)
                arcToRelative(85.46f, 85.46f, 0.0f, false, false, 0.0f, 21.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 170.23f, 151.91f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null

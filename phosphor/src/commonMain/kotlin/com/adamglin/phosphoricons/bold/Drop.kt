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

public val BoldGroup.Drop: ImageVector
    get() {
        if (_drop != null) {
            return _drop!!
        }
        _drop = Builder(name = "Drop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.88f, 6.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f)
                arcToRelative(259.0f, 259.0f, 0.0f, false, false, -42.18f, 39.0f)
                curveTo(50.85f, 77.43f, 36.0f, 111.62f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, -68.0f, -68.0f)
                curveToRelative(0.0f, -33.31f, 20.0f, -63.37f, 36.7f, -82.71f)
                arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 31.11f)
                arcToRelative(249.35f, 249.35f, 0.0f, false, true, 31.3f, 30.18f)
                curveTo(176.0f, 80.63f, 196.0f, 110.69f, 196.0f, 144.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(177.62f, 159.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -34.0f, 34.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, 0.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.45f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.32f, -18.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, 7.2f)
                close()
            }
        }
        .build()
        return _drop!!
    }

private var _drop: ImageVector? = null

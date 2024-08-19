package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.17f, 84.83f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -86.34f, 86.34f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 86.34f, -86.34f)
                close()
                moveTo(28.0f, 96.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 162.93f, 84.07f)
                curveToRelative(-1.0f, 0.0f, -2.0f, -0.07f, -2.93f, -0.07f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, -76.0f, 76.0f)
                curveToRelative(0.0f, 1.0f, 0.0f, 2.0f, 0.07f, 2.93f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 28.0f, 96.0f)
                close()
                moveTo(164.0f, 96.0f)
                arcToRelative(67.59f, 67.59f, 0.0f, false, true, -7.45f, 30.89f)
                lineTo(129.11f, 99.45f)
                arcTo(67.59f, 67.59f, 0.0f, false, true, 160.0f, 92.0f)
                curveToRelative(1.3f, 0.0f, 2.6f, 0.0f, 3.88f, 0.12f)
                curveTo(164.0f, 93.4f, 164.0f, 94.7f, 164.0f, 96.0f)
                close()
                moveTo(92.0f, 160.0f)
                arcToRelative(67.59f, 67.59f, 0.0f, false, true, 7.45f, -30.89f)
                lineToRelative(27.44f, 27.44f)
                arcTo(67.59f, 67.59f, 0.0f, false, true, 96.0f, 164.0f)
                curveToRelative(-1.3f, 0.0f, -2.6f, -0.05f, -3.88f, -0.12f)
                curveTo(92.05f, 162.6f, 92.0f, 161.3f, 92.0f, 160.0f)
                close()
                moveTo(134.0f, 152.36f)
                lineTo(103.64f, 122.0f)
                arcTo(68.74f, 68.74f, 0.0f, false, true, 122.0f, 103.64f)
                lineTo(152.36f, 134.0f)
                arcTo(68.74f, 68.74f, 0.0f, false, true, 134.0f, 152.36f)
                close()
                moveTo(160.0f, 228.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -66.93f, -56.07f)
                curveToRelative(1.0f, 0.0f, 2.0f, 0.07f, 2.93f, 0.07f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, false, 76.0f, -76.0f)
                curveToRelative(0.0f, -1.0f, 0.0f, -2.0f, -0.07f, -2.93f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 160.0f, 228.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null

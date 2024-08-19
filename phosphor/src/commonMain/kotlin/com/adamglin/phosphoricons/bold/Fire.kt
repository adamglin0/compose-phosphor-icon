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

public val BoldGroup.Fire: ImageVector
    get() {
        if (_fire != null) {
            return _fire!!
        }
        _fire = Builder(name = "Fire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(177.62f, 159.6f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -34.0f, 34.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -3.6f, 0.55f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.6f, -23.45f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.32f, -18.32f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 22.9f, 7.2f)
                close()
                moveTo(220.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                curveToRelative(0.0f, -28.81f, 11.27f, -58.18f, 33.48f, -87.28f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.9f, -1.33f)
                lineTo(107.07f, 74.5f)
                lineTo(127.0f, 19.89f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.94f, -5.12f)
                curveTo(168.2f, 33.25f, 220.0f, 82.85f, 220.0f, 144.0f)
                close()
                moveTo(196.0f, 144.0f)
                curveToRelative(0.0f, -41.71f, -30.61f, -78.39f, -52.52f, -99.29f)
                lineToRelative(-20.21f, 55.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.63f, 4.5f)
                lineTo(80.71f, 82.36f)
                curveTo(67.0f, 103.38f, 60.0f, 124.06f, 60.0f, 144.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, 136.0f, 0.0f)
                close()
            }
        }
        .build()
        return _fire!!
    }

private var _fire: ImageVector? = null

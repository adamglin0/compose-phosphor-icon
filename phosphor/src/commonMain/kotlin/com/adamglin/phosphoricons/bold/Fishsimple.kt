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

public val BoldGroup.FishSimple: ImageVector
    get() {
        if (_fishSimple != null) {
            return _fishSimple!!
        }
        _fishSimple = Builder(name = "FishSimple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 172.0f, 76.0f)
                close()
                moveTo(236.0f, 76.66f)
                curveToRelative(0.32f, 31.85f, -7.55f, 59.77f, -22.74f, 80.76f)
                curveToRelative(-15.66f, 21.65f, -38.89f, 36.21f, -69.0f, 43.29f)
                curveToRelative(-19.2f, 4.52f, -41.39f, 6.0f, -66.36f, 4.38f)
                quadToRelative(2.27f, 15.49f, 6.0f, 32.34f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -23.44f, 5.14f)
                quadToRelative(-4.58f, -20.85f, -7.08f, -39.91f)
                quadToRelative(-19.0f, -2.5f, -39.87f, -7.07f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.14f, -23.44f)
                quadToRelative(16.83f, 3.67f, 32.31f, 6.0f)
                curveToRelative(-1.58f, -25.0f, -0.13f, -47.12f, 4.38f, -66.3f)
                curveToRelative(7.08f, -30.14f, 21.64f, -53.36f, 43.27f, -69.0f)
                curveToRelative(21.0f, -15.21f, 48.92f, -23.1f, 80.78f, -22.77f)
                curveToRelative(21.79f, 0.21f, 42.0f, 4.42f, 45.8f, 6.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.24f, 4.23f)
                curveTo(231.57f, 34.64f, 235.78f, 54.87f, 236.0f, 76.66f)
                close()
                moveTo(177.54f, 159.94f)
                arcTo(116.08f, 116.08f, 0.0f, false, true, 96.06f, 78.46f)
                curveToRelative(-9.21f, 12.16f, -15.56f, 27.57f, -18.93f, 46.0f)
                curveToRelative(-3.0f, 16.39f, -3.66f, 35.25f, -2.0f, 56.39f)
                curveToRelative(21.16f, 1.65f, 40.0f, 1.0f, 56.42f, -2.0f)
                curveTo(150.0f, 175.49f, 165.37f, 169.14f, 177.53f, 159.94f)
                close()
                moveTo(209.0f, 47.0f)
                curveToRelative(-15.9f, -3.0f, -59.3f, -8.45f, -92.26f, 12.44f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 79.81f, 79.82f)
                curveTo(217.43f, 106.32f, 212.0f, 62.92f, 209.0f, 47.0f)
                close()
            }
        }
        .build()
        return _fishSimple!!
    }

private var _fishSimple: ImageVector? = null

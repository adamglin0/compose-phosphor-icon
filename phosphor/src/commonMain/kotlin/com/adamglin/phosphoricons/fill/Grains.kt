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

public val FillGroup.Grains: ImageVector
    get() {
        if (_grains != null) {
            return _grains!!
        }
        _grains = Builder(name = "Grains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 56.0f)
                arcToRelative(87.52f, 87.52f, 0.0f, false, false, -31.84f, 6.0f)
                curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                curveTo(123.1f, 17.51f, 94.17f, 32.27f, 79.85f, 62.0f)
                arcTo(87.52f, 87.52f, 0.0f, false, false, 48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(88.12f, 88.12f, 0.0f, false, false, 75.48f, 87.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.52f, -4.0f)
                lineTo(120.0f, 176.27f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, 7.47f, -8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.53f, 8.0f)
                verticalLineToRelative(51.14f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.52f, 4.0f)
                arcTo(88.12f, 88.12f, 0.0f, false, false, 216.0f, 144.0f)
                lineTo(216.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 56.0f)
                close()
                moveTo(120.0f, 149.46f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, -37.09f)
                lineTo(56.0f, 72.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 144.0f)
                close()
                moveTo(128.0f, 107.36f)
                arcTo(88.61f, 88.61f, 0.0f, false, false, 94.16f, 69.11f)
                curveToRelative(9.21f, -19.21f, 26.4f, -31.33f, 33.84f, -35.9f)
                curveToRelative(7.45f, 4.58f, 24.63f, 16.7f, 33.84f, 35.9f)
                arcTo(88.61f, 88.61f, 0.0f, false, false, 128.0f, 107.36f)
                close()
                moveTo(200.0f, 112.36f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, 37.09f)
                lineTo(136.0f, 144.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f)
                close()
            }
        }
        .build()
        return _grains!!
    }

private var _grains: ImageVector? = null

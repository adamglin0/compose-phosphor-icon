package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Grains: ImageVector
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
                arcToRelative(87.53f, 87.53f, 0.0f, false, false, -31.85f, 6.0f)
                curveToRelative(-14.32f, -29.7f, -43.25f, -44.46f, -44.57f, -45.12f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.16f, 0.0f)
                curveToRelative(-1.33f, 0.66f, -30.25f, 15.42f, -44.57f, 45.12f)
                arcTo(87.53f, 87.53f, 0.0f, false, false, 48.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                lineTo(216.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 208.0f, 56.0f)
                close()
                moveTo(120.0f, 215.56f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 56.0f, 144.0f)
                lineTo(56.0f, 128.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 200.0f)
                close()
                moveTo(120.0f, 149.46f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, -64.0f, -37.09f)
                lineTo(56.0f, 72.44f)
                arcTo(72.1f, 72.1f, 0.0f, false, true, 120.0f, 144.0f)
                close()
                moveTo(94.15f, 69.11f)
                curveToRelative(9.22f, -19.21f, 26.41f, -31.33f, 33.85f, -35.9f)
                curveToRelative(7.44f, 4.58f, 24.63f, 16.7f, 33.84f, 35.9f)
                arcTo(88.61f, 88.61f, 0.0f, false, false, 128.0f, 107.36f)
                arcTo(88.57f, 88.57f, 0.0f, false, false, 94.15f, 69.11f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, -64.0f, 71.56f)
                lineTo(136.0f, 200.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 64.0f, -71.56f)
                close()
                moveTo(200.0f, 112.37f)
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

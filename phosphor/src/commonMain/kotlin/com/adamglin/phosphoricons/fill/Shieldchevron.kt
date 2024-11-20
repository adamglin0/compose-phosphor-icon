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

public val FillGroup.ShieldChevron: ImageVector
    get() {
        if (_shieldChevron != null) {
            return _shieldChevron!!
        }
        _shieldChevron = Builder(name = "ShieldChevron", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(48.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 52.72f, 25.52f, 84.67f, 46.93f, 102.19f)
                curveToRelative(23.06f, 18.86f, 46.0f, 25.26f, 47.0f, 25.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 0.0f)
                curveToRelative(1.0f, -0.27f, 23.91f, -6.67f, 47.0f, -25.53f)
                curveTo(198.48f, 196.67f, 224.0f, 164.72f, 224.0f, 112.0f)
                lineTo(224.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 40.0f)
                close()
                moveTo(208.0f, 112.0f)
                quadToRelative(0.0f, 26.31f, -9.14f, 47.84f)
                lineToRelative(-66.27f, -46.39f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                lineTo(57.13f, 159.84f)
                curveTo(51.06f, 145.52f, 48.0f, 129.54f, 48.0f, 112.0f)
                lineToRelative(0.0f, -56.0f)
                lineToRelative(160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldChevron!!
    }

private var _shieldChevron: ImageVector? = null

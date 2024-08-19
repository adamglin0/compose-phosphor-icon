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

public val RegularGroup.Drophalf: ImageVector
    get() {
        if (_drophalf != null) {
            return _drophalf!!
        }
        _drophalf = Builder(name = "Drophalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 47.75f)
                arcToRelative(254.19f, 254.19f, 0.0f, false, false, -41.45f, -38.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.18f, 0.0f)
                arcTo(254.19f, 254.19f, 0.0f, false, false, 82.0f, 47.75f)
                curveTo(54.51f, 79.32f, 40.0f, 112.6f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 112.6f, 201.49f, 79.32f, 174.0f, 47.75f)
                close()
                moveTo(200.0f, 144.0f)
                arcToRelative(70.57f, 70.57f, 0.0f, false, true, -0.46f, 8.0f)
                lineTo(136.0f, 152.0f)
                lineTo(136.0f, 136.0f)
                horizontalLineToRelative(63.64f)
                quadTo(200.0f, 140.0f, 200.0f, 144.0f)
                close()
                moveTo(183.39f, 88.0f)
                lineTo(136.0f, 88.0f)
                lineTo(136.0f, 72.0f)
                horizontalLineToRelative(36.89f)
                arcTo(175.85f, 175.85f, 0.0f, false, true, 183.39f, 88.0f)
                close()
                moveTo(136.0f, 200.0f)
                horizontalLineToRelative(37.19f)
                arcTo(71.67f, 71.67f, 0.0f, false, true, 136.0f, 215.54f)
                close()
                moveTo(136.0f, 184.0f)
                lineTo(136.0f, 168.0f)
                horizontalLineToRelative(59.87f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -8.0f, 16.0f)
                close()
                moveTo(136.0f, 120.0f)
                lineTo(136.0f, 104.0f)
                horizontalLineToRelative(55.39f)
                arcToRelative(116.84f, 116.84f, 0.0f, false, true, 5.45f, 16.0f)
                close()
                moveTo(159.89f, 56.0f)
                lineTo(136.0f, 56.0f)
                lineTo(136.0f, 32.6f)
                arcTo(257.22f, 257.22f, 0.0f, false, true, 159.89f, 56.0f)
                close()
                moveTo(56.0f, 144.0f)
                curveToRelative(0.0f, -50.0f, 42.26f, -92.71f, 64.0f, -111.4f)
                lineTo(120.0f, 215.54f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 56.0f, 144.0f)
                close()
            }
        }
        .build()
        return _drophalf!!
    }

private var _drophalf: ImageVector? = null

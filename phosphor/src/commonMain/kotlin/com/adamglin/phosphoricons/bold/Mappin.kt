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

public val BoldGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 60.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 60.0f)
                close()
                moveTo(128.0f, 124.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 128.0f, 124.0f)
                close()
                moveTo(128.0f, 12.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                curveToRelative(0.0f, 77.36f, 81.64f, 135.4f, 85.12f, 137.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.76f, 0.0f)
                arcToRelative(259.0f, 259.0f, 0.0f, false, false, 42.18f, -39.0f)
                curveTo(205.15f, 170.57f, 220.0f, 136.37f, 220.0f, 104.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 12.0f)
                close()
                moveTo(159.3f, 186.71f)
                arcTo(249.35f, 249.35f, 0.0f, false, true, 128.0f, 216.89f)
                arcToRelative(249.35f, 249.35f, 0.0f, false, true, -31.3f, -30.18f)
                curveTo(80.0f, 167.37f, 60.0f, 137.31f, 60.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveTo(196.0f, 137.31f, 176.0f, 167.37f, 159.3f, 186.71f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null

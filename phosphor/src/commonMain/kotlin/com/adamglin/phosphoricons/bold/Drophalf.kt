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

public val BoldGroup.Drophalf: ImageVector
    get() {
        if (_drophalf != null) {
            return _drophalf!!
        }
        _drophalf = Builder(name = "Drophalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(134.88f, 6.17f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.76f, 0.0f)
                arcToRelative(259.0f, 259.0f, 0.0f, false, false, -42.18f, 39.0f)
                curveTo(50.85f, 77.43f, 36.0f, 111.63f, 36.0f, 144.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, false, 184.0f, 0.0f)
                curveTo(220.0f, 66.64f, 138.36f, 8.6f, 134.88f, 6.17f)
                close()
                moveTo(194.08f, 160.0f)
                lineTo(140.0f, 160.0f)
                lineTo(140.0f, 144.0f)
                horizontalLineToRelative(56.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 194.08f, 160.0f)
                close()
                moveTo(140.0f, 120.0f)
                lineTo(140.0f, 104.0f)
                horizontalLineToRelative(47.0f)
                arcToRelative(115.0f, 115.0f, 0.0f, false, true, 5.68f, 16.0f)
                close()
                moveTo(159.3f, 61.29f)
                arcTo(197.29f, 197.29f, 0.0f, false, true, 173.68f, 80.0f)
                lineTo(140.0f, 80.0f)
                lineTo(140.0f, 41.46f)
                arcTo(243.5f, 243.5f, 0.0f, false, true, 159.3f, 61.29f)
                close()
                moveTo(60.0f, 144.0f)
                curveToRelative(0.0f, -33.31f, 20.0f, -63.37f, 36.7f, -82.71f)
                arcTo(243.5f, 243.5f, 0.0f, false, true, 116.0f, 41.46f)
                lineTo(116.0f, 210.92f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 60.0f, 144.0f)
                close()
                moveTo(140.0f, 210.92f)
                lineTo(140.0f, 184.0f)
                horizontalLineToRelative(42.94f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 140.0f, 210.92f)
                close()
            }
        }
        .build()
        return _drophalf!!
    }

private var _drophalf: ImageVector? = null

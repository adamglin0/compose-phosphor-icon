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

public val BoldGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.7f, 29.3f)
                arcToRelative(31.83f, 31.83f, 0.0f, false, false, -45.0f, 0.0f)
                lineTo(15.52f, 203.56f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 5.78f, 20.19f)
                arcTo(164.85f, 164.85f, 0.0f, false, false, 58.42f, 228.0f)
                curveToRelative(33.71f, 0.0f, 67.41f, -10.42f, 99.1f, -30.87f)
                curveToRelative(32.32f, -20.86f, 51.16f, -44.7f, 51.94f, -45.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, -15.89f)
                lineTo(191.0f, 118.0f)
                lineTo(234.7f, 74.29f)
                arcTo(31.86f, 31.86f, 0.0f, false, false, 234.7f, 29.3f)
                close()
                moveTo(143.87f, 177.36f)
                curveTo(113.0f, 197.12f, 81.28f, 206.0f, 49.28f, 203.74f)
                lineTo(146.0f, 107.0f)
                lineToRelative(19.5f, 19.51f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(18.0f, 18.0f)
                arcTo(216.69f, 216.69f, 0.0f, false, true, 143.87f, 177.36f)
                close()
                moveTo(217.73f, 57.36f)
                lineTo(174.0f, 101.0f)
                lineTo(163.0f, 90.0f)
                lineTo(206.7f, 46.28f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 11.0f, 11.0f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null

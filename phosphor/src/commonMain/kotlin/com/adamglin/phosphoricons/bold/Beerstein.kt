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

public val BoldGroup.Beerstein: ImageVector
    get() {
        if (_beerstein != null) {
            return _beerstein!!
        }
        _beerstein = Builder(name = "Beerstein", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 84.0f)
                lineTo(204.0f, 84.0f)
                lineTo(204.0f, 72.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                horizontalLineToRelative(-9.73f)
                curveTo(137.77f, 17.78f, 121.18f, 12.0f, 104.0f, 12.0f)
                curveTo(66.5f, 12.0f, 36.0f, 38.92f, 36.0f, 72.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(244.0f, 112.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 216.0f, 84.0f)
                close()
                moveTo(104.0f, 36.0f)
                curveToRelative(12.85f, 0.0f, 25.0f, 4.62f, 33.44f, 12.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.3f, 3.33f)
                lineTo(160.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 19.6f, 16.0f)
                lineTo(60.28f, 68.0f)
                curveTo(62.72f, 50.0f, 81.39f, 36.0f, 104.0f, 36.0f)
                close()
                moveTo(180.0f, 204.0f)
                lineTo(60.0f, 204.0f)
                lineTo(60.0f, 92.0f)
                lineTo(180.0f, 92.0f)
                close()
                moveTo(220.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(204.0f, 180.0f)
                lineTo(204.0f, 108.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(108.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(84.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(156.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(132.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _beerstein!!
    }

private var _beerstein: ImageVector? = null

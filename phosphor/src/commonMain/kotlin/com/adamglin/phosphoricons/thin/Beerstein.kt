package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.BeerStein: ImageVector
    get() {
        if (_beerStein != null) {
            return _beerStein!!
        }
        _beerStein = Builder(name = "BeerStein", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 92.0f)
                lineTo(196.0f, 92.0f)
                lineTo(196.0f, 72.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(147.31f, 36.0f)
                curveTo(136.0f, 25.81f, 120.34f, 20.0f, 104.0f, 20.0f)
                curveTo(70.92f, 20.0f, 44.0f, 43.33f, 44.0f, 72.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(184.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(196.0f, 196.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 112.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 92.0f)
                close()
                moveTo(104.0f, 28.0f)
                curveToRelative(14.89f, 0.0f, 29.09f, 5.43f, 39.0f, 14.89f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 145.74f, 44.0f)
                lineTo(160.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 27.71f, 24.0f)
                lineTo(52.22f, 68.0f)
                curveTo(54.62f, 45.61f, 76.92f, 28.0f, 104.0f, 28.0f)
                close()
                moveTo(188.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 76.0f)
                lineTo(188.0f, 76.0f)
                close()
                moveTo(228.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(196.0f, 188.0f)
                lineTo(196.0f, 100.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(100.0f, 104.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(92.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(148.0f, 104.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _beerStein!!
    }

private var _beerStein: ImageVector? = null

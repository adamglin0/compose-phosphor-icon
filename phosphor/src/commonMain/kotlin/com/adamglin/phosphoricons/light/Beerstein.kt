package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Beerstein: ImageVector
    get() {
        if (_beerstein != null) {
            return _beerstein!!
        }
        _beerstein = Builder(name = "Beerstein", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 90.0f)
                lineTo(198.0f, 90.0f)
                lineTo(198.0f, 72.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                lineTo(148.07f, 34.0f)
                curveTo(136.47f, 23.8f, 120.56f, 18.0f, 104.0f, 18.0f)
                curveTo(69.81f, 18.0f, 42.0f, 42.22f, 42.0f, 72.0f)
                lineTo(42.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(184.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 198.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 22.0f, -22.0f)
                lineTo(238.0f, 112.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 216.0f, 90.0f)
                close()
                moveTo(104.0f, 30.0f)
                curveToRelative(14.38f, 0.0f, 28.08f, 5.22f, 37.59f, 14.33f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 145.74f, 46.0f)
                lineTo(160.0f, 46.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 25.29f, 20.0f)
                lineTo(54.52f, 66.0f)
                curveTo(58.0f, 45.67f, 78.86f, 30.0f, 104.0f, 30.0f)
                close()
                moveTo(186.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(56.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(54.0f, 78.0f)
                lineTo(186.0f, 78.0f)
                close()
                moveTo(226.0f, 176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -10.0f, 10.0f)
                lineTo(198.0f, 186.0f)
                lineTo(198.0f, 102.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 10.0f, 10.0f)
                close()
                moveTo(102.0f, 104.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(90.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(150.0f, 104.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
            }
        }
        .build()
        return _beerstein!!
    }

private var _beerstein: ImageVector? = null

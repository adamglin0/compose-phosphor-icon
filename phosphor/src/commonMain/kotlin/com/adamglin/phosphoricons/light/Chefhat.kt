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

public val LightGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 112.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f)
                arcToRelative(54.6f, 54.6f, 0.0f, false, false, -6.52f, 0.4f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -99.0f, 0.0f)
                arcTo(54.6f, 54.6f, 0.0f, false, false, 72.0f, 58.0f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 50.0f, 161.3f)
                lineTo(50.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(192.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(206.0f, 161.3f)
                arcTo(54.07f, 54.07f, 0.0f, false, false, 238.0f, 112.0f)
                close()
                moveTo(194.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(64.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(62.0f, 165.06f)
                arcTo(54.0f, 54.0f, 0.0f, false, false, 72.0f, 166.0f)
                lineTo(184.0f, 166.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 10.0f, -0.94f)
                close()
                moveTo(184.0f, 154.0f)
                lineTo(167.69f, 154.0f)
                lineToRelative(6.13f, -24.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.64f, -2.92f)
                lineTo(155.31f, 154.0f)
                lineTo(134.0f, 154.0f)
                lineTo(134.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(26.0f)
                lineTo(100.69f, 154.0f)
                lineToRelative(-6.87f, -27.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.64f, 2.92f)
                lineTo(88.31f, 154.0f)
                lineTo(72.0f, 154.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, -84.0f)
                curveToRelative(1.0f, 0.0f, 2.0f, 0.0f, 2.92f, 0.11f)
                arcTo(54.63f, 54.63f, 0.0f, false, false, 74.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 84.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(54.63f, 54.63f, 0.0f, false, false, -0.92f, -9.89f)
                curveToRelative(1.0f, -0.06f, 1.94f, -0.11f, 2.92f, -0.11f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 0.0f, 84.0f)
                close()
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null

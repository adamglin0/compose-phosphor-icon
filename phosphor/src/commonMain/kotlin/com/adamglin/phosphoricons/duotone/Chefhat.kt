package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.ChefHat: ImageVector
    get() {
        if (_chefHat != null) {
            return _chefHat!!
        }
        _chefHat = Builder(name = "ChefHat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(232.0f, 112.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                horizontalLineTo(72.0f)
                arcTo(48.0f, 48.0f, 0.0f, true, true, 82.35f, 65.12f)
                horizontalLineToRelative(0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 91.28f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 232.0f, 112.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 112.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, -56.0f)
                curveToRelative(-1.77f, 0.0f, -3.54f, 0.1f, -5.29f, 0.26f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -101.42f, 0.0f)
                curveTo(75.54f, 56.1f, 73.77f, 56.0f, 72.0f, 56.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 48.0f, 162.59f)
                lineTo(48.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(208.0f, 162.59f)
                arcTo(56.09f, 56.09f, 0.0f, false, false, 240.0f, 112.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(64.0f, 208.0f)
                lineTo(64.0f, 167.42f)
                arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, 0.58f)
                lineTo(184.0f, 168.0f)
                arcToRelative(55.49f, 55.49f, 0.0f, false, false, 8.0f, -0.58f)
                close()
                moveTo(184.0f, 152.0f)
                lineTo(170.25f, 152.0f)
                lineToRelative(5.51f, -22.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f)
                lineTo(153.75f, 152.0f)
                lineTo(136.0f, 152.0f)
                lineTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(24.0f)
                lineTo(102.25f, 152.0f)
                lineToRelative(-6.49f, -25.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.52f, 3.88f)
                lineTo(85.75f, 152.0f)
                lineTo(72.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                lineToRelative(0.58f, 0.0f)
                arcTo(55.21f, 55.21f, 0.0f, false, false, 72.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(55.21f, 55.21f, 0.0f, false, false, -0.58f, -8.0f)
                lineToRelative(0.58f, 0.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _chefHat!!
    }

private var _chefHat: ImageVector? = null

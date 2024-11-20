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

public val DuotoneGroup.GearFine: ImageVector
    get() {
        if (_gearFine != null) {
            return _gearFine!!
        }
        _gearFine = Builder(name = "GearFine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -80.0f, -80.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                lineTo(215.63f, 120.0f)
                arcToRelative(87.27f, 87.27f, 0.0f, false, false, -7.74f, -28.88f)
                lineToRelative(14.18f, -8.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -13.86f)
                lineToRelative(-14.2f, 8.2f)
                arcToRelative(88.78f, 88.78f, 0.0f, false, false, -21.14f, -21.14f)
                lineToRelative(8.2f, -14.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, -8.0f)
                lineToRelative(-8.19f, 14.18f)
                arcTo(87.27f, 87.27f, 0.0f, false, false, 136.0f, 40.37f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 40.37f)
                arcToRelative(87.27f, 87.27f, 0.0f, false, false, -28.88f, 7.74f)
                lineTo(82.93f, 33.93f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.86f, 8.0f)
                lineToRelative(8.2f, 14.2f)
                arcTo(88.78f, 88.78f, 0.0f, false, false, 56.13f, 77.27f)
                lineToRelative(-14.2f, -8.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 13.86f)
                lineToRelative(14.18f, 8.19f)
                arcTo(87.27f, 87.27f, 0.0f, false, false, 40.37f, 120.0f)
                lineTo(24.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(40.37f, 136.0f)
                arcToRelative(87.27f, 87.27f, 0.0f, false, false, 7.74f, 28.88f)
                lineToRelative(-14.18f, 8.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.0f, 14.93f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 4.0f, -1.07f)
                lineToRelative(14.2f, -8.2f)
                arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, 21.14f)
                lineToRelative(-8.2f, 14.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, 8.0f)
                lineToRelative(8.19f, -14.18f)
                arcTo(87.27f, 87.27f, 0.0f, false, false, 120.0f, 215.63f)
                lineTo(120.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 215.63f)
                arcToRelative(87.27f, 87.27f, 0.0f, false, false, 28.88f, -7.74f)
                lineToRelative(8.19f, 14.18f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.86f, -8.0f)
                lineToRelative(-8.2f, -14.2f)
                arcToRelative(88.78f, 88.78f, 0.0f, false, false, 21.14f, -21.14f)
                lineToRelative(14.2f, 8.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 225.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.92f, -10.93f)
                lineToRelative(-14.18f, -8.19f)
                arcTo(87.27f, 87.27f, 0.0f, false, false, 215.63f, 136.0f)
                lineTo(232.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(85.31f, 185.94f)
                arcToRelative(71.92f, 71.92f, 0.0f, false, true, 0.0f, -115.88f)
                lineTo(118.76f, 128.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcTo(71.58f, 71.58f, 0.0f, false, true, 99.16f, 194.0f)
                lineTo(132.62f, 136.0f)
                horizontalLineToRelative(66.92f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 200.0f)
                close()
                moveTo(132.62f, 120.0f)
                lineTo(99.16f, 62.05f)
                arcToRelative(71.94f, 71.94f, 0.0f, false, true, 100.38f, 58.0f)
                close()
            }
        }
        .build()
        return _gearFine!!
    }

private var _gearFine: ImageVector? = null

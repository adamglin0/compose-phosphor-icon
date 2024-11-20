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

public val LightGroup.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 104.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, -54.0f)
                lineTo(134.0f, 50.0f)
                lineTo(134.0f, 48.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, -26.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, 38.0f)
                verticalLineToRelative(2.0f)
                lineTo(80.0f, 50.0f)
                arcToRelative(54.06f, 54.06f, 0.0f, false, false, -54.0f, 54.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 8.0f, 12.63f)
                lineTo(34.0f, 128.0f)
                curveToRelative(0.0f, 34.57f, 32.71f, 60.83f, 59.0f, 81.93f)
                curveToRelative(14.26f, 11.45f, 29.0f, 23.29f, 29.0f, 30.07f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                curveToRelative(0.0f, -6.78f, 14.75f, -18.62f, 29.0f, -30.07f)
                curveToRelative(26.28f, -21.1f, 59.0f, -47.36f, 59.0f, -81.93f)
                lineTo(222.0f, 116.63f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 230.0f, 104.0f)
                close()
                moveTo(80.0f, 62.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 106.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 80.0f, 62.0f)
                close()
                moveTo(155.5f, 200.58f)
                curveToRelative(-11.48f, 9.21f, -21.48f, 17.24f, -27.5f, 25.0f)
                curveToRelative(-6.0f, -7.72f, -16.0f, -15.75f, -27.5f, -25.0f)
                curveTo(76.22f, 181.08f, 46.0f, 156.82f, 46.0f, 128.0f)
                lineTo(46.0f, 118.0f)
                lineTo(210.0f, 118.0f)
                verticalLineToRelative(10.0f)
                curveTo(210.0f, 156.82f, 179.78f, 181.08f, 155.5f, 200.58f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null

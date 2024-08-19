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

public val ThinGroup.Acorn: ImageVector
    get() {
        if (_acorn != null) {
            return _acorn!!
        }
        _acorn = Builder(name = "Acorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 104.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                lineTo(132.0f, 52.0f)
                lineTo(132.0f, 48.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, 36.0f)
                verticalLineToRelative(4.0f)
                lineTo(80.0f, 52.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.0f, 11.3f)
                lineTo(36.0f, 128.0f)
                curveToRelative(0.0f, 33.61f, 32.29f, 59.54f, 58.24f, 80.37f)
                curveTo(109.54f, 220.66f, 124.0f, 232.27f, 124.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                curveToRelative(0.0f, -7.73f, 14.46f, -19.34f, 29.76f, -31.63f)
                curveTo(187.71f, 187.54f, 220.0f, 161.61f, 220.0f, 128.0f)
                lineTo(220.0f, 115.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 104.0f)
                close()
                moveTo(156.75f, 202.13f)
                curveToRelative(-12.51f, 10.05f, -23.23f, 18.65f, -28.75f, 26.79f)
                curveToRelative(-5.52f, -8.14f, -16.24f, -16.74f, -28.75f, -26.79f)
                curveTo(74.63f, 182.37f, 44.0f, 157.78f, 44.0f, 128.0f)
                lineTo(44.0f, 116.0f)
                lineTo(212.0f, 116.0f)
                verticalLineToRelative(12.0f)
                curveTo(212.0f, 157.78f, 181.37f, 182.37f, 156.75f, 202.13f)
                close()
                moveTo(216.0f, 108.0f)
                lineTo(40.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 80.0f, 60.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 108.0f)
                close()
            }
        }
        .build()
        return _acorn!!
    }

private var _acorn: ImageVector? = null

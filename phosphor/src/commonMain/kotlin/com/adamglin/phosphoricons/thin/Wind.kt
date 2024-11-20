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

public val ThinGroup.Wind: ImageVector
    get() {
        if (_wind != null) {
            return _wind!!
        }
        _wind = Builder(name = "Wind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                curveToRelative(-12.09f, 0.0f, -23.76f, -7.83f, -27.75f, -18.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.5f, -2.78f)
                curveTo(134.58f, 198.24f, 143.28f, 204.0f, 152.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                lineTo(40.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(152.0f, 156.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 180.0f, 184.0f)
                close()
                moveTo(148.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -28.0f, -28.0f)
                curveToRelative(-12.09f, 0.0f, -23.76f, 7.83f, -27.75f, 18.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.5f, 2.78f)
                curveTo(102.58f, 57.76f, 111.28f, 52.0f, 120.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(24.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 148.0f, 72.0f)
                close()
                moveTo(208.0f, 76.0f)
                curveToRelative(-12.09f, 0.0f, -23.76f, 7.83f, -27.75f, 18.61f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.5f, 2.78f)
                curveTo(190.58f, 89.76f, 199.28f, 84.0f, 208.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(32.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(208.0f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
            }
        }
        .build()
        return _wind!!
    }

private var _wind: ImageVector? = null

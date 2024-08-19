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

public val LightGroup.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 138.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 92.0f, 138.0f)
                close()
                moveTo(164.0f, 118.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 118.0f)
                close()
                moveTo(152.8f, 162.92f)
                arcToRelative(47.0f, 47.0f, 0.0f, false, true, -49.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.4f, 10.16f)
                arcToRelative(59.0f, 59.0f, 0.0f, false, false, 62.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -6.4f, -10.16f)
                close()
                moveTo(230.0f, 128.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 26.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, true, 230.0f, 128.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.11f, 90.11f, 0.0f, false, false, -87.07f, -89.95f)
                curveTo(118.3f, 55.23f, 118.0f, 71.85f, 118.0f, 72.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                curveToRelative(0.0f, -0.75f, 0.15f, -15.82f, 10.14f, -33.22f)
                arcTo(90.0f, 90.0f, 0.0f, true, false, 218.0f, 128.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null

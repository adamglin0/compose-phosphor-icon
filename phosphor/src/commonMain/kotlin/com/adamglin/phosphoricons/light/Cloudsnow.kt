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

public val LightGroup.Cloudsnow: ImageVector
    get() {
        if (_cloudsnow != null) {
            return _cloudsnow!!
        }
        _cloudsnow = Builder(name = "Cloudsnow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.0f, 196.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 86.0f, 196.0f)
                close()
                moveTo(116.0f, 202.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 116.0f, 202.0f)
                close()
                moveTo(164.0f, 186.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 164.0f, 186.0f)
                close()
                moveTo(68.0f, 226.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 68.0f, 226.0f)
                close()
                moveTo(156.0f, 226.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 156.0f, 226.0f)
                close()
                moveTo(230.0f, 92.0f)
                arcToRelative(74.09f, 74.09f, 0.0f, false, true, -74.0f, 74.0f)
                lineTo(76.0f, 166.0f)
                arcTo(50.0f, 50.0f, 0.0f, true, true, 86.2f, 67.0f)
                arcTo(74.08f, 74.08f, 0.0f, false, true, 230.0f, 92.0f)
                close()
                moveTo(218.0f, 92.0f)
                arcTo(62.06f, 62.06f, 0.0f, false, false, 94.0f, 88.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, -0.7f)
                arcToRelative(75.84f, 75.84f, 0.0f, false, true, 1.07f, -9.0f)
                arcTo(38.0f, 38.0f, 0.0f, true, false, 76.0f, 154.0f)
                horizontalLineToRelative(80.0f)
                arcTo(62.07f, 62.07f, 0.0f, false, false, 218.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudsnow!!
    }

private var _cloudsnow: ImageVector? = null

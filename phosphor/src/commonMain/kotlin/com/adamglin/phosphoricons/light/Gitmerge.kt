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

public val LightGroup.Gitmerge: ImageVector
    get() {
        if (_gitmerge != null) {
            return _gitmerge!!
        }
        _gitmerge = Builder(name = "Gitmerge", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 114.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -29.21f, 23.19f)
                lineToRelative(-44.0f, -6.28f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, -6.18f, -3.39f)
                lineTo(91.18f, 83.83f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 74.0f, 85.4f)
                verticalLineToRelative(85.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(86.0f, 96.22f)
                lineToRelative(33.52f, 39.11f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 13.6f, 7.46f)
                lineToRelative(45.35f, 6.48f)
                arcTo(30.0f, 30.0f, 0.0f, true, false, 208.0f, 114.0f)
                close()
                moveTo(62.0f, 56.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 80.0f, 74.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 62.0f, 56.0f)
                close()
                moveTo(98.0f, 200.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 98.0f, 200.0f)
                close()
                moveTo(208.0f, 162.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 208.0f, 162.0f)
                close()
            }
        }
        .build()
        return _gitmerge!!
    }

private var _gitmerge: ImageVector? = null

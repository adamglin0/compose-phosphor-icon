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

public val LightGroup.Orange: ImageVector
    get() {
        if (_orange != null) {
            return _orange!!
        }
        _orange = Builder(name = "Orange", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.15f, 72.65f)
                arcTo(62.08f, 62.08f, 0.0f, false, false, 198.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(62.08f, 62.08f, 0.0f, false, false, -56.0f, 35.42f)
                arcTo(62.08f, 62.08f, 0.0f, false, false, 72.0f, 10.0f)
                lineTo(64.0f, 10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(50.06f, 50.06f, 0.0f, false, true, 49.66f, 44.26f)
                arcToRelative(85.95f, 85.95f, 0.0f, true, false, 39.49f, 6.39f)
                close()
                moveTo(184.0f, 22.0f)
                horizontalLineToRelative(1.64f)
                arcTo(50.07f, 50.07f, 0.0f, false, true, 136.0f, 66.0f)
                horizontalLineToRelative(-1.64f)
                arcTo(50.07f, 50.07f, 0.0f, false, true, 184.0f, 22.0f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, -74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 226.0f)
                close()
                moveTo(181.92f, 161.0f)
                arcTo(55.48f, 55.48f, 0.0f, false, true, 137.0f, 205.92f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, 0.08f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.0f, -11.92f)
                arcTo(43.29f, 43.29f, 0.0f, false, false, 170.08f, 159.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, 2.0f)
                close()
            }
        }
        .build()
        return _orange!!
    }

private var _orange: ImageVector? = null

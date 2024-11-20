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

public val LightGroup.SlidersHorizontal: ImageVector
    get() {
        if (_slidersHorizontal != null) {
            return _slidersHorizontal!!
        }
        _slidersHorizontal = Builder(name = "SlidersHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 86.0f)
                lineTo(74.6f, 86.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                lineTo(216.0f, 86.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(133.4f, 74.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(40.0f, 74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(104.0f, 62.0f)
                arcTo(18.0f, 18.0f, 0.0f, true, true, 86.0f, 80.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 104.0f, 62.0f)
                close()
                moveTo(216.0f, 170.0f)
                lineTo(197.4f, 170.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -58.8f, 0.0f)
                lineTo(40.0f, 170.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(98.6f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 58.8f, 0.0f)
                lineTo(216.0f, 182.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(168.0f, 194.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 18.0f, -18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 168.0f, 194.0f)
                close()
            }
        }
        .build()
        return _slidersHorizontal!!
    }

private var _slidersHorizontal: ImageVector? = null

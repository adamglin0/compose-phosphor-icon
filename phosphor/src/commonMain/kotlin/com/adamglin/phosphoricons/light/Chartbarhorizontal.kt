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

public val LightGroup.Chartbarhorizontal: ImageVector
    get() {
        if (_chartbarhorizontal != null) {
            return _chartbarhorizontal!!
        }
        _chartbarhorizontal = Builder(name = "Chartbarhorizontal", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 98.0f)
                lineTo(182.0f, 98.0f)
                lineTo(182.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(54.0f, 50.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(42.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 206.0f)
                horizontalLineToRelative(90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(150.0f, 158.0f)
                horizontalLineToRelative(74.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(230.0f, 104.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 98.0f)
                close()
                moveTo(170.0f, 62.0f)
                lineTo(170.0f, 98.0f)
                lineTo(54.0f, 98.0f)
                lineTo(54.0f, 62.0f)
                close()
                moveTo(138.0f, 194.0f)
                lineTo(54.0f, 194.0f)
                lineTo(54.0f, 158.0f)
                horizontalLineToRelative(84.0f)
                close()
                moveTo(218.0f, 146.0f)
                lineTo(54.0f, 146.0f)
                lineTo(54.0f, 110.0f)
                lineTo(218.0f, 110.0f)
                close()
            }
        }
        .build()
        return _chartbarhorizontal!!
    }

private var _chartbarhorizontal: ImageVector? = null

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

public val LightGroup.Closedcaptioning: ImageVector
    get() {
        if (_closedcaptioning != null) {
            return _closedcaptioning!!
        }
        _closedcaptioning = Builder(name = "Closedcaptioning", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 50.0f)
                lineTo(32.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 64.0f)
                lineTo(18.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 50.0f)
                close()
                moveTo(226.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(32.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(30.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(224.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(117.19f, 152.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.19f, 8.2f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 0.0f, -65.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, 10.38f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 0.0f, 45.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 117.19f, 152.71f)
                close()
                moveTo(197.19f, 152.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.19f, 8.2f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 0.0f, -65.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.0f, 10.38f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 0.0f, 45.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 197.19f, 152.71f)
                close()
            }
        }
        .build()
        return _closedcaptioning!!
    }

private var _closedcaptioning: ImageVector? = null

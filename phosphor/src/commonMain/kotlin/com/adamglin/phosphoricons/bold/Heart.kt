package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.0f, 36.0f)
                curveToRelative(-20.09f, 0.0f, -37.92f, 7.93f, -50.0f, 21.56f)
                curveTo(115.92f, 43.93f, 98.09f, 36.0f, 78.0f, 36.0f)
                arcToRelative(66.08f, 66.08f, 0.0f, false, false, -66.0f, 66.0f)
                curveToRelative(0.0f, 72.34f, 105.81f, 130.14f, 110.31f, 132.57f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.38f, 0.0f)
                curveTo(138.19f, 232.14f, 244.0f, 174.34f, 244.0f, 102.0f)
                arcTo(66.08f, 66.08f, 0.0f, false, false, 178.0f, 36.0f)
                close()
                moveTo(172.51f, 178.36f)
                arcTo(328.69f, 328.69f, 0.0f, false, true, 128.0f, 210.16f)
                arcToRelative(328.69f, 328.69f, 0.0f, false, true, -44.51f, -31.8f)
                curveTo(61.82f, 159.77f, 36.0f, 131.42f, 36.0f, 102.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 78.0f, 60.0f)
                curveToRelative(17.8f, 0.0f, 32.7f, 9.4f, 38.89f, 24.54f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.22f, 0.0f)
                curveTo(145.3f, 69.4f, 160.2f, 60.0f, 178.0f, 60.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, 42.0f)
                curveTo(220.0f, 131.42f, 194.18f, 159.77f, 172.51f, 178.36f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null

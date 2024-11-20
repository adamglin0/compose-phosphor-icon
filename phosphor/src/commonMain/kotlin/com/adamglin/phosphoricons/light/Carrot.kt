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

public val LightGroup.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 66.0f)
                lineTo(198.48f, 66.0f)
                lineToRelative(29.76f, -29.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.48f, -8.48f)
                lineTo(190.0f, 57.52f)
                lineTo(190.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(178.0f, 60.15f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, -77.8f, 8.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                curveTo(60.17f, 107.4f, 30.05f, 201.45f, 27.38f, 210.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 18.67f, 18.67f)
                curveToRelative(8.5f, -2.67f, 102.62f, -32.81f, 141.79f, -72.77f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 8.0f, -77.84f)
                lineTo(232.0f, 78.06f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(179.31f, 147.41f)
                curveTo(170.0f, 157.0f, 157.0f, 166.0f, 142.69f, 174.24f)
                lineToRelative(-26.46f, -26.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.49f, 8.49f)
                lineToRelative(24.0f, 24.0f)
                curveToRelative(-41.69f, 22.0f, -89.0f, 36.82f, -89.73f, 37.0f)
                arcToRelative(6.57f, 6.57f, 0.0f, false, false, -1.06f, 0.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.7f, -2.7f)
                arcTo(6.57f, 6.57f, 0.0f, false, false, 38.7f, 214.0f)
                curveTo(39.0f, 213.0f, 67.55f, 121.72f, 104.48f, 81.0f)
                lineToRelative(35.27f, 35.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.48f, -8.48f)
                lineToRelative(-35.1f, -35.1f)
                arcToRelative(50.0f, 50.0f, 0.0f, false, true, 66.18f, 74.74f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null

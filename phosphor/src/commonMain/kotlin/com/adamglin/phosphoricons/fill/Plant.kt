package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Plant: ImageVector
    get() {
        if (_plant != null) {
            return _plant!!
        }
        _plant = Builder(name = "Plant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.41f, 159.07f)
                arcToRelative(60.9f, 60.9f, 0.0f, false, true, -31.83f, 8.86f)
                arcToRelative(71.71f, 71.71f, 0.0f, false, true, -27.36f, -5.66f)
                arcTo(55.55f, 55.55f, 0.0f, false, false, 136.0f, 194.51f)
                verticalLineTo(224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.53f, 8.0f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, true, -7.47f, -8.25f)
                verticalLineTo(211.31f)
                lineTo(81.38f, 172.69f)
                arcTo(52.5f, 52.5f, 0.0f, false, true, 63.44f, 176.0f)
                arcToRelative(45.82f, 45.82f, 0.0f, false, true, -23.92f, -6.67f)
                curveTo(17.73f, 156.09f, 6.0f, 125.62f, 8.27f, 87.79f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.52f, -7.52f)
                curveToRelative(37.83f, -2.23f, 68.3f, 9.46f, 81.5f, 31.25f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 103.74f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.89f, 2.43f)
                lineToRelative(-19.2f, -20.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, 11.31f)
                lineToRelative(53.88f, 55.25f)
                curveToRelative(0.06f, -0.78f, 0.13f, -1.56f, 0.21f, -2.33f)
                arcToRelative(68.56f, 68.56f, 0.0f, false, true, 18.64f, -39.46f)
                lineToRelative(50.59f, -53.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.31f, -11.32f)
                lineToRelative(-49.0f, 51.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.78f, -1.74f)
                curveToRelative(-4.74f, -17.48f, -2.65f, -34.88f, 6.4f, -49.82f)
                curveToRelative(17.86f, -29.48f, 59.42f, -45.26f, 111.18f, -42.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.52f, 7.52f)
                curveTo(250.67f, 99.65f, 234.89f, 141.21f, 205.41f, 159.07f)
                close()
            }
        }
        .build()
        return _plant!!
    }

private var _plant: ImageVector? = null

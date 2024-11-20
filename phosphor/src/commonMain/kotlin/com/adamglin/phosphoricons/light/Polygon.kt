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

public val LightGroup.Polygon: ImageVector
    get() {
        if (_polygon != null) {
            return _polygon!!
        }
        _polygon = Builder(name = "Polygon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.23f, 50.78f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -42.44f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(29.82f, 29.82f, 0.0f, false, false, -5.56f, 7.69f)
                lineToRelative(-31.31f, -8.54f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 98.78f, 26.77f)
                horizontalLineToRelative(0.0f)
                arcTo(30.09f, 30.09f, 0.0f, false, false, 94.13f, 63.2f)
                lineTo(57.83f, 95.87f)
                arcToRelative(30.07f, 30.07f, 0.0f, false, false, -39.06f, 2.91f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 41.38f, 43.44f)
                lineToRelative(72.6f, 53.25f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, 48.47f, -8.68f)
                arcToRelative(29.65f, 29.65f, 0.0f, false, false, -5.77f, -4.5f)
                lineToRelative(28.44f, -80.59f)
                arcTo(31.57f, 31.57f, 0.0f, false, false, 208.0f, 102.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 21.22f, -51.2f)
                close()
                moveTo(107.23f, 35.26f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, 25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 107.27f, 35.26f)
                close()
                moveTo(27.23f, 132.73f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 25.46f, 0.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 27.26f, 132.73f)
                close()
                moveTo(172.7f, 220.73f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 172.73f, 220.74f)
                close()
                moveTo(164.09f, 178.3f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -24.27f, 7.48f)
                lineTo(67.24f, 132.54f)
                arcToRelative(30.14f, 30.14f, 0.0f, false, false, -1.38f, -27.75f)
                lineToRelative(36.3f, -32.67f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 44.62f, -10.61f)
                lineToRelative(31.31f, 8.54f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 8.7f, 23.16f)
                arcToRelative(30.47f, 30.47f, 0.0f, false, false, 5.78f, 4.51f)
                close()
                moveTo(220.71f, 84.71f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, 0.0f, -25.46f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 220.74f, 84.72f)
                close()
            }
        }
        .build()
        return _polygon!!
    }

private var _polygon: ImageVector? = null

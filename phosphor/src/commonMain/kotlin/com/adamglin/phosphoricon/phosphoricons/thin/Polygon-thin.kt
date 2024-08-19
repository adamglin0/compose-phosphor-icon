package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Polygon-thin`: ImageVector
    get() {
        if (`_polygon-thin` != null) {
            return `_polygon-thin`!!
        }
        `_polygon-thin` = Builder(name = "Polygon-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.81f, 52.19f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, false, -5.88f, 8.65f)
                lineToRelative(-34.56f, -9.42f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 100.2f, 28.19f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, false, -3.48f, 35.37f)
                lineTo(57.91f, 98.49f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -37.72f, 1.71f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 39.6f)
                lineToRelative(0.18f, -0.19f)
                lineToRelative(75.32f, 55.24f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 173.0f, 183.2f)
                lineToRelative(29.56f, -83.75f)
                arcTo(28.52f, 28.52f, 0.0f, false, false, 208.0f, 100.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 19.8f, -47.79f)
                close()
                moveTo(105.86f, 33.85f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, 28.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 105.86f, 33.85f)
                close()
                moveTo(25.86f, 134.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 28.28f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 25.85f, 134.14f)
                close()
                moveTo(174.16f, 222.14f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.28f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 174.15f, 222.15f)
                close()
                moveTo(165.46f, 180.54f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -25.25f, 7.66f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.18f, 0.19f)
                lineTo(64.71f, 133.16f)
                arcToRelative(28.13f, 28.13f, 0.0f, false, false, -1.44f, -28.73f)
                lineTo(102.08f, 69.5f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 43.6f, -10.36f)
                lineToRelative(34.56f, 9.43f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 8.0f, 23.22f)
                arcToRelative(27.64f, 27.64f, 0.0f, false, false, 6.8f, 5.0f)
                close()
                moveTo(222.16f, 86.13f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 0.0f, -28.29f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 222.15f, 86.14f)
                close()
            }
        }
        .build()
        return `_polygon-thin`!!
    }

private var `_polygon-thin`: ImageVector? = null

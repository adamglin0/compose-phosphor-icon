package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Crown-simple-light`: ImageVector
    get() {
        if (`_crown-simple-light` != null) {
            return `_crown-simple-light`!!
        }
        `_crown-simple-light` = Builder(name = "Crown-simple-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 75.4f)
                arcToRelative(13.87f, 13.87f, 0.0f, false, false, -16.52f, 3.34f)
                lineToRelative(-35.74f, 38.52f)
                lineTo(140.71f, 34.13f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -25.45f, 0.07f)
                lineToRelative(-37.0f, 83.06f)
                lineTo(42.48f, 78.74f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.22f, 90.46f)
                curveToRelative(0.0f, 0.08f, 0.0f, 0.16f, 0.05f, 0.24f)
                lineTo(41.0f, 194.57f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 54.71f, 206.0f)
                horizontalLineTo(201.29f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.76f, -11.43f)
                lineTo(237.73f, 90.7f)
                curveToRelative(0.0f, -0.08f, 0.0f, -0.16f, 0.05f, -0.24f)
                arcTo(13.89f, 13.89f, 0.0f, false, false, 230.0f, 75.4f)
                close()
                moveTo(226.0f, 88.29f)
                lineTo(203.31f, 192.11f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.05f, 0.24f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.65f)
                horizontalLineTo(54.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -1.65f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.05f, -0.24f)
                lineTo(30.0f, 88.29f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 1.12f, -2.06f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 2.36f, 0.48f)
                lineToRelative(0.12f, 0.13f)
                lineToRelative(42.0f, 45.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.88f, -1.64f)
                lineToRelative(40.7f, -91.28f)
                arcTo(1.92f, 1.92f, 0.0f, false, true, 128.0f, 38.0f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, true, 1.78f, 1.09f)
                lineToRelative(40.74f, 91.35f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.88f, 1.64f)
                lineToRelative(42.0f, -45.24f)
                lineToRelative(0.12f, -0.13f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 2.36f, -0.48f)
                arcTo(1.82f, 1.82f, 0.0f, false, true, 226.0f, 88.29f)
                close()
            }
        }
        .build()
        return `_crown-simple-light`!!
    }

private var `_crown-simple-light`: ImageVector? = null

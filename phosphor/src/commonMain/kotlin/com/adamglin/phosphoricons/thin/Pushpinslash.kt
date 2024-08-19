package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Pushpinslash: ImageVector
    get() {
        if (_pushpinslash != null) {
            return _pushpinslash!!
        }
        _pushpinslash = Builder(name = "Pushpinslash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(75.35f, 76.0f)
                curveToRelative(-9.93f, 0.88f, -22.26f, 4.54f, -34.87f, 14.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.0f, 17.84f)
                lineToRelative(51.13f, 51.13f)
                lineTo(45.17f, 205.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(45.46f, -45.47f)
                lineToRelative(51.12f, 51.12f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 155.9f, 220.0f)
                curveToRelative(0.28f, 0.0f, 0.57f, 0.0f, 0.85f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.73f, -4.74f)
                arcToRelative(81.06f, 81.06f, 0.0f, false, false, 13.19f, -25.55f)
                lineToRelative(26.37f, 29.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(159.08f, 210.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.0f, 0.4f)
                lineTo(45.17f, 102.93f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.33f, -6.0f)
                curveToRelative(14.08f, -11.36f, 27.62f, -13.5f, 37.0f, -13.12f)
                lineToRelative(89.69f, 98.65f)
                curveTo(170.07f, 193.92f, 164.0f, 203.92f, 159.08f, 210.42f)
                close()
                moveTo(232.49f, 101.17f)
                lineTo(187.85f, 146.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.67f, -5.64f)
                lineToRelative(44.65f, -44.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineTo(166.15f, 29.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(119.27f, 70.53f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.67f, -5.65f)
                lineToRelative(41.23f, -41.36f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineTo(232.49f, 84.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 101.17f)
                close()
            }
        }
        .build()
        return _pushpinslash!!
    }

private var _pushpinslash: ImageVector? = null

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

public val LightGroup.`Thumbs-up-light`: ImageVector
    get() {
        if (`_thumbs-up-light` != null) {
            return `_thumbs-up-light`!!
        }
        `_thumbs-up-light` = Builder(name = "Thumbs-up-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 81.44f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 216.0f, 74.0f)
                horizontalLineTo(158.0f)
                verticalLineTo(56.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, -38.0f, -38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.37f, 3.32f)
                lineTo(76.29f, 98.0f)
                horizontalLineTo(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(204.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 21.83f, -19.27f)
                lineToRelative(12.0f, -96.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 232.49f, 81.44f)
                close()
                moveTo(30.0f, 200.0f)
                verticalLineTo(112.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(74.0f)
                verticalLineToRelative(92.0f)
                horizontalLineTo(32.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 200.0f)
                close()
                moveTo(225.92f, 97.24f)
                lineToRelative(-12.0f, 96.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 204.0f, 202.0f)
                horizontalLineTo(86.0f)
                verticalLineTo(105.42f)
                lineToRelative(37.58f, -75.17f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 146.0f, 56.0f)
                verticalLineTo(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 9.92f, 11.24f)
                close()
            }
        }
        .build()
        return `_thumbs-up-light`!!
    }

private var `_thumbs-up-light`: ImageVector? = null

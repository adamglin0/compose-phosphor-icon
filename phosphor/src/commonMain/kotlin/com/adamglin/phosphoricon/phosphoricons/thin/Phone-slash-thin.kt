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

public val ThinGroup.`Phone-slash-thin`: ImageVector
    get() {
        if (`_phone-slash-thin` != null) {
            return `_phone-slash-thin`!!
        }
        `_phone-slash-thin` = Builder(name = "Phone-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, true, false, 45.0f, 42.69f)
                lineTo(76.52f, 77.32f)
                arcTo(137.72f, 137.72f, 0.0f, false, false, 27.21f, 109.0f)
                curveTo(8.69f, 127.53f, 6.9f, 154.83f, 22.85f, 175.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.83f, 3.77f)
                lineToRelative(49.0f, -17.39f)
                lineToRelative(0.15f, -0.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.31f, -8.79f)
                lineToRelative(5.9f, -29.51f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, 2.51f, -3.0f)
                arcToRelative(79.44f, 79.44f, 0.0f, false, true, 11.4f, -3.0f)
                lineToRelative(92.07f, 101.26f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(99.0f, 112.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.72f, 9.0f)
                lineToRelative(-5.9f, 29.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.37f, 2.9f)
                lineToRelative(-49.0f, 17.38f)
                lineToRelative(-0.15f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.61f, -1.21f)
                curveToRelative(-13.42f, -17.29f, -11.9f, -40.25f, 3.69f, -55.84f)
                arcTo(130.06f, 130.06f, 0.0f, false, true, 82.33f, 83.72f)
                lineToRelative(24.44f, 26.88f)
                quadTo(102.8f, 111.58f, 98.94f, 112.91f)
                close()
                moveTo(233.15f, 175.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -13.83f, 3.77f)
                lineToRelative(-9.31f, -3.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.68f, -7.54f)
                lineToRelative(9.37f, 3.32f)
                lineToRelative(0.15f, 0.06f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.61f, -1.21f)
                curveToRelative(13.42f, -17.29f, 11.9f, -40.25f, -3.69f, -55.84f)
                curveTo(196.66f, 88.2f, 159.34f, 74.18f, 120.72f, 76.19f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -0.41f, -8.0f)
                curveToRelative(40.86f, -2.12f, 80.41f, 12.74f, 108.48f, 40.8f)
                curveTo(247.31f, 127.53f, 249.1f, 154.83f, 233.15f, 175.4f)
                close()
            }
        }
        .build()
        return `_phone-slash-thin`!!
    }

private var `_phone-slash-thin`: ImageVector? = null
